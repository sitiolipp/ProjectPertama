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
public class TugasPerulangan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("----Menampilkan Looping Bilangan Genap----");
        System.out.println("masukkan nilai awal = ");
        int awal = masukan.nextInt();
        System.out.println("masukkan nilai akhir = ");
        int akhir = masukan.nextInt();
        System.out.println("Hasilnya adalah....");
        for (int a=awal; a<=akhir; a++) {
            if (a%2==0) {
                System.out.println(a);
            }
        }
        
        System.out.println("----Masuk Wilayah Perulangan----");
        System.out.println("C");
        for (int a=5; a>=1; a--) {
            for (int b=1; b<5; b++) {
                System.out.print("*");
        }
            System.out.println("0");
        }
        
        System.out.println("C");
        int i=5;
        while (i>=1) {
            int j=1;
            while (j<=5) {
                System.out.print(j==5 ? "0" : "*");
                j++;
            }
            System.out.println();
            i--;
        }
        
        System.out.println("C");
        int x=5;
        int y=1;
        do {
        System.out.print(y==x && x==y || x==5 ? "0" : "*");
        x--;
        
        do {
            System.out.println("");
            y++;
        } while (y<=5);
        } while (x>=1);
    }
}
