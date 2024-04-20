import java.util.List;

public interface PostService {
    void createPost(Post post); // Creates a new post
    List<Post> getAllPosts(); // Retrieves all posts
    List<Post> getNearbyPosts(double latitude, double longitude); // Retrieves nearby posts based on location
}

