/**
 * Interface for handling interactions with map markers associated with posts.
 */
public interface MapInteractionHandler {
    /**
     * Handles interaction with a map marker associated with a post. As of now, there is only implementation
     * of displaying post details, however further implementations will include opening a detailed view, or 
     * other user interactions.
     *
     * @param post The post associated with the marker.
     * @return boolean True if the interaction is handled, false otherwise.
     */
    boolean handleMapInteraction(Post post);
}

