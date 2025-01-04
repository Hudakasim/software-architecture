public class Dergi implements Urun{
    private String baslik;
    private String sayi;

    public Dergi(String baslik, String sayi) {
        this.baslik = baslik;
        this.sayi = sayi;
    }

    @Override
    public void bilgiGoster() {
        System.out.println(baslik + " " + sayi);
    }

    @Override
    public Urun kopyala() {
        return new Dergi(baslik, sayi);
    }
}
