/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.praktikum5;

/**
 *
 * @author Marsy
 */
import java.util.Scanner;

public class DiskonBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Input total pembelian pembeli
        System.out.print("Total pembelian Rp: ");
        double totalPembelian = input.nextDouble();
        
        // Menghitung besarnya potongan diskon
        double potonganDiskon;
        if (totalPembelian < 50000) {
            potonganDiskon = 0.05 * totalPembelian;
        } else {
            potonganDiskon = 0.20 * totalPembelian;
        }
        //untukmenghitung total pembayaran pembeli
        double totalBayar = totalPembelian - potonganDiskon;
        
        // Output hasilnya
        System.out.println("\n--- Output ---");
        System.out.println("Total pembelian Rp: " + totalPembelian);
        System.out.println("Besarnya potongan Rp: " + potonganDiskon);
        System.out.println("Jumlah yang harus dibayarkan Rp: " + totalBayar);
        
        input.close();
    }
    
}
