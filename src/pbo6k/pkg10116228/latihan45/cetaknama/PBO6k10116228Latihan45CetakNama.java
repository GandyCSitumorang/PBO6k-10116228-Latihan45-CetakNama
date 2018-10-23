/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan45.cetaknama;
import java.util.Scanner;
/**
 * Nama : Gandy Christian Situmorang
 * Kelas: PBO-6K
 * NIM  : 10116228
 *Deskripsi Program : program ini berisi aplikasi pencetakan nama sesuai inputan
 * nama yang dimasukkan
 */
public class PBO6k10116228Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===Aplikasi Pencetakkan Nama===");
        
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scn.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
