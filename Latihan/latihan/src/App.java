import game.Hero;
import game.HeroStrength;

public class App {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new HeroStrength("Revo", 100, 100, "Kuat");
        Hero hero2 = new HeroStrength("Jupiter", 100, 100, "Lincah");

        Hero[] daftarHero = {hero1, hero2};

        System.out.println("Status");
        for (Hero h : daftarHero) {
            h.display();
            System.out.println("\n");
        }

        System.out.println("\nLatihan");
        for (Hero h : daftarHero) {
            h.berlatih();
        }

        System.out.println("Simulasi Damage");
        for (Hero h : daftarHero) {
            h.terimaSerangan(50);
        }

        System.out.println("\nStatus Akhir");
        for (Hero h : daftarHero) {
            h.display();
            System.out.println("\n");
        }
    }
}
