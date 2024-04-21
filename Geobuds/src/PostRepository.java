import java.util.List;

/**
 * Interface to support modularity for implementating a post repository.
 * So far, only Firebase is supported, but this implementation is used in case
 * new ones are added */
public interface PostRepository {
    void savePost(Post post); // Saves a post to the database
    List<Post> fetchAllPosts(); // Retrieves all posts from the database
    List<Post> fetchPostsNearLocation(double latitude, double longitude); // Retrieves posts near a specific location
}

