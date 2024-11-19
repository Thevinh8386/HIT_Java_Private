package core;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected Address address;
	
	//Constructor
	public Person() {
	}
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//Getters method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Address getAddress() {
		return address;
	}
	
	//Setters method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name : " );
        name = sc.nextLine();
        System.out.print("Enter Age: " );
        age = sc.nextInt();
        sc.nextLine();
        address = new Address();
        address.input();
	}
	
	public void output() {
		System.out.printf("%-20s %-15d", name, age);
		address.output();
	}
}
