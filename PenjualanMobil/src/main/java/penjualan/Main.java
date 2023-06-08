/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import barang.Mobil;
import java.util.List;

/**
 *
 * @author budi
 */
public class Main {
    public static void main(String[] args) {
        PenjualanMobil penjualanMobil = new PenjualanMobil();

        // Tambah mobil ke dalam daftar
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, 500000000);
        penjualanMobil.BeliMobil(mobil1);
        System.out.println("Modal Sekarang Setelah Pembelian Sekarang"+penjualanMobil.modal);
        System.out.println("Jumlah Nilai Aset"+penjualanMobil.nilaiAsset);

        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, 600000000);
        penjualanMobil.BeliMobil(mobil2);
        System.out.println("Modal Sekarang Setelah Pembelian Sekarang"+penjualanMobil.modal);
        System.out.println("Jumlah Nilai Aset"+penjualanMobil.nilaiAsset);

        // Cari mobil berdasarkan merek
        List<Mobil> hasilPencarian = penjualanMobil
            .cariMobilBerdasarkanMerek("Toyota");
        for (Mobil mobil : hasilPencarian) {
            System.out.println("Merek: "+  mobil.getMerek() + "\nModel:  " 
                + mobil.getModel());
        }

        // Hapus mobil dari daftar
        penjualanMobil.JualMobil(mobil2);
        System.out.println("Modal Sekarang Setelah Pembelian Mobil"+penjualanMobil.modal);
        System.out.println("Jumlah Nilai Aset"+penjualanMobil.nilaiAsset);
    }
}