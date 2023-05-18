/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Komentar {
    private String pengguna;
    private String komentar;
    private int rating;

    public Komentar(String pengguna, String komentar, int rating) {
        this.pengguna = pengguna;
        this.komentar = komentar;
        this.rating = rating;
    }

    public String getPengguna() {
        return pengguna;
    }

    public void setPengguna(String pengguna) {
        this.pengguna = pengguna;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void tampilkanKomentar() {
        System.out.println("Pengguna: " + pengguna);
        System.out.println("Komentar: " + komentar);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        Komentar komentar1 = new Komentar("User1", "Produk bagus!", 5);
        Komentar komentar2 = new Komentar("User2", "Kualitas kurang memuaskan.", 2);

        komentar1.tampilkanKomentar();
        System.out.println();
        komentar2.tampilkanKomentar();
    }
}
