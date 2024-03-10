import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
public class ConnectionTest {

    @Test
    public void test_signUp() {
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        assertTrue(connection.signUp(user.getUid(), user.getPassword()));
    }

    @Test
    public void test_signUp_userExists(){
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        connection.signUp(user.getUid(), user.getPassword());
        assertFalse(connection.signUp(user.getUid(), user.getPassword()));
    }

    @Test
    public void test_signUp_invalidUid(){
        Connection connection = new Connection(new ArrayList<>());
        assertFalse(connection.signUp(-1, null));
    }

    @Test
    public void test_logIn(){
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "password", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        connection.signUp(user.getUid(), user.getPassword());
        assertTrue(connection.logIn(user.getUid(), user.getPassword()));
    }

    @Test
    public void test_logIn_incorrectPassword(){
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "password", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        connection.signUp(user.getUid(), user.getPassword());
        assertFalse(connection.logIn(user.getUid(), "incorrect"));
    }

    @Test
    public void test_logIn_invalidUid(){
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "password", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        connection.signUp(user.getUid(), user.getPassword());
        assertFalse(connection.logIn(2, user.getPassword()));
    }

    @Test
    public void logOut(){
        Connection connection = new Connection(new ArrayList<>());
        User user = new User("name", 1, "password", new String[]{"bio"}, 0.0, 0.0, new ArrayList<User>());
        connection.signUp(user.getUid(), user.getPassword());
        connection.logIn(user.getUid(), user.getPassword());
        assertTrue(connection.logOut());
    }

}
