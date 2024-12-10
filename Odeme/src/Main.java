public class Main {
    public static void main(String[] args) {
        Baglam baglam = new Baglam();
        IOdemeYonetimi oy1 = new KrediKarti();
        baglam.setOdemeYonetimi(oy1);
        baglam.odemeyiTamamla(275.87);
    }
}
