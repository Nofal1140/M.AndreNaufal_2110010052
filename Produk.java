/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Produk {
    private  int id;
    private String name;
    private double price;

    public Produk(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // Membuat objek produk
        Produk produk = new Produk(1, "Contoh Produk", 9.99);

        // Menampilkan informasi produk
        System.out.println("ID: " + produk.getId());
        System.out.println("Nama: " + produk.getName());
        System.out.println("Harga: $" + produk.getPrice());

        // Mengubah harga produk
        produk.setPrice(14.99);

        // Menampilkan harga produk yang telah diubah
        System.out.println("Harga baru: $" + produk.getPrice());
    }
    
}
