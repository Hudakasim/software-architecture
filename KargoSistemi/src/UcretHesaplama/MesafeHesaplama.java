package UcretHesaplama;

public class MesafeHesaplama implements IUcretHesaplama{
    @Override
    public double hesapla(double deger) {
        // 5TL/km
        return (5 * deger);
    }
}
