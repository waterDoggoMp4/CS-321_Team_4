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
     *
     * @return true if the bio was updated successfully
     */
    public boolean updateBio(User user) {
        return true;
    }

    /**
     * Updates the name of the user
     *
     * @return true if the name was updated successfully
     */
    public boolean updateName(User user) {
        return true;
    }

    /**
     * Logs the user in
     *
     * @return true if the user was successfully logged in
     */
    public boolean logIn() {
        return true;
    }

    /**
     * Logs the user out
     *
     * @return true if the user was successfully logged out
     */
    public boolean logOut() {
        return true;
    }

    /**
     * Updates the profile picture of the user
     *
     * @return true if the profile picture was updated successfully
     */
    public boolean updateProfilePicture() {
        return true;
    }

    /**
     * Sends a message to another user
     * Implement message id or message object
     *
     * @param user the user to send the message to
     * @param message the message to send
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was sent successfully
     */
    public boolean messageUser(User user, String message) {
        return true;
    }

    /**
     * Receives a message from another user
     * Implement message id or message object
     * @param message id or message object
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was received successfully
     */
    public boolean receiveMessage(Message message) {
        return true;
    }

    /**
     * Blocks another user
     *
     * @param user the user to block
     * @exception IllegalArgumentException if the user is an invalid user or if the user is already blocked
     * @return true if user was blocked successfully
     */
    public boolean blockUser(User user) {
        return true;
    }

    /**
     * Unblocks another user
     *
     * @param user the user to unblock
     * @exception IllegalArgumentException if the user is an invalid user or if the user is not blocked
     * @return true if user was unblocked successfully
     */
    public boolean unblockUser(User user) {
        return true;
    }

    /**
     * Makes a post
     * Implement post id or post object
     *
     * @param post the post to make
     * @exception IllegalArgumentException if the user is not allowed to make the post
     * @return true if message was posted successfully
     */
    public boolean post(String post) {
        return true;
    }

    /**
     * Deletes a post
     * Implement post id or post object
     *
     * @param post the post to delete
     * @exception IllegalArgumentException if the user is not allowed to delete the post
     * @return true if message was deleted successfully
     */
    public boolean deletePost(String post) {
        return true;
    }
}
