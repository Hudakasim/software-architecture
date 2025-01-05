import Kargolar.HizliKargo;
import Kargolar.IKargo;
import Kargolar.NormalKargo;
import Kargolar.UluslararasiKargo;

public class KargoFabrikasi {
    public IKargo kargoOlustur(String tip){
        if (tip == "Normal"){
            return new NormalKargo();
        } else if (tip == "Hizli") {
            return new HizliKargo();
        }else if (tip == "Uluslararasi"){
            return new UluslararasiKargo();
        }else{
            return null;
        }
    }
}
