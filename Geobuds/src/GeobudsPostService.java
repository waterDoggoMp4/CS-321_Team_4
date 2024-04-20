import java.util.List;

public class GeobudsPostService implements PostService {
    private PostRepository postRepository;

    // Constructor injecting a PostRepository instance
    public SimplePostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void createPost(Post post) {
        postRepository.savePost(post); // Delegates to the repository to save the post
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.fetchAllPosts(); // Delegates to the repository to fetch all posts
    }

    @Override
    public List<Post> getNearbyPosts(double latitude, double longitude) {
        return postRepository.fetchPostsNearLocation(latitude, longitude); // Delegates to the repository to fetch nearby posts
    }
}

