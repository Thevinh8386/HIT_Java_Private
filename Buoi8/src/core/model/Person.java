package model;

public class Person {
    protected String id;
    protected String fullName;
    protected int age;
    protected Address address;
    protected String birthday;

    //Constructor
    public Person(){}

    public Person(String id, String fullName, int age, Address address, String birthday) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    //Getter
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //toString method
    @Override
    public String toString() {
        return "Person{" +
                "ID: '" + id + '\'' +
                ", FullName: '" + fullName + '\'' +
                ", Age: " + age +
                ", Address: " + address +
                ", Birthda: '" + birthday + '\'' +
                '}';
    }
}
