package Odeme;

public class NakitOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("nakit " + miktar + " odendi\n*************************************************");
    }
}
