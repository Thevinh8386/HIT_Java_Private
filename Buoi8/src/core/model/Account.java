package model;

public class Account extends Person {
    private String username;
    private String password;
    private Role role;
    private Status status;

    //Constructor
    public Account() {
        super();
    }

    public Account(String id, String fullName, int age, Address address, String birthday, String username, String password, Role role, Status status) {
        super(id, fullName, age, address, birthday);
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    //Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Status getStatus() {
        return status;
    }

    //Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + "Account {" +
                "Username: '" + username + '\'' +
                "Username: ********'" +  '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
