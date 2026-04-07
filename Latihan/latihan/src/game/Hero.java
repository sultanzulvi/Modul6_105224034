package game;

public class Hero {
    private String nama;
    private double health;
    private double kekuatanSerangan;

    public Hero (String nama, double health, double kekuatanSerangan){
        this.nama = nama;
        this.health = health;
        this.kekuatanSerangan = kekuatanSerangan;
    }

    public String getNama(){
        return nama;
    }

    public double getHealth(){
        return health;
    }

    public double getKekuatan(){
        return kekuatanSerangan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setHealth(double health){
        this.health = health;
    }

    public void setKekuatan(double kekuatanSerangan){
        this.kekuatanSerangan = kekuatanSerangan;
    }

    public void display(){
        System.out.println("Nama : " + nama);
        System.out.println("jumlah darah : " + health);
        System.out.println("Kekuatan Serangan : " + kekuatanSerangan);
    }

    public void berlatih(){
        this.kekuatanSerangan += 10;
        System.out.println("Kekuatan Serangan Bertambah : " + this.kekuatanSerangan);
    }

    public void terimaSerangan(double damage){
        this.health -= damage;
        System.out.println("damage yang diterima : " + this.health);
    }

}