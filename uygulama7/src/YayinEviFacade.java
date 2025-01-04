public class YayinEviFacade {
    private UrunYoneticisi urunYoneticisi;

    public YayinEviFacade() {
        urunYoneticisi = new UrunYoneticisi();
    }
    public void kitapEkle(Kitap kitap) {
        urunYoneticisi.urunKaydet("kitap", kitap);
    }
    public void DergiEkle(Dergi dergi) {
        urunYoneticisi.urunKaydet("dergi", dergi);
    }
    public Urun kitpaSatinAl(){
        return urunYoneticisi.kopyaAl("kitap");
    }
    public Urun dergiSatinAl(){
        return urunYoneticisi.kopyaAl("dergi");
    }

}
