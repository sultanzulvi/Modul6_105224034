import java.util.ArrayList;
import Perusahaan.Developer;
import Perusahaan.Manajer;
import Perusahaan.Karyawan;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();
        // input user dalam program
        listKaryawan.add(new Karyawan("1", "Opal", 2020, 5000000, 2.0));
        listKaryawan.add(new Developer("2", "Paul", 2018, 8000000, 4.0, "Senior", 20));
        listKaryawan.add(new Developer("3", "Ical", 2024, 6000000, 2.8, "Mid", 15));
        listKaryawan.add(new Manajer("4", "Sultan", 2015, 12000000, 4.8, "IT", 10));
        listKaryawan.add(new Manajer("5", "Aldo", 2025, 10000000, 3.5, "HR", 3));

        double totalAnggaran = 0;
        double totalRating = 0;
        Karyawan highestEarner = listKaryawan.get(0);

        System.out.println("Data Perusahaan");

        for (Karyawan k : listKaryawan) {
            k.displayInfo();
            double gajiTotal = k.hitungGajiTotal();
            System.out.println("\nTotal Gaji Bulan Ini: Rp" +  gajiTotal );
            // anggaran dan rating
            totalAnggaran += gajiTotal;
            totalRating += k.getRatingKinerja();
            // nyari gaji tertinggi
            if (gajiTotal > highestEarner.hitungGajiTotal()) {
                highestEarner = k;
            }
        }
        // output akhir
        System.out.println("\nInfo");
        System.out.println("Total Anggaran Gaji Perusahaan: Rp" +  totalAnggaran);
        System.out.println("Karyawan dengan Gaji Tertinggi: " + highestEarner.getNama());
        System.out.println("Rata-rata Rating Kinerja: " + (totalRating / listKaryawan.size()));
    }
}