/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m_andre_naufal_2110010052;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class M_Andre_Naufal_2110010052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
             Scanner input = new Scanner(System.in);
        int totalItems = 0;
        double totalPrice = 0;

        System.out.println("=== Amdin Penjualan ===");

        while (true) {
            System.out.print("Masukkan Nama Produk (Atau 'Keluar' untuk menyelesaikan): ");
            String itemName = input.nextLine();

            if (itemName.equalsIgnoreCase("Keluar")) {
                break;
            }

            System.out.print("Jumlah barang : ");
            int quantity = input.nextInt();

            System.out.print("Masukkan harga per barang: ");
            double price = input.nextDouble();

            input.nextLine(); // Consume the newline character

            double itemTotal = quantity * price;
            totalItems += quantity;
            totalPrice += itemTotal;

            System.out.println("Barang: " + itemName);
            System.out.println("Jumlah :  " + quantity);
            System.out.println("Harga per barang: " + price);
            System.out.println("Total: " + itemTotal);
            System.out.println();
        }

        System.out.println("=== Admin Penjualan ===");
        System.out.println("Total barang terjual: " + totalItems);
        System.out.println("Total jumlah : " + totalPrice);

        input.close();

    }
        
              
    }