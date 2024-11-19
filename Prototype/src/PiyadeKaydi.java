import java.util.HashMap;
import java.util.Map;

public class PiyadeKaydi {
    private Map<String, IPiyade> piyadeHaritasi = new HashMap<>();

    // set
    public void prototipEkle(String anahtar, IPiyade piyade){
        piyadeHaritasi.put(anahtar, piyade);
    }
    // get
    public IPiyade prototipGetir(String anahtar){
        IPiyade prototip = piyadeHaritasi.get(anahtar);
        //     (     koşul    )   (      if(koşul)    )  (else)
        return prototip != null ? prototip.birimClone(): null;
    }
}
