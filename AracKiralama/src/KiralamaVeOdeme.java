import Factory.*;
import Odeme.*;

public class KiralamaVeOdeme {
    public void aracKirala(String tipi){
        if (tipi == "sedan"){
            IAracFactory arac = new SedanFactory();
            arac.motorUret();
            arac.lastikUret();
            arac.icMekanUret();
            System.out.println("SEDAN URETILDI\n*************************************************");
        }
        else if (tipi == "suv"){
            IAracFactory arac = new SUVFactory();
            arac.motorUret();
            arac.lastikUret();
            arac.icMekanUret();
            System.out.println("SUV URETILDI\n*************************************************");
        }
        else if (tipi == "spor araba"){
            IAracFactory arac = new SporArabaFactory();;
            arac.motorUret();
            arac.lastikUret();
            arac.icMekanUret();
            System.out.println("SPOR ARABA URETILDI\n*************************************************");
        }
    }
    public void odemeYap(String tur, double miktar){
        if (tur == "kredi karti"){
            IOdemeStratejisi odeme = new KrediKartiOdeme();
            odeme.odemeYap(miktar);
        }
        else if (tur == "banka karti"){
            IOdemeStratejisi odeme = new BankaKartiOdeme();
            odeme.odemeYap(miktar);
        }
        else if (tur == "nakit"){
            IOdemeStratejisi odeme = new NakitOdeme();
            odeme.odemeYap(miktar);
        }
    }
}
