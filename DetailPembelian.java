/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DetailPembelian {
     private String namaProduk;
    private int jumlah;
    private double hargaSatuan;

    // Konstruktor
    public DetailPembelian(String namaProduk, int jumlah, double hargaSatuan) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
    }

    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    // Metode untuk menghitung total harga
    public double getTotalHarga() {
        return jumlah * hargaSatuan;
    }

    // Metode untuk menampilkan detail pembelian
    public void tampilDetailPembelian() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Total Harga: " + getTotalHarga());
    }
    
}
