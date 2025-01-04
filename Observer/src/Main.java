public class Main {
    public static void main(String[] args) {
        HaberAjansi ajans = new HaberAjansi();

        IGozlemci abone1 = new Abone("Ahmet");
        IGozlemci abone2 = new Abone("Ayşe");

        ajans.gozelmciEkle(abone1);
        ajans.gozelmciEkle(abone2);

        ajans.gozlemcileriBilgilendir("Son Dakika: Observer Tasarım Deseni!");

        ajans.gozlemciCikar(abone1);

        ajans.gozlemcileriBilgilendir("Güncelleme: Ahmet abonelikten çıktı.");

    }
}
