/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpertama;

/**
 *
 * @author Lab Aplikasi
 */
public class ProjectPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama ="Kholifah";
        String nik ="35030711111";
        String tmplahir ="Trenggalek", tgllahir = "21-02-2004";
        int usia =18;
        char jkel ='p';
        final double bb = 43.55;
        System.out.println("Identitas Pribadi");
        System.out.println("====================================");
        System.out.println("Nomor Induk Kependudukan :" + nik);
        System.out.println("Namaku :" + nama);
        System.out.println("Usiaku :" + usia);
        System.out.println("Jkelku :" + jkel);
        System.out.format("Tempat, Tanggal Lahir : %s %s %n", tmplahir,tgllahir);
        System.out.println("Berat Badan =" +bb);
        
    }
    
}
