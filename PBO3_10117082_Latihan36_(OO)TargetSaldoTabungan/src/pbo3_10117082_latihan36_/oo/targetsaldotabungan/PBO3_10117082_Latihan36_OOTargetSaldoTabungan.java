/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan36_.oo.targetsaldotabungan;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
* lama tabungan sampai mencapai saldo target dengan konsep oop
 */
public class PBO3_10117082_Latihan36_OOTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tabungan tabung = new Tabungan();

        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;

        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
    }
    
}
