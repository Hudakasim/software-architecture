
import java.util.Map;

public class IslemTuruFabrikasi {
    private static Map<String, IslemTuru> turler;

    public IslemTuru getIslemTuru(String isim){
        IslemTuru ad = turler.get(isim);
        return ad;
    }
}
