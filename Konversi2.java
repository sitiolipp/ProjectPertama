/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Konversi2 {
     public static void main(String[] args) {
        String nim, nama, prodi, matkul, predikat;
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("====masukkan data====");
        System.out.println("masukkan NIM = ");
        nim = masukan.nextLine();
        System.out.println("masukkan nama = ");
        nama = masukan.nextLine();
        System.out.println("matakuliah = ");
        matkul = masukan.nextLine();
        
        System.out.println("====jurusan anda====");
        //=====mengambil jurusan dari NIM
        prodi = nim.substring(3, 5);
        System.out.println(prodi);
        if (prodi.equals("52")) {
            System.out.println("prodi = S1-TI");
        } else if (prodi.equals("51")) {
            System.out.println("prodi = S1-SI");
        } else if (prodi.equals("31")) {
            System.out.println("prodi = D3-SI");
        } else {
            System.out.println("prodi tidak ada");
        }
        
        System.out.println("====nilai anda====");
        //=====kartu hasil studi
        nilai = masukan.nextInt();
         System.out.println(nilai);
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("nilai anda A");
            System.out.println("Sangat Memuaskan");
        } else if (nilai >= 80 && nilai <= 84) {
            System.out.println("nilai anda A-");
            System.out.println("Sangat Memuaskan");
        } else if (nilai >= 75 && nilai <= 79) {
            System.out.println("nilai anda B+");
            System.out.println("Memuaskan");
        } else if (nilai >= 70 && nilai <= 74) {
            System.out.println("nilai anda B");
            System.out.println("Memuaskan");
        } else if (nilai >= 65 && nilai <= 69) {
            System.out.println("nilai anda B-");
            System.out.println("Memuaskan");
        } else if (nilai >= 60 && nilai <= 64) {
            System.out.println("nilai anda C+");
            System.out.println("Cukup");
        } else if (nilai >= 55 && nilai <= 59) {
            System.out.println("nilai anda C");
            System.out.println("Cukup");
        } else if (nilai >= 50 && nilai <= 54) {
            System.out.println("nilai anda C-");
            System.out.println("Cukup");
        } else if (nilai >= 45 && nilai <= 49) {
            System.out.println("nilai anda D");
            System.out.println("Kurang");
        } else if (nilai >= 0 && nilai <= 44) {
            System.out.println("nilai anda E");
            System.out.println("Sangat Kurang");
        } else {
            System.out.println("Tidak Ada Nilai");
         }
     }
}
