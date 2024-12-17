import Factory.IAracFactory;
import Factory.SUVFactory;
import Factory.SedanFactory;
import Factory.SporArabaFactory;
import Odeme.BankaKarti;
import Odeme.IOdemeStratijisi;
import Odeme.KrediKart;
import Odeme.Nakit;

public class KiralamaVeOdeme {
    public void aracKirala(String AracTipi){
        if (AracTipi == "Sedan"){
            IAracFactory arac = new SedanFactory();
            arac.IcMekanUret();
            arac.lastikUret();
            arac.motorUret();
        }
        else if (AracTipi == "Spor Araba"){
            IAracFactory Sarac = new SporArabaFactory();
            Sarac.motorUret();
            Sarac.lastikUret();
            Sarac.IcMekanUret();
        }
        else if (AracTipi == "SUV"){
            IAracFactory SUarac = new SUVFactory();
            SUarac.IcMekanUret();
            SUarac.lastikUret();
            SUarac.motorUret();
        }
    }
    public void odemeYap(String odemeTuru, double miktar){
        if (odemeTuru == "Nakit"){
            IOdemeStratijisi N = new Nakit();
            N.OdemeYap(miktar);
        }
        else if (odemeTuru == "Banka Karti"){
            IOdemeStratijisi B = new BankaKarti();
            B.OdemeYap(miktar);
        }
        else if (odemeTuru == "Kredi Karti"){
            IOdemeStratijisi K = new KrediKart();
            K.OdemeYap(miktar);
        }
    }
}
