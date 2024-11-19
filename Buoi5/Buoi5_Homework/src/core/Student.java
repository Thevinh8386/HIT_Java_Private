package core;

import java.util.Scanner;

public class Student extends Person{
	private int id;
	private String nameClass;
	private float gpa;
	public static final float CRITERIA = 2.0f;

	//Constructor
	public Student() {}
	public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
		super(name, age, address);
		this.id = id;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}

	//Getters method
	public int getId() {
		return id;
	}

	public String getNameClass() {
		return nameClass;
	}

	public float getGpa() {
		return gpa;
	}

	public static float getCriteria() {
		return criteria;
	}

	//Setters method
	public void setId(int id) {
		this.id = id;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	@Override
    public void input() {
		super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter class name: ");
        nameClass = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
    }

	@Override
    public void output() {
		super.output();
        System.out.printf("%-15d %-15s %-10.2f ", id, nameClass, gpa);
    }

    public boolean checkFall() {
        return gpa < CRITERIA;
    }
}
