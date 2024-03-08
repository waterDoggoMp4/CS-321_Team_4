import java.util.ArrayList;

public class User {
    private String name;
    private int uid;
    private String[] bio;
    private double longitude;
    private double latitude;
    private ArrayList<User> blockedUsers;

    public User(String name, int uid, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
        this.name = name;
        this.uid = uid;
        this.bio = bio;
        this.longitude = longitude;
        this.latitude = latitude;
        this.blockedUsers = blockedUsers;
    }

    public String getName() {
        return name;
    }

    public int getUid() { return uid; }

    public String[] getBio() {
        return bio;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public ArrayList<User> getBlockedUsers() {
        return blockedUsers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setBio(String[] bio) {
        this.bio = bio;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setBlockedUsers(ArrayList<User> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    /**
     * Updates the bio of the user
     * REQUIRES: user != null
     *           bio != null
     *           bio.length > 0
     *
     * @return true if the bio was updated successfully
     */
    private boolean updateBio(User user, String[] bio) {
        if(user == null || bio == null || bio.length == 0) {
            return false;
        }
        user.setBio(bio);
        return true;
    }

    /**
     * Updates the name of the user
     * REQUIRES: user != null
     *           name != null
     *           name.length > 0
     *
     * @return true if the name was updated successfully
     */
    private boolean updateName(User user, String name) {
        if(user == null || name == null || name.isEmpty()) {
            return false;
        }
        setName(name);
        return true;
    }

    /**
     * Logs the user in
     *
     * @return true if the user was successfully logged in
     */
    private boolean logIn() {
        return true;
    }

    /**
     * Logs the user out
     *
     * @return true if the user was successfully logged out
     */
    private boolean logOut() {
        return true;
    }

    /**
     * Updates the profile picture of the user
     *
     * @return true if the profile picture was updated successfully
     */
    private boolean updateProfilePicture() {
        return true;
    }

    /**
     * Sends a message to another user
     * Implement message id or message object
     * REQUIRES: user != null
     *           message != null
     *
     * @param user the user to send the message to
     * @param message the message to send
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was sent successfully
     */
    private boolean messageUser(User user, String message) { return true; }

    /**
     * Receives a message from another user
     * Implement message id or message object
     * REQUIRES: message != null
     *           message.length > 0
     *
     * @param message id or message object
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was received successfully
     */
    private boolean receiveMessage(Message message) {
        return true;
    }

    /**
     * Blocks another user
     * REQUIRES: user != null
     *
     * @param user the user to block
     * @exception IllegalArgumentException if the user is an invalid user or if the user is already blocked
     * @return true if user was blocked successfully
     */
    private boolean blockUser(User user) {
        return true;
    }

    /**
     * Unblocks another user
     * REQUIRES: user != null
     *
     * @param user the user to unblock
     * @exception IllegalArgumentException if the user is an invalid user or if the user is not blocked
     * @return true if user was unblocked successfully
     */
    private boolean unblockUser(User user) {
        return true;
    }

    /**
     * Makes a post
     * Implement post id or post object
     * REQUIRES: post != null
     *
     * @param post the post to make
     * @exception IllegalArgumentException if the user is not allowed to make the post
     * @return true if message was posted successfully
     */
    private boolean post(String post) {
        return true;
    }

    /**
     * Deletes a post
     * Implement post id or post object
     * REQUIRES: post != null
     *
     * @param post the post to delete
     * @exception IllegalArgumentException if the user is not allowed to delete the post
     * @return true if message was deleted successfully
     */
    private boolean deletePost(String post) {
        return true;
    }
}
