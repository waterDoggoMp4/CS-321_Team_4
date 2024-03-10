import static org.junit.Assert.*;
import org.junit.Test;
public class PostTest {

    @Test
    public void test_postConstructor(){
        Post post = new Post( "message", 1, 0.0, 0.0);
        assertEquals(1, post.getPostId());
        assertEquals(post.getDescription(), "message");
        assertEquals(0.0, post.getLatitude(), 0.0);
        assertEquals(0.0, post.getLongitude(), 0.0);
        assertNotNull(post.getTimestamp());
    }
}
