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

public class KriteriaBeratBadan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // untuk imput berat badan
        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        // untuk imput tinggi badan
        System.out.print("Tinggi Badan (cm): ");
        double tinggiBadan = input.nextDouble();
        // untuk menghitung berat indeks masa tubuh
        String Kriteria; 
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        if (imt < 18.5) {
            Kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            Kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            Kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            Kriteria = "Gemuk";
        } else {
            Kriteria = "Sangat Gemuk";
        }
        
        // hasil outputnya
        System.out.println("\n--- Output ---");
        System.out.println("Nilai Indeks Masa Tubuh: " + imt);
        System.out.println("Kategori: " + Kriteria);
    }
    
}
