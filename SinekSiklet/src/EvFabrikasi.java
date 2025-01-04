import java.util.HashMap;
import java.util.Map;

public class EvFabrikasi {
    private Map<String, IEv> havuz= new HashMap<>();
    public IEv getEv(String evTipi){
        IEv ev = havuz.get(evTipi);
        if (ev == null) {
            ev = new EvConcrete(evTipi);
            havuz.put(evTipi, ev);
        }
        return ev;
    }
}
