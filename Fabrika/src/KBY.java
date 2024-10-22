public class KBY implements KitapFabrikasi{

    @Override
    public Kitap KitapBas(){
        return new DersKitabi();
    }
}
