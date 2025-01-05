package Kargihizmeti;

public class SigortaliKargo implements IKargoHizmeti{
    private IKargoHizmeti kargoHizmeti;

    public SigortaliKargo(IKargoHizmeti ek){
        this.kargoHizmeti = ek;
    }
    @Override
    public double fiyat() {
        double eskiFiyat = this.kargoHizmeti.fiyat();
        double yeniFiyat = eskiFiyat + 100.00;
        return yeniFiyat;
    }
}
