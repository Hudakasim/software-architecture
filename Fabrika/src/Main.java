public class Main {
    public static void main(String[] args) {
        YayinEvi Y1 = YayinEvi.getInstance(); // yayın evi seçmek
        KitapFabrikasi fabrika1 = Y1.getFabrika("DersKitabi"); // ders kitabı üretsin(ders kiştabı basılcak)
        Kitap kitap1 = fabrika1.KitapBas();
        System.out.println(kitap1.toString());
    }
}
