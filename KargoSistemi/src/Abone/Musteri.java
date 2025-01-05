package Abone;

public class Musteri implements IAbone{
    private String ad;

    public Musteri(String ad){
        this.ad = ad;
    }
    @Override
    public void guncelle(String mesaj) {
        System.out.println(ad + " icin mesaj: " + mesaj);
    }
}
