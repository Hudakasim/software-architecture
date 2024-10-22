public class EdebiEser implements Kitap {
    private String kitapAdi;
    private String kitapOzeti;

    public void setAd(String ad){
        kitapAdi = ad;
    }
    public void setOzet(String ozet){
        kitapOzeti = ozet;
    }
    public String getAd(){
        return kitapAdi;
    }
    public String getOzet(){
        return kitapOzeti;
    }
}
