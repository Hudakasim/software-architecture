public class Islem {
    //islem turun adi
    private IslemTuru islemTuru;
    private String detaylar;

    public Islem ( String turIsmi, String detaylar) {
        this.detaylar = detaylar;
        islemTuru = new IslemTuru(turIsmi);
    }
    public IslemTuru getTur(){
        return islemTuru;
    }
    public String getDetaylar(){
        return detaylar;
    }
    public void kabulEt(IZiyaretci ziyaretci){
        ziyaretci.ziyaretEt(this);
    }
}
