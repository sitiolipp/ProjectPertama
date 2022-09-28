/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.io.Console;

/**
 *
 * @author User
 */
public class ContohConsole {
    public static void main(String[] args) {
    String nama;
    int usia;
    Console masukan = System.console();
    System.out.println("Masukan nama =");
    nama = masukan.readLine();
    System.out.println("Masukan usia =");
    usia = Integer.parseInt(masukan.readLine());
    System.out.println("Namamu adalah = "+nama);
    System.out.println("Usiamu adalah = "+usia);
}
}
