public class Kitap implements Urun{
    private String baslik;
    private String yazar;

    public Kitap(String baslik, String yazar) {
        this.baslik = baslik;
        this.yazar = yazar;
    }

    @Override
    public void bilgiGoster() {
        System.out.println(baslik + " " + yazar);
    }

    @Override
    public Urun kopyala() {
        return new Kitap(baslik, yazar);
    }
}
