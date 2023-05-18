/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Pembelian {
     private String namaBarang;
    private int jumlah;
    private double harga;

    public Pembelian(String namaBarang, int jumlah, double harga) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public double hitungTotal() {
        return jumlah * harga;
    }

    public void tampilkanData() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + hitungTotal());
    }

    public static void main(String[] args) {
        Pembelian pembelian1 = new Pembelian("Beras", 3, 10.5);
        pembelian1.tampilkanData();

    }
    
}
