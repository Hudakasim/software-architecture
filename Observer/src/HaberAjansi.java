import java.util.ArrayList;
import java.util.List;

public class HaberAjansi implements IGozlenen{
    private List<IGozlemci> gozlemciler = new ArrayList<IGozlemci>();

    @Override
    public void gozelmciEkle(IGozlemci gozelmci) {
        gozlemciler.add(gozelmci);
    }

    @Override
    public void gozlemciCikar(IGozlemci gozlemci) {
        gozlemciler.remove(gozlemci);
    }

    @Override
    public void gozlemcileriBilgilendir(String mesaj) {
        for (IGozlemci G : gozlemciler){
            G.guncelle(mesaj);
        }
    }
}
