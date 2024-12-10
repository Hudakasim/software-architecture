public class Main {
    public static void main(String[] args) {
        TekUrun Durum = new TekUrun("Durum", 150);
        TekUrun Ayran = new TekUrun("Ayran", 70);

        MenuKategori mk = new MenuKategori("Ana Menu");
        MenuKategori mkicecek = new MenuKategori("Icecek");
        MenuKategori mkYiyecek = new MenuKategori("Yiyecek");

        mkicecek.ekle(Ayran);
        mkYiyecek.ekle(Durum);

        mk.ekle(mkicecek);
        mk.ekle(mkYiyecek);
        mk.ekle(Durum);

        mk.goster("-");
    }
}
