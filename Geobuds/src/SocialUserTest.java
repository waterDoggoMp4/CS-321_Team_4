import static org.junit.Assert.*;
import org.junit.Test;
public class SocialUserTest {

    @Test
    public void test_socialUserConstructor(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        assertEquals("name", user.getName());
        assertEquals(1, user.getUid());
        assertEquals("", user.getPassword());
        assertArrayEquals(new String[]{"bio"}, user.getBio());
        assertEquals(0.0, user.getLatitude(), 0.0);
        assertEquals(0.0, user.getLongitude(), 0.0);
        assertTrue(user.getFriend(1) == null); // Check if friends list is empty
    }
    @Test
    public void test_addFriend(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        SocialUser friend = new SocialUser("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, null);
        assertTrue(user.addFriend(friend));
    }

    @Test
    public void test_addFriend_nullFriend(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        SocialUser friend = null;
        assertFalse(user.addFriend(friend));
    }

    @Test (expected = NullPointerException.class)
    public void test_addFriend_nullUser(){
        SocialUser user = null;
        SocialUser friend = new SocialUser("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, null);
        assertFalse(user.addFriend(friend));
    }

    @Test
    public void test_removeFriend(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        SocialUser friend = new SocialUser("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, null);
        user.addFriend(friend);
        assertTrue(user.removeFriend(friend));
    }

    @Test
    public void test_removeFriend_nullFriend(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        SocialUser friend = null;
        assertFalse(user.removeFriend(friend));
    }

    @Test (expected = NullPointerException.class)
    public void test_removeFriend_nullUser(){
        SocialUser user = null;
        SocialUser friend = new SocialUser("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, null);
        assertFalse(user.removeFriend(friend));
    }

    @Test
    public void test_getFriend(){
        SocialUser user = new SocialUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, null);
        SocialUser friend = new SocialUser("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, null);
        user.addFriend(friend);
        assertEquals(friend, user.getFriend(2));
    }

}