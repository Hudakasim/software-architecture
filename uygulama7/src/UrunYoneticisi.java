import java.util.Map;

public class UrunYoneticisi {
    private Map<String, Urun> urunHaritasi;

    public void urunKaydet(String anahtar, Urun urun){
        urunHaritasi.put(anahtar, urun);
    }
    public Urun kopyaAl(String anahtar){
        Urun A = urunHaritasi.get(anahtar);
        if (A != null){
            return A.kopyala();
        }else{
            return null;
        }
    }
}
