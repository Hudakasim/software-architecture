package UcretHesaplama;

public class AgirlikHesaplama implements IUcretHesaplama{

    @Override
    public double hesapla(double deger) {
        // 10TL/kg
        return (deger * 10);
    }
}
