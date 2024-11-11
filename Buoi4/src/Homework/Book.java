package Homework;

public class Book {
	private int maSach;
	private String tenSach;
	private String tenTacGia;
	private int namSanXuat;
	private String tomTatNoiDung;
	private double giaTien;
	
	//Constructor
	public Book() {
	}

	public Book(int maSach, String tenSach, String tenTacGia, 
			int namSanXuat, String tomTatNoiDung, double giaTien) {
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namSanXuat = namSanXuat;
		this.tomTatNoiDung = tomTatNoiDung;
		this.giaTien = giaTien;
	}

	//Getters methods
	public int getMaSach() {
		return maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public String getTomTatNoiDung() {
		return tomTatNoiDung;
	}

	public double getGiaTien() {
		return giaTien;
	}

	//Setters methods
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public void setTomTatNoiDung(String tomTatNoiDung) {
		this.tomTatNoiDung = tomTatNoiDung;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	@Override
	public String toString() {
		return "Book [maSach=" + maSach + ", tenSach=" + tenSach + ", tenTacGia=" + tenTacGia + ", namSanXuat="
				+ namSanXuat + ", tomTatNoiDung=" + tomTatNoiDung + ", giaTien=" + giaTien + "]";
	}
	
    // Display method
    public void display() {
    	System.out.println(this.toString());
    }
}
