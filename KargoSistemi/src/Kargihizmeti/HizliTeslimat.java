package Kargihizmeti;

public class HizliTeslimat implements IKargoHizmeti{
    private IKargoHizmeti kargoHizmeti;

    public HizliTeslimat(IKargoHizmeti ek){
        this.kargoHizmeti = ek;
    }
    @Override
    public double fiyat() {
        double eskiFiyat = this.kargoHizmeti.fiyat();
        double yeniFiyat =  eskiFiyat + 500.00;
        return yeniFiyat;
    }
}
