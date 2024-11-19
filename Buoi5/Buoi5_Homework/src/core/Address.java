package core;

import java.util.Scanner;

public class Address {
	private String commune;
	private String district;
	private String city;
	
	//Constructor
	public Address() {}
	
	public Address(String commune, String district, String city) {
		this.commune = commune;
		this.district = district;
		this.city = city;
	}

	//Getters method
	public String getCommune() {
		return commune;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}

	//Setters method
	public void setCommune(String commune) {
		this.commune = commune;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter commune: ");
        commune = sc.nextLine();
        System.out.print("Enter district: ");
        district = sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-15s %-15s %-15s", commune, district, city);	
	}	
}
