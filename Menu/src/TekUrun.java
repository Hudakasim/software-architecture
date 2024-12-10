public class TekUrun implements IMenuElemani {
    String ad;
    double fiyat;

    public TekUrun(String ad, double fiyat){
        this.ad = ad;
        this.fiyat = fiyat;
    }
    public void goster(String girinti){
        System.out.println(girinti + " Urun: " + ad + " fiyat: " + fiyat + "TL");
    }
}
