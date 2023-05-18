/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Brg_Kirim {
    private String pengirim;
    private String penerima;
    private String alamat;
    private double berat;
    private double biaya;

    public Brg_Kirim (String pengirim, String penerima, String alamat, double berat) {
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.alamat = alamat;
        this.berat = berat;
    }

    public void hitungBiaya() {
        // Logika perhitungan biaya pengiriman berdasarkan berat
        biaya = berat * 1000; // Contoh: biaya per kilogram adalah 1000
    }

    public void kirimBarang() {
        // Logika pengiriman barang
        System.out.println("Barang dikirim ke alamat: " + alamat);
        System.out.println("Dikirim oleh: " + pengirim);
        System.out.println("Diterima oleh: " + penerima);
        System.out.println("Biaya pengiriman: $" + biaya);
    }

    public static void main(String[] args) {
        Brg_Kirim  pengiriman = new Brg_Kirim ("John Doe", "Jane Smith", "Jl. Contoh No. 123, Kota Contoh", 2.5);
        pengiriman.hitungBiaya();
        pengiriman.kirimBarang();
    }
    
}
