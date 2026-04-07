package rental;

public class Mobil extends Kendaraan {
    private int jmlPenumpang;

    public Mobil(String nopol, String merk, int thn, double harga, int jmlPenumpang) {
        super(nopol, merk, thn, harga);
        this.jmlPenumpang = jmlPenumpang;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas : " + jmlPenumpang );
    }

    @Override
    public double hitungTotal(int durasi) {
        double hasil = super.hitungTotal(durasi);
   
        double asuransi = 50000 * durasi;
        hasil += asuransi;

        if (jmlPenumpang > 5) {
            hasil += 50000;
        }
        return hasil;
    }
}