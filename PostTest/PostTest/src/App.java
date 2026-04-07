import java.util.ArrayList;
import rental.Kendaraan;
import rental.Mobil;
import rental.Motor;

public class App {
    public static void main(String[] args) {
        ArrayList<Kendaraan> koleksiRental = new ArrayList<>();

        koleksiRental.add(new Mobil("L 1945 RI", "Mitsubishi L300", 2010, 275000, 8));

        koleksiRental.add(new Mobil("D 2026 PRO", "Hyundai IONIQ 5", 2024, 850000, 5));

        koleksiRental.add(new Motor("B 3000 KNG", "Kawasaki Ninja", 2023, 350000, 250));

        koleksiRental.add(new Motor("H 5555 ACE", "Yamaha Fazzio", 2022, 125000, 125));

        System.out.println("Laporan Transaksi");

      for (Kendaraan unit : koleksiRental) {
            unit.displayInfo();
            
           
            double totalBayar = unit.hitungTotal(5);
            
            System.out.println("Total Biaya Sewa (5 Hari): Rp" + totalBayar);
            System.out.println("-----------------------------------");
        }
    }
}