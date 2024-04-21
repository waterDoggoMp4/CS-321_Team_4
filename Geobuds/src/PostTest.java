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

    @Test(expected = IllegalArgumentException.class)
    public void test_invalidLongitude(){
        Post post = new Post("message", 1, -1.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_invalidLatitude(){
        Post post = new Post("message", 1, 1.0, -1.0);
    }

    public static void main(String args[]){
        System.out.print(test_postConstructor());
         System.out.print(test_invalidLonitude());
    }
}
