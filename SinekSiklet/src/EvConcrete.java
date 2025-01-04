public class EvConcrete implements IEv{
    private String evTipi;
    public EvConcrete(String evTipi) {
        this.evTipi = evTipi;
    }
    @Override
    public void tasarla(String detay) {
        System.out.println(detay + " detayli ve " + evTipi + "bir ev olusturuldu");
    }
}
