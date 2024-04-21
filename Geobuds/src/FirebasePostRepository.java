import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Repository that manages posts on Firebase and its operations.
 */
public class FirebasePostRepository implements PostRepository {
	private FirebaseFirestore db = FirebaseFirestore.getInstance();

	//Note: callback will always be a parameter to support modularity to add features later to differentiate responses of different operations.

	/**
	 * @param post Post to save
	 * @param callback The callback to handle the response of the save operation.
	 */
	@Override
	public void savePost(Post post, FirestoreCallback callback)
		// Hash map that maps all features to the post instance variables
		Map<String, Object> postFeatures = new HashMap<>();
		postFeatures.put("title", postFeatures.getTitle());
		postFeatures.put("description", postFeatures.getDescription());
		postFeatures.put("latitude", postFeatures.getLatitude());
		postFeatures.put("longitude", postFeatures.getLongitude());
		postFeatures.put("eventTime", postFeatures.getTimestamp());
		postFeatures.put("geohash", postFeatures.getGeohash());

		// Documents post and saves it to firebase 
		db.collection("posts").document(post.getId())
			.set(postFeatures) // Grabs the hash map and adds all its features to the post
			.addOnSuccessListener(aVoid -> callback.onSuccess(null)); //Successful operation handler
			.addOnFailureListener(e -> {
				callback.onFailure(e);
			        throw new RuntimeException("Critical failure in saving post", e);
			});	//Failed operation handler
	}

	/**
	 * Gets all posts from Firebase. 
	 * @param callback The callback to handle the response of the fetch operation.
	 */
	@Override
	public void fetchAllPosts(FirestoreCallback callback) {
		// Fetches all documents from the "posts" collection
		db.collection("posts").get()
			.addOnSuccessListener(queryDocumentSnapshots -> {
					List<Post> posts = queryDocumentSnapshots.toObjects(Post.class);
					callback.onSuccess(posts); // Pass the fetched posts to onSuccess
					})
			.addOnFailureListener(e -> {

					callback.onFailure(e);
					throw new RuntimeException("Critical failure for fetching post", e);
			}); // Directly call onFailure with the exception;
	}


	/**
         * Gets all posts from Firebase from specified location. 
	 * @param latitude Latitude.
	 * @param longitude Longitude.
         * @param callback The callback to handle the response of the fetch operation.
	 * @param geoRange The specified range surrounding the location (Box shaped).
         */
	@Override
	public void fetchPostsNearLocation(double latitude, double longitude, FirestoreCallback callback, double geoRange) {

		// Query Firestore for posts within a simple bounding box (naive approximation)
		db.collection("posts")
			// Sets up range to add posts from. 
			.whereGreaterThanOrEqualTo("latitude", latitude - geoRange)
			.whereLessThanOrEqualTo("latitude", latitude + geoRange)
			.whereGreaterThanOrEqualTo("longitude", longitude - geoRange)
			.whereLessThanOrEqualTo("longitude", longitude + geoRange)
			.get()
			// Success and Error handling.
			.addOnSuccessListener(queryDocumentSnapshots -> {
				List<Post> posts = queryDocumentSnapshots.toObjects(Post.class);
				callback.onSuccess(posts); // Return the posts found near the specified location
			})
			.addOnFailureListener(e -> {
					//Anroid failure log
					callback.onFailure(e)
					//Java failure log
					throw new RuntimeException("Critical failure for fetching post", e);
			}); // Handle potential errors
	}

}

