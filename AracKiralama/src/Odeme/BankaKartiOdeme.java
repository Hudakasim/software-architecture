package Odeme;

public class BankaKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("banka kartiyla " + miktar + " odendi\n*************************************************");
    }
}
