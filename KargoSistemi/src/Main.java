import Abone.*;
import Kargihizmeti.*;
import Kargolar.*;
import UcretHesaplama.*;

public class Main {

    public static void main(String[] args) {

        // Singleton: Kargo Merkezi Yöneticisi oluşturuluyor
        System.out.println("**********************Singleton********************");
        KargoMerkeziYoneticisi yonetici = KargoMerkeziYoneticisi.getInstance();

        System.out.println("Kargo Merkezi Yöneticisi Başlatıldı");



        // Factory: Farklı türde kargolar oluşturuluyor
        System.out.println("**********************Factory**********************");

        KargoFabrikasi kargoFabrikasi = new KargoFabrikasi();

        IKargo normalKargo = kargoFabrikasi.kargoOlustur("Normal");

        IKargo hizliKargo = kargoFabrikasi.kargoOlustur("Hizli");

        IKargo uluslararasiKargo = kargoFabrikasi.kargoOlustur("Uluslararasi");



        System.out.println("Kargolar oluşturuldu:");

        normalKargo.kargoBilgi();

        hizliKargo.kargoBilgi();

        uluslararasiKargo.kargoBilgi();


        // Observer: Kargo takip sistemi ve müşteri ekleme
        System.out.println("**********************Observer*********************");

        KargoTakipSistemi takipSistemi = new KargoTakipSistemi();

        Musteri musteri1 = new Musteri("Ali");

        Musteri musteri2 = new Musteri("Veli");



        takipSistemi.aboneEkle(musteri1);

        takipSistemi.aboneEkle(musteri2);

        takipSistemi.durumDegistir("Kargo İstanbul'a ulaştı");



        // Strategy: Ücret hesaplama
        System.out.println("**********************Strategy*********************");

        MesafeHesaplama mesafeHesaplama = new MesafeHesaplama();

        AgirlikHesaplama agirlikHesaplama = new AgirlikHesaplama();

        double mesafeUcreti = mesafeHesaplama.hesapla(500); // 500 km

        double agirlikUcreti = agirlikHesaplama.hesapla(10); // 10 kg



        System.out.println("Mesafe Ücreti: " + mesafeUcreti);

        System.out.println("Ağırlık Ücreti: " + agirlikUcreti);



        // Decorator: Ek hizmetlerle kargo maliyetleri
        System.out.println("**********************Decorator********************");

        TemelKargo temelKargo = new TemelKargo();

        SigortaliKargo sigortaliKargo = new SigortaliKargo(temelKargo);

        HizliTeslimat hizliTeslimatKargo = new HizliTeslimat(sigortaliKargo);



        System.out.println("Temel Kargo Fiyatı: " + temelKargo.fiyat());

        System.out.println("Sigortalı Kargo Fiyatı: " + sigortaliKargo.fiyat());

        System.out.println("Hızlı Teslimatlı Sigortalı Kargo Fiyatı: " + hizliTeslimatKargo.fiyat());

    }

}