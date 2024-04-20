import java.time.LocalDateTime;

/**
 * Post class
 */
public class Post{
	private String title;
	private String description;
	private int postId;
	private LocalDateTime timestamp;
	private double longitude;
	private double latitude;
	private String geohash;
	

	/**
	 * Constructor for Post
	 * @param description description of the post
	 * @param postId unique id of the post
	 * @param longitude longitude of the post
	 * @param latitude latitude of the post
	 */
	public Post(String title, String description, int postId, double longitude, double latitude){
		this.title = title; 
		this.description = description;
		this.postId = postId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.timestamp = LocalDateTime.now();
		this.geohash = GeoFireUtils.getGeoHashForLocation(this.latitude, this.longitude);
	}

	/**
	 * @return the title
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title){
		this.title = title;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return new geohash
	 */
	public String getGeohash() {
		return this.geohash;
	}

	/**
	 * Updates Geohash based on current Longitude and Latitude
	 */
	public void setGeohash(){
		this.geohash = GeoFireUtils.getGeoHashForLocation(this.latitude, this.longitude);
	}

	/**
	 * @return the postId
	 */
	public int getPostId() {
		return this.postId;
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
		return this.timestamp;
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
		return this.longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
		this.setGeohash();
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return this.latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
		this.setGeohash();
	}
}
