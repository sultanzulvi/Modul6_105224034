package Perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    } // Konstraktor

    @Override // override untuk hitung gaji total
    public double hitungGajiTotal() {
        double gajiBase = super.hitungGajiTotal();
        double tunjanganLevel = 0;

        if (level.equalsIgnoreCase("Mid")) tunjanganLevel = 1500000;
        else if (level.equalsIgnoreCase("Senior")) tunjanganLevel = 3000000;

        double bonusBug = 0;
        if (getRatingKinerja() >= 3.0) {
            bonusBug = jumlahBugFix * 50000;
        }
        return gajiBase + tunjanganLevel + bonusBug;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Developer " + level );
        System.out.println("Bug Fixed : " + jumlahBugFix);
    }
}