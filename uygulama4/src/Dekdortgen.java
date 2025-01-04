public class Dekdortgen implements ISekilSablonu{
    private double L;
    private double W;
    public Dekdortgen(){}
    public Dekdortgen(double L, double W) {
        this.L = L;
        this.W = W;
    }
    @Override
    public void Cevre() {
        System.out.println("Cevre: " + L*2+W*2);
    }

    @Override
    public void Alan() {
        System.out.println("Alan: " + L*W);
    }
}
