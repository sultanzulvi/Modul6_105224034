package minimarket;

public class produk {
    public String nama;
    public double harga;

    public produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanDetail(){
        System.out.println("Nama : " + nama );
        System.out.println("Harga : " + harga );
    }

}