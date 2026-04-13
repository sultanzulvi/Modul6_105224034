package Perusahaan;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
     
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) { // batas untuk rating kinerja
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    public String getNama() { 
        return nama; 
    }
    public double getRatingKinerja() { 
        return ratingKinerja; 
    }
    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public double hitungGajiTotal() {
        int masaBakti = 2026 - tahunMasuk;
        double bonus = (0.05 * gajiPokok) * masaBakti; // bonus 5% setiap tahunnya
        double totalGaji = gajiPokok + bonus;

        if (ratingKinerja < 2.5) { 
            totalGaji *= 0.9; // potongan sebesar 10% (penalti)
        }
        return totalGaji;
    }

    public void displayInfo() {
        System.out.println("ID: " + idKaryawan );
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Rating : " + ratingKinerja);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}