/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penjualan;

/**
 *
 * @author budi
 */
import barang.Mobil;
import java.util.ArrayList;
import java.util.List;

public class PenjualanMobil {
    double modal = 10000000000.0;
    double nilaiAsset = 0.0;
    
    private List<Mobil> daftarMobil;

    public PenjualanMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void BeliMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        modal=modal-mobil.getHarga();
        nilaiAsset=nilaiAsset+mobil.getHarga();
    }

    public void JualMobil(Mobil mobil) {
        daftarMobil.remove(mobil);
        modal=modal+mobil.getHarga();
        nilaiAsset=nilaiAsset-mobil.getHarga();
    }

    public List<Mobil> cariMobilBerdasarkanMerek(String merek) {
        List<Mobil> hasilPencarian = new ArrayList<>();
        for (Mobil mobil : daftarMobil) {
            if (mobil.getMerek().equalsIgnoreCase(merek)) {
                hasilPencarian.add(mobil);
            }
        }
        return hasilPencarian;
    }
    
    public void jualMobil(Mobil yangdiJual){
        
    }
}

