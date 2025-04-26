/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Yudhi Putra
 * TGL : 26-04-2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();
//        SegiTiga01.alas = 8;
//        SegiTiga01.tinggi = 5;
//        System.out.println("Luas Segitiga : "+SegiTiga01.HitungLuas() );
//    }
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();

        System.out.print("Masukkan Alas Segitiga: ");
        SegiTiga01.alas = a.nextInt(); 

        System.out.print("Masukkan Tinggi Segitiga: ");
        SegiTiga01.tinggi = a.nextInt(); 

        System.out.println("Hitung Luas Segitiga: " + SegiTiga01.HitungLuas());
        
    }
}
