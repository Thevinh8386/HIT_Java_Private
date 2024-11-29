package model;

public class User {
    private String id;
    private String name;
    private String email;
    private String passWord;
    private int age;
    private String birth;
    private Role role;

    //Constructor
    public User() {}

    public User(String id, String name, String email, String passWord,
                int age, String birth, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passWord = passWord;
        this.age = age;
        this.birth = birth;
        this.role = role;
    }

    //Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getAge() {
        return age;
    }

    public String getBirth() {
        return birth;
    }

    public Role getRole() {
        return role;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    //Hiển thị thông tin User
    @Override
    public String toString() {
        return "User {" +
                "ID: '" + id + '\'' +
                ", Name:'" + name + '\'' +
                ", Age: " + age +
                ", Birth: '" + birth + '\'' +
                ", Role: " + role +
                '}';
    }

    public void output() {
        System.out.println(toString());
    }
}
