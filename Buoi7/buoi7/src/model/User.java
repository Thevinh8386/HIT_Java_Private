package model;

public class User {
    private String id;
    private String fullName;
    private String username;
    private String password;
    private Role role;

    //Constructor
    public User() {}

    public User(String id, String fullName, String username, String password, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    //Getters method
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    //Setters method
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "USER {" +
                "ID: '" + id + '\'' +
                ", Fullname: '" + fullName + '\'' +
                ", Username: '" + username + '\'' +
                ", Role: " + role +
                '}';
    }
}
