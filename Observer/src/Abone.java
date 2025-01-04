public class Abone implements IGozlemci{
    private String ad;

    public Abone(String ad) {
        this.ad = ad;
    }
    @Override
    public void guncelle(String mesaj) {
        System.out.println(ad + " icin mesaj: " + mesaj);
    }
}
