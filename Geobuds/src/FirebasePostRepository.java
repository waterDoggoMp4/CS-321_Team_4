import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class FirebasePostRepository implements PostRepository {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Overridex
    public void savePost(Post post) {
	Map<String, Object> postFeatures = new HashMap<>();
	postFeatures.put("title", postFeatures.getTitle());
	postFeatures.put("description", postFeatures.getDescription());
	postFeatures.put("latitude", postFeatures.getLatitude());
	postFeatures.put("longitude", postFeatures.getLongitude());
	postFeatures.put("eventTime", postFeatures.getTimestamp());
	postFeatures.put("geohash", postFeatures.getGeohash());
	
        db.collection("posts").document(post.getId()) // Saving post to Firebase Firestore
		.set(postFeatures); // Putting the hashmap of features on db
    }

    @Override
    public List<Post> fetchAllPosts() {
        List<Post> posts = new ArrayList<>();
        db.collection("posts").get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                task.getResult().forEach(document -> {
                    posts.add(document.toObject(Post.class)); // Converting Firebase documents to Post objects
                });
            } else {
		
            }
        });
        return posts;
    }

    @Override
    public List<Post> fetchPostsNearLocation(double latitude, double longitude) {
        // Implementing geolocation query, which would need GeoFirestore or similar library to handle
	
        return new ArrayList<>();
    }
}

