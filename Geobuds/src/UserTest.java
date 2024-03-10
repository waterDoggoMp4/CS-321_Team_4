import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
public class UserTest {

    @Test
    public void test_userConstructor(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        assertEquals("name", user.getName());
        assertEquals(1, user.getUid());
        assertEquals("", user.getPassword());
        assertArrayEquals(new String[]{"bio"}, user.getBio());
        assertEquals(0.0, user.getLatitude(), 0.0);
        assertEquals(0.0, user.getLongitude(), 0.0);
        assertTrue(user.getBlockedUsers().isEmpty());
    }

    @Test
    public void test_updateBio() {
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String[] bio = new String[]{"new bio"};
        assertTrue(user.updateBio(user, bio));
    }

    @Test
    public void test_updateBio_null() {
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String[] bio = null;
        assertFalse(user.updateBio(user, bio));
    }

    @Test (expected = NullPointerException.class)
    public void test_updateBio_nullUser(){
        User user = null;
        String[] bio = new String[]{"new bio"};
        user.updateBio(user, bio);
    }

    @Test
    public void test_updateName(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String name = "new name";
        assertTrue(user.updateName(user, name));
    }

    @Test
    public void test_updateName_nullName(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String name = null;
        assertFalse(user.updateName(user, name));
    }

    @Test (expected = NullPointerException.class)
    public void test_updateName_nullUser(){
        User user = null;
        String name = "new name";
        user.updateName(user, name);
    }

    @Test
    public void blockUser(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = new User("blocked", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        user.blockUser(blockedUser);
        assertTrue(user.getBlockedUsers().contains(blockedUser));
    }

    @Test
    public void blockUser_null(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = null;
        user.blockUser(blockedUser);
        assertFalse(user.getBlockedUsers().contains(blockedUser));
    }

    @Test (expected = NullPointerException.class)
    public void blockUser_nullUser(){
        User user = null;
        User blockedUser = new User("blocked", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        user.blockUser(blockedUser);
    }

    @Test
    public void test_unblockUser(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = new User("blocked", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        user.unblockUser(blockedUser);
        assertFalse(user.getBlockedUsers().contains(blockedUser));
    }

    @Test
    public void test_unblockUser_nullBlockedUser(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = null;
        user.unblockUser(blockedUser);
        assertFalse(user.getBlockedUsers().contains(blockedUser));
    }

    @Test (expected = NullPointerException.class)
    public void test_unblockUser_nullUser(){
        User user = null;
        User blockedUser = new User("blocked", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        user.unblockUser(blockedUser);
    }

    @Test
    public void test_messageUser(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User friend = new User("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = new Message(1, "message");
        user.messageUser(friend, message);
        assertTrue(user.getMessages().contains(message));
    }

    @Test
    public void test_messageUser_nullFriend(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User friend = null;
        Message message = new Message(1, "message");
        user.messageUser(friend, message);
        assertFalse(user.getMessages().contains(message));
    }

    @Test
    public void test_messageUser_nullMessage(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User friend = new User("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = null;
        user.messageUser(friend, message);
        assertFalse(user.getMessages().contains(message));
    }

    @Test (expected = NullPointerException.class)
    public void test_messageUser_nullUser(){
        User user = null;
        User friend = new User("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = new Message(1, "message");
        user.messageUser(friend, message);
    }

    @Test
    public void test_receiveMessage(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User friend = new User("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = new Message(1, "message");
        friend.messageUser(user, message);
        assertTrue(friend.receiveMessage(message));
    }

    @Test
    public void test_receiveMessage_nullMessage(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = null;
        assertFalse(user.receiveMessage(message));
    }

    @Test (expected = NullPointerException.class)
    public void test_receiveMessage_nullUser(){
        User user = null;
        User friend = new User("friend", 2, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Message message = new Message(1, "message");
        assertFalse(user.receiveMessage(message));
    }

    @Test
    public void test_post(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Post post = new Post("post", 1, 0.0, 0.0);
        user.post(post);
        assertTrue(user.getPosts().contains(post));
    }

    @Test
    public void test_post_nullPost(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Post post = null;
        assertFalse(user.post(post));
    }

    @Test (expected = NullPointerException.class)
    public void test_post_nullUser(){
        User user = null;
        Post post = new Post("post", 1, 0.0, 0.0);
        user.post(post);
    }

    @Test
    public void test_deletePost(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Post post = new Post("post", 1, 0.0, 0.0);
        user.post(post);
        user.deletePost(post);
        assertFalse(user.getPosts().contains(post));
    }

    @Test
    public void test_deletePost_nullPost(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());

        Post post = null;
        assertFalse(user.deletePost(post));;
    }

    @Test (expected = NullPointerException.class)
    public void test_deletePost_nullUser(){
        User user = null;
        Post post = new Post("post", 1, 0.0, 0.0);
        user.deletePost(post);
    }

    @Test
    public void test_editPost(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        Post post = new Post("post", 1, 0.0, 0.0);
        user.post(post);
        String newContent = "new content";

        assertTrue(user.editPost(post, newContent, 0));
    }

    @Test
    public void test_editPost_nullPost(){
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());

        Post post = null;
        String newContent = "new content";
        assertFalse(user.editPost(post, newContent, 0));
    }

    @Test (expected = NullPointerException.class)
    public void test_editPost_nullUser(){
        User user = null;
        Post post = new Post("post", 1, 0.0, 0.0);
        String newContent = "new content";
        user.editPost(post, newContent, 0);
    }

}
