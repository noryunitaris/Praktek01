/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author riznaida
 */
public class SeranggaAksi {
    public static void main(String[] args) {
        Serangga KupuKupu = new Serangga();
        Serangga Lebah = new Serangga();
        Serangga Ngengat = new Serangga();
        
        KupuKupu.nama="Kupu-Kupu";
        KupuKupu.Makanan="Serbuk Sari/Nektar dan buah busuk";
        KupuKupu.WaktuAktif="Siang Hari";
        KupuKupu.MasaHidup="Beberapa Minggu";
        KupuKupu.Habitat="Padang Rumput dan Kebun";
        
      KupuKupu.CaraSimbiosis();
      
        Lebah.nama       ="Lebah";
        Lebah.Makanan    ="Serbuk Sari/Nektar";
        Lebah.WaktuAktif ="Siang Hari";
        Lebah.MasaHidup  ="122 sampai 152 hari";
        Lebah.Habitat    ="Pohon Kayu dan Atap Rumah";

    }
    
}
