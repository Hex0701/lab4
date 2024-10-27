package comp31.lab4.models;

public class User {

    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + "]";
    }

}
