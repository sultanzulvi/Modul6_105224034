package game;

public class HeroStrength extends Hero{
    private String strength;

    public void getStrength(){
    }

    public void setStrength(String strength){
        this.strength = strength;
    }

    public HeroStrength(String nama, double health, double kekuatanSerangan, String strength){
        super(nama, health, kekuatanSerangan);
        this.strength = strength;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Strength : " + this.strength);
    }

    @Override
    public void terimaSerangan(double damage){
        super.terimaSerangan(damage);
        System.out.println("Damage : " + damage);
    }
}
