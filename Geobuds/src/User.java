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

    /**
     * Gets the name of the user
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the uid of the user
     * @return uid
     */
    public int getUid() { return uid; }

    /**
     * Gets the bio of the user
     * @return bio
     */
    public String[] getBio() {
        return bio;
    }

    /**
     * Gets the longitude of the user
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Gets the latitude of the user
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the blocked users of the user
     * @return blockedUsers
     */
    public ArrayList<User> getBlockedUsers() {
        return blockedUsers;
    }

    /**
     * Sets the name of the user
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the name of the user
     * @param uid the uid of the user
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * Sets the bio of the user
     * @param bio the bio of the user
     */
    public void setBio(String[] bio) {
        this.bio = bio;
    }

    /**
     * Sets the longitude of the user
     * @param longitude the longitude of the user
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets the latitude of the user
     * @param latitude the latitude of the user
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the blocked users of the user
     * @param blockedUsers the blocked users of the user
     */
    public void setBlockedUsers(ArrayList<User> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    /**
     * REQUIRES: user != null
     *           bio != null
     *           bio.length > 0
     * Updates the bio of the user
     *
     * @return true if the bio was updated successfully
     */
    public boolean updateBio(User user, String[] bio) {
        if(user == null || bio == null || bio.length == 0) {
            return false;
        }
        user.setBio(bio);
        return true;
    }

    /**
     * REQUIRES: user != null
     *           name != null
     *           name.length > 0
     * Updates the name of the user
     *
     * @return true if the name was updated successfully
     */
    public boolean updateName(User user, String name) {
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
     * REQUIRES: user != null
     *           message != null
     * Sends a message to another user
     * Implement message id or message object
     *
     * @param user the user to send the message to
     * @param message the message to send
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was sent successfully
     */
    private boolean messageUser(User user, String message) { return true; }

    /**
     * REQUIRES: message != null
     *           message.length > 0
     * Receives a message from another user
     * Implement message id or message object
     *
     * @param message id or message object
     * @exception com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     * @return true if message was received successfully
     */
    private boolean receiveMessage(Message message) {
        return true;
    }

    /**
     * REQUIRES: user != null
     * Blocks another use
     *
     *
     * @param user the user to block
     * @exception IllegalArgumentException if the user is an invalid user or if the user is already blocked
     * @return true if user was blocked successfully
     */
    public boolean blockUser(User user) {
        ArrayList<User> blockedUsers = getBlockedUsers();

        if (user == null || blockedUsers.contains(user)) {
            return false;
        }

        blockedUsers.add(user);
        return true;
    }

    /**
     * REQUIRES: user != null
     * Unblocks another user
     *
     * @param user the user to unblock
     * @exception IllegalArgumentException if the user is an invalid user or if the user is not blocked
     * @return true if user was unblocked successfully
     */
    public boolean unblockUser(User user) {
        ArrayList<User> blockedUsers = getBlockedUsers();

        if(blockedUsers.contains(user)){
            blockedUsers.remove(user);
            return true;
        }

        return false;
    }

    /**
     * REQUIRES: post != null
     * Makes a post
     * Implement post id or post object
     *
     * @param post the post to make
     * @exception IllegalArgumentException if the user is not allowed to make the post
     * @return true if message was posted successfully
     */
    private boolean post(String post) {
        return true;
    }

    /**
     * REQUIRES: post != null
     * Deletes a post
     * Implement post id or post object
     *
     * @param post the post to delete
     * @exception IllegalArgumentException if the user is not allowed to delete the post
     * @return true if message was deleted successfully
     */
    private boolean deletePost(String post) {
        return true;
    }
}
