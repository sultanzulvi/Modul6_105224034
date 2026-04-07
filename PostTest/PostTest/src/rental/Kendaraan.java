package rental;

public class Kendaraan {
    private String nopol;
    private String merk;
    private int thnProduksi;
    private double hargaSewa;

    public Kendaraan(String nopol, String merk, int thnProduksi, double hargaSewa) {
        this.nopol = nopol;
        this.merk = merk;
        this.thnProduksi = thnProduksi;
        this.hargaSewa = hargaSewa;
    }

    public int getThnProduksi() {
        return thnProduksi;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getNopol() {
        return nopol;
    }

    public void displayInfo() {
        System.out.println("No. Polisi    : " + nopol);
        System.out.println("Merk          : " + merk);
        System.out.println("Tahun         : " + thnProduksi);
    }

    public double hitungTotal(int durasi) {
        double biayaAwal = hargaSewa * durasi;
        if (this.thnProduksi < 2015) {
            return biayaAwal * 0.9; 
        }else{
        return biayaAwal;
        }
    }
}