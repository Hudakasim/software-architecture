public class Islem {
    private IslemTuru islemTuru;
    private String detaylar;

    public Islem(String tur, String detaylar){
        this.detaylar = detaylar;
        new IslemTuru.getIsim(tur);
    }
    public IslemTuru getTur(){
        return tur;
    }
    public String getDetaylar(){
        return detaylar;
    }
    public void kabulEt (IZiyaretci ziyaretci){

    }
}
