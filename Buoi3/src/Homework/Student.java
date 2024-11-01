package Homework;

public class Student {
    private String studentCode;
    private String fullName;
    private byte age;
    private String gender;
    private String phoneNumber;
    private String email;

    //Constructor methods
    public Student() {
    }

    public Student(String studentCode, String fullName, byte age,
                   String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Getter methods
    public String getStudentCode() {
        return studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //Setter methods
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println(String.format("%-15s %-20s %-10d %-10s %-15s %-30s",
                studentCode, fullName, age, gender, phoneNumber, email));
    }
}
