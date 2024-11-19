package Homework;

public class TruyenCoTich extends Book{
    protected double giaTien;
    public TruyenCoTich (double giaTien) {
        super(giaTien);
    }

    @Override
    public String toString() {
        return "TruyenCoTich{" +
                "giaTien=" + giaTien + super.toString();
                '}';
    }
}

