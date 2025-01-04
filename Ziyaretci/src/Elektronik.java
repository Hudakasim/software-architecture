public class Elektronik implements IUrun{
    @Override
    public void kabulet(IZiyaretci ziyaretci) {
        ziyaretci.elektronikVisit(this);
    }
}
