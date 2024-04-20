import java.time.LocalDateTime;

/**
 * Post class
 */
public class Post{
    private String description;
    private int postId;
    private LocalDateTime timestamp;
    private double longitude;
    private double latitude;
    private User user;

    /**
     * Constructor for Post
     * @param user the user making the post
     * @param description description of the post
     * @param postId unique id of the post
     * @param longitude longitude of the post
     * @param latitude latitude of the post
     */
    public Post(String description, int postId, double longitude, double latitude, user user){
        this.user = user;
        this.description = description;
        this.postId = postId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * @return the user
     */
    public User getUser(){
        return user;
    }

    /**
     * @param user the user making the post
     */
    public void setUser(User user){
        this.user = user;
    }
    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * @param postId the postId to set
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     * @return the timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        if(longitude <= 180 && longitude >= -180){
            this.longitude = longitude;
        }
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        if(latitude <= 90 && latitude >= -90){
            this.latitude = latitude;
        }
    }

    /**
     * @param user the user making the post
     * @return 1 for a professional user that can advertise, else 0
     */
    public int canAdvertise(User user){
        if(user instanceof ProfessionalUser){
            return 1;
        }
        return 0;
    }
}
