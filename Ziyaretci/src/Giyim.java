public class Giyim implements IUrun{
    @Override
    public void kabulet(IZiyaretci ziyaretci) {
        ziyaretci.giyimVisit(this);
    }
}
