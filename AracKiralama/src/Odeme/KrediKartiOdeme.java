package Odeme;

public class KrediKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("kredi kartiyla " + miktar + " odendi\n*************************************************");
    }
}
