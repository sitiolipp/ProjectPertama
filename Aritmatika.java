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
public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, menit , detik, konversi;
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        jam  = konversi/3600;
        menit= (konversi%3600)/60;
        detik= (konversi%3600)%60;
        
        System.out.println("konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
    }
}
