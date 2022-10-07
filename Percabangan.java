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
public class Percabangan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukkan angka = ");
        int angka = masukan.nextInt();
        if (angka%2==0) {
        System.out.println("bilangan genap");
        } else {
        System.out.println("bilangan ganjil");
        }
    }
}
