import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class UserTest {

    @Test
    public void test_updateBio() {
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String[] bio = new String[]{"new bio"};
        assertTrue(user.updateBio(user, bio));
    }

    @Test
    public void test_updateBio_null() {
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String[] bio = null;
        assertFalse(user.updateBio(user, bio));
    }

    @Test (expected = NullPointerException.class)
    public void test_updateBio_nullUser(){
        User user = null;
        String[] bio = new String[]{"new bio"};
        assertFalse(user.updateBio(user, bio));
    }

    @Test
    public void test_updateName(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String name = "new name";
        assertTrue(user.updateName(user, name));
    }

    @Test
    public void test_updateName_null(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        String name = null;
        assertFalse(user.updateName(user, name));
    }

    @Test (expected = NullPointerException.class)
    public void test_updateName_nullUser(){
        User user = null;
        String name = "new name";
        assertFalse(user.updateName(user, name));
    }

    @Test
    public void blockUser(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = new User("blocked", 2, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        assertEquals(blockedUsers, user.getBlockedUsers());
    }

    @Test
    public void blockUser_null(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = null;
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        assertEquals(blockedUsers, user.getBlockedUsers());
    }

    @Test (expected = NullPointerException.class)
    public void blockUser_nullUser(){
        User user = null;
        User blockedUser = new User("blocked", 2, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        assertEquals(blockedUsers, user.getBlockedUsers());
    }

    @Test
    public void test_unblockUser(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = new User("blocked", 2, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        user.unblockUser(blockedUser);
        assertEquals(new ArrayList<User>(), user.getBlockedUsers());
    }

    @Test
    public void test_unblockUser_null(){
        User user = new User("name", 1, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        User blockedUser = null;
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        user.unblockUser(blockedUser);
        assertEquals(new ArrayList<User>(), user.getBlockedUsers());
    }

    @Test (expected = NullPointerException.class)
    public void test_unblockUser_nullUser(){
        User user = null;
        User blockedUser = new User("blocked", 2, new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        ArrayList<User> blockedUsers = new ArrayList<User>();
        blockedUsers.add(blockedUser);
        user.setBlockedUsers(blockedUsers);
        user.unblockUser(blockedUser);
        assertEquals(new ArrayList<User>(), user.getBlockedUsers());
    }

}
