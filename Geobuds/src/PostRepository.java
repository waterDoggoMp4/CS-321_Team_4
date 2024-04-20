import java.util.List;

public interface PostRepository {
    void savePost(Post post); // Saves a post to the database
    List<Post> fetchAllPosts(); // Retrieves all posts from the database
    List<Post> fetchPostsNearLocation(double latitude, double longitude); // Retrieves posts near a specific location
}

