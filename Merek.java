/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Merek {
    
        private String namaMerek;
    private String kodeMerek;
    
    public Merek(String namaMerek, String kodeMerek) {
        this.namaMerek = namaMerek;
        this.kodeMerek = kodeMerek;
    }
    
    public String getNamaMerek() {
        return namaMerek;
    }
    
    public String getKodeMerek() {
        return kodeMerek;
    }
    
    public void setNamaMerek(String namaMerek) {
        this.namaMerek = namaMerek;
    }
    
    public void setKodeMerek(String kodeMerek) {
        this.kodeMerek = kodeMerek;
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan kelas MerekProduk
        Merek merek1 = new Merek("ABC", "123");
        System.out.println("Nama Merek: " + merek1.getNamaMerek());
        System.out.println("Kode Merek: " + merek1.getKodeMerek());
        
        merek1.setNamaMerek("XYZ");
        merek1.setKodeMerek("456");
        System.out.println("Nama Merek (setelah diubah): " + merek1.getNamaMerek());
        System.out.println("Kode Merek (setelah diubah): " + merek1.getKodeMerek());
    }
    
}
