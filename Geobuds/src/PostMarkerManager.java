import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Manages markers for posts on a Google Map.
 */
public class PostMarkerManager {
	private GoogleMap googleMap;
	// Interface for whatever handler we want to put in. So far, only post details is supported. 
	private MapInteractionHandler interactionHandler;

	/**
	 * Initializes a new instance of PostMarkerManager.
	 *
	 * @param googleMap The GoogleMap to which markers are added.
	 * @param interactionHandler Handler for interactions with map markers.
	 */
	public PostMarkerManager(GoogleMap googleMap, MapInteractionHandler interactionHandler) {
		this.googleMap = googleMap;
		this.interactionHandler = interactionHandler;
	}

	/**
	 * Adds a marker to the map based on the post's location.
	 *
	 * @param post The post for which to add a marker.
	 */
	public void addPostMarker(Post post) {
		LatLng position = new LatLng(post.getLatitude(), post.getLongitude());
		MarkerOptions markerOptions = new MarkerOptions().position(position).title(post.getTitle()).snippet(post.getDescription());
		googleMap.addMarker(markerOptions).setTag(post);
	}

	/**
	 * Configures the map to handle marker interactions using the provided MapInteractionHandler.
	 */
	public void setupMarkerInteraction() {
		googleMap.setOnMarkerClickListener(marker -> {
			Post post = (Post) marker.getTag();
			return interactionHandler.handleMapInteraction(post);
		});
	}
}

