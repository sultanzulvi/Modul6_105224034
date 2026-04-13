package Perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        double gajiBase = super.hitungGajiTotal();
        double tunjanganManajerial = jumlahAnggotaTim * 300000;
        double totalSementara = gajiBase + tunjanganManajerial;

        if (getRatingKinerja() > 4.5) {
            totalSementara *= 1.15; 
        }
        return totalSementara;
    } // total gaji sementara

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manajer Divisi " + divisi );
        System.out.println("Anggota Tim : " + jumlahAnggotaTim );
    }
}