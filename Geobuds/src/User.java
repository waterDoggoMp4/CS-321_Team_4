import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class to represent a user
 */
public class User {
    private String name;
    private int uid;
    private String password;
    private String[] bio;
    private double longitude;
    private double latitude;
    private double radius;
    private ArrayList<User> blockedUsers;
    private HashMap<User, ArrayList<Message>> messageInbox;
    private ArrayList<Message> messages;
    private HashMap<User, ArrayList<Post>> postInbox;
    private ArrayList<Post> posts;


    /**
     * Constructor for User
     *
     * @param name         full name of the user
     * @param uid          unique id of the user
     * @param password     password of the user
     * @param bio          bio of the user
     * @param longitude    longitude of the user
     * @param latitude     latitude of the user
     * @param blockedUsers list of blocked users
     */
    public User(String name, int uid, String password, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
        this.name = name;
        this.uid = uid;
        this.password = password;
        this.bio = bio;
        this.longitude = longitude;
        this.latitude = latitude;
        this.blockedUsers = blockedUsers;
        this.messageInbox = new HashMap<>();
        this.messages = new ArrayList<>();
        this.postInbox = new HashMap<>();
        this.posts = new ArrayList<>();

    }

    /**
     * Gets the name of the user
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the uid of the user
     *
     * @return uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Gets the password of the user
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets the bio of the user
     *
     * @return bio
     */
    public String[] getBio() {
        return bio;
    }

    /**
     * Gets the longitude of the user
     *
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Gets the latitude of the user
     *
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the blocked users of the user
     *
     * @return blockedUsers
     */
    public ArrayList<User> getBlockedUsers() {
        return blockedUsers;
    }

    /**
     * Gets the radius of the user
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets the message inbox of the user
     *
     * @return messageInbox
     */
    public HashMap<User, ArrayList<Message>> getMessageInbox() {
        return messageInbox;
    }

    /**
     * Gets the messages of the user
     *
     * @return messages
     */
    public ArrayList<Message> getMessages() {
        return messages;
    }

    /**
     * Gets the post inbox of the user
     *
     * @return postInbox
     */
    public HashMap<User, ArrayList<Post>> getPostInbox() {
        return postInbox;
    }

    /**
     * Gets the posts of the user
     *
     * @return posts
     */
    public ArrayList<Post> getPosts() {
        return postInbox.get(this);
    }

    /**
     * Sets the name of the user
     *
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the name of the user
     *
     * @param uid the uid of the user
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * Sets the password of the user
     *
     * @param password the password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the bio of the user
     *
     * @param bio the bio of the user
     */
    public void setBio(String[] bio) {
        this.bio = bio;
    }

    /**
     * Sets the longitude of the user
     *
     * @param longitude the longitude of the user
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets the latitude of the user
     *
     * @param latitude the latitude of the user
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the blocked users of the user
     *
     * @param blockedUsers the blocked users of the user
     */
    public void setBlockedUsers(ArrayList<User> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    /**
     * Sets the radius of the user
     *
     * @param radius the radius of the user
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Sets the message inbox of the user
     *
     * @param messageInbox the message inbox of the user
     */
    public void setMessageInbox(HashMap<User, ArrayList<Message>> messageInbox) {
        this.messageInbox = messageInbox;
    }

    /**
     * Sets the messages of the user
     *
     * @param messages the messages of the user
     */
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    /**
     * Sets the post inbox of the user
     *
     * @param postInbox the post inbox of the user
     */
    public void setPostInbox(HashMap<User, ArrayList<Post>> postInbox) {
        this.postInbox = postInbox;
    }

    /**
     * Sets the posts of the user
     *
     * @param posts the posts of the user
     */
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    /**
     * Updates the bio of the user
     *
     * @return true if the bio was updated successfully
     */
    public boolean updateBio(User user, String[] bio) {
        if (user == null || bio == null || bio.length == 0) {
            return false;
        }
        user.setBio(bio);
        return true;
    }

    /**
     * Updates the name of the user
     *
     * @return true if the name was updated successfully
     */
    public boolean updateName(User user, String name) {
        if (user == null || name == null || name.isEmpty()) {
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
     *
     * @param user    the user to send the message to
     * @param message the message to send
     * @return true if message was sent successfully
     * @throws com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     */
    public boolean messageUser(User user, Message message) {
        if(user == null || message == null || blockedUsers.contains(user)) {
            return false;
        }
        messages.add(message);
        messageInbox.put(user, messages);
        messageInbox.put(this, messages);

        return true;
    }

    /**
     * Receives a message from another user
     * Implement message id or message object
     *
     * @param message id or message object
     * @return true if message was received successfully
     * @throws com.sun.jdi.InvalidTypeException if the user is not allowed to receive the message
     */
    public boolean receiveMessage(Message message) {
        if (message == null) {
            return false;
        }

        // Get the inbox of the current user
        ArrayList<Message> inbox = messageInbox.get(this);

        // Check if the inbox exists and contains the message
        return inbox != null && inbox.contains(message);
    }

    /**
     * Makes a post
     * Implement post id or post object
     *
     * @param post the post to make
     * @exception IllegalArgumentException if the user is not allowed to make the post
     * @return true if message was posted successfully
     */
    public boolean post(Post post) {
        if(post == null) {
            return false;
        }

        if(postInbox.containsKey(this)){
            postInbox.get(this).add(post);
            return true;
        }
        else{
            ArrayList<Post> posts = new ArrayList<>();
            posts.add(post);
            postInbox.put(this, posts);
            return true;
        }
    }

    /**
     * Edits a post
     * Implement post id or post object
     *
     * @param post the post to edit
     * @exception IllegalArgumentException if the user is not allowed to edit the post
     * @return true if message was edited successfully
     */
    public boolean editPost(Post post, String description, double radius) {
        if(post == null || description == null || description.isEmpty() || radius < 0) {
            return false;
        }
        post.setDescription(description);
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
    public boolean deletePost(Post post) {
        if(post == null || postInbox.get(this) == null) {
            return false;
        }

        postInbox.get(this).remove(post);
        return true;
    }
    /**
     * REQUIRES: user != null
     * Blocks another user
     *
     * @param user the user to block
     * @return true if user was blocked successfully
     * @throws IllegalArgumentException if the user is an invalid user or if the user is already blocked
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
     * Unblocks another user
     *
     * @param user the user to unblock
     * @return true if user was unblocked successfully
     * @throws IllegalArgumentException if the user is an invalid user or if the user is not blocked
     */
    public boolean unblockUser(User user) {
        ArrayList<User> blockedUsers = getBlockedUsers();

        if (blockedUsers.contains(user)) {
            blockedUsers.remove(user);
            return true;
        }

        return false;
    }
}
