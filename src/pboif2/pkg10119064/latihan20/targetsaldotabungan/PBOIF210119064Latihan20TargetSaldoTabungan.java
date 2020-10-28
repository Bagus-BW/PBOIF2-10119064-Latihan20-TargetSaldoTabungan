/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan20.targetsaldotabungan;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung target dari saldo tabungan
 */
public class PBOIF210119064Latihan20TargetSaldoTabungan {
    
    public static void targetSaldoTabungan(double saldoAwal){
        double saldoAkhir = 0;
        int i = 1;
        
        while(saldoAkhir <= 6000000){
            saldoAkhir = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " Rp. %,1.0f%n", Math.floor(saldoAkhir));
            saldoAwal = saldoAkhir;
            i++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal;
        
        saldoAwal = 3500000;
        targetSaldoTabungan(saldoAwal);
    }
    
}
