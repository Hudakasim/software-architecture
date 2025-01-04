import java.util.Map;

public class IslemTuruFabrikasi {
    private static Map <String, IslemTuru> turler;

    public IslemTuru getIslemTuru(String isim){
        IslemTuru ISLEM = new IslemTuru(isim);
        turler.put(isim, ISLEM);
        return ISLEM;
    }
}
