public class User {
    private String name;
    private int uid;
    private String[] bio;
    private double longitude;
    private double latitude;
    private Object[] blockedUsers;

    public User(String name, int uid, String[] bio, double longitude, double latitude, Object[] blockedUsers) {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public String[] getBio() {
        return bio;
    }
    
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Object[] getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(Object[] blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

}
