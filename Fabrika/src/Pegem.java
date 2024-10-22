public class Pegem implements KitapFabrikasi{
    @Override
    public Kitap KitapBas(){
        return new EdebiEser();
    }
}
