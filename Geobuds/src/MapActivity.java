import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Activity for displaying a Google Map and managing markers for posts.
 * This class integrates the map setup and post marker management, handling the display
 * of posts on a map and interacting with them.
 */
public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
	private GoogleMap mMap;
	private FirebasePostRepository postRepository = new FirebasePostRepository();
	private PostMarkerManager postMarkerManager;

	/**
	 * Called when the activity is starting. This is where most initialization should go:
	 * calling setContentView(int) to inflate the activity's UI, using findViewById(int)
	 * to programmatically interact with widgets in the UI.
	 * @param savedInstanceState If the activity is being re-initialized after
	 * previously being shut down then this Bundle contains the most recent data supplied
	 * by onSaveInstanceState(Bundle). Otherwise it is null.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		initializeMap();
	}

	/**
	 * Initializes the map fragment asynchronously and sets the map ready callback to this activity.
	 */
	private void initializeMap() {
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
		if (mapFragment != null) {
			mapFragment.getMapAsync(this);
		} else {
			// Log error if mapFragment is null
			Log.e(TAG, "Failed to get map fragment");
		}
	}

	/**
	 * This method is triggered when the map is ready to be used and provides the GoogleMap object.
	 * @param googleMap The GoogleMap object that will be used for adding markers and other map operations.
	 */
	@Override
	public void onMapReady(GoogleMap googleMap) {
		mMap = googleMap;
		postMarkerManager = new PostMarkerManager(mMap, new PostDetailsDisplayHandler(this));
		loadPostsAndAddMarkers();
	}

	/**
	 * Fetches all posts from the repository and adds markers to the map for each post.
	 * Also sets up the marker interaction after all posts are loaded.
	 */
	private void loadPostsAndAddMarkers() {
		postRepository.fetchAllPosts(posts -> {
			if (posts != null) {
				for (Post post : posts) {
					postMarkerManager.addPostMarker(post);
				}
				postMarkerManager.setupMarkerInteraction();
			} else {
				// Log error if posts are null or the fetch was unsuccessful
				Log.e(TAG, "No posts found or error fetching posts");
			}
		});
	}
}

