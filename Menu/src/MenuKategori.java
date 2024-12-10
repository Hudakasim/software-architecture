import java.util.ArrayList;
import java.util.List;

public class MenuKategori implements IMenuElemani{
    String ad;
    List<IMenuElemani> elemanlar;

    public MenuKategori(String ad){
        this.ad = ad;
        this.elemanlar = new ArrayList<>();
    }
    public void goster(String girinti){
        System.out.println(girinti + " kategori: " + ad);
        for(IMenuElemani eleman:elemanlar){
            eleman.goster(girinti+ " ");
        }
    }
    public void ekle(IMenuElemani eleman){
        elemanlar.add(eleman);
    }
    public void sil(IMenuElemani eleman){
        elemanlar.remove(eleman);
    }
}
