/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan20.targetsaldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung target dari saldo tabungan
 */
public class PBOIF210119064Latihan20TargetSaldoTabungan {
    
    public static void targetSaldoTabungan(double saldoAwal, double bunga){
        double saldoAkhir = 0,
               bungabulan;
        int i = 1;
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bungabulan = bunga/100;
        
        while(saldoAkhir <= 6000000){
            saldoAkhir = (saldoAwal * bungabulan) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
            i++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal, bunga;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal : ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Masukkan bunga/bulan(8%) : ");
        bunga = keyboard.nextInt();
        
        System.out.println("");
        targetSaldoTabungan(saldoAwal, bunga);
    }
    
}
