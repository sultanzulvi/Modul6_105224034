package rental;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nopol, String merk, int thn, double harga, int cc) {
        super(nopol, merk, thn, harga);
        this.cc = cc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CC : " + cc );
    }

    @Override
    public double hitungTotal(int durasi) {
        double totalMotor = super.hitungTotal(durasi);
    
        if (this.cc >= 250) {
            totalMotor += (25000 * durasi);
        }
        return totalMotor;
    }
}