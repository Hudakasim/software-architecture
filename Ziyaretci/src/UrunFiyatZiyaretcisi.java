public class UrunFiyatZiyaretcisi implements IZiyaretci{
    @Override
    public void elektronikVisit(Elektronik elektronik) {
        System.out.println("elektrik urunu");
    }

    @Override
    public void giyimVisit(Giyim giyim) {
        System.out.println("giyim urunu");
    }

}
