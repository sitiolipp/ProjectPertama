/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class ContohBuffer {
    public static void main(String[] args) throws IOException {
         InputStreamReader isr = new InputStreamReader(System.in);
         String nama;
         int usia;
         BufferedReader br = new BufferedReader(isr);
         
         System.out.print("Masukkan Nama = ");
         nama = br.readLine();
         System.out.print("Masukkan usia = ");
         usia = Integer.parseInt(br.readLine());
         System.out.println("Namamu adalah = "+nama);
         System.out.println("Usiamu adalah = "+usia);
     }
}
