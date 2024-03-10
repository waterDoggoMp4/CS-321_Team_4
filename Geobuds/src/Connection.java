
import java.util.ArrayList;
public class Connection {
    private ArrayList<User> existingUsers;
    private boolean loggedIn;

    public Connection(ArrayList<User> existingUsers){
        this.existingUsers = existingUsers;
        loggedIn = false;
    }
    public boolean signUp(int uid, String password){
        if(uid < 0 || password == null){
            System.out.println("Invalid uid or password");
            return false;
        }

        for(User user : existingUsers){
            if(user.getUid() == uid){
                System.out.println("User already exists");
                return false;
            }
        }
        existingUsers.add(new User("", uid, password, new String[]{""}, 0, 0, new ArrayList<User>()));
        return true;
    }
    /**
     * Logs the user in
     *
     * @return true if the user was successfully logged in
     */
    public boolean logIn(int uid, String password) {

        for(User user : existingUsers){
            if(user.getUid() == uid){
                if(user.getPassword().equals(password)){
                    loggedIn = true;
                    return true;
                }
                else{
                    System.out.println("Password incorrect");
                    return false;
                }
            }
        }
        System.out.println("Uid invalid");
        return false;
    }

    /**
     * Logs the user out
     *
     * @return true if the user was successfully logged out
     */
    public boolean logOut() {
        loggedIn = false;
        return true;
    }
}
