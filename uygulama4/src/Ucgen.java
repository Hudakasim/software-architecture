public class Ucgen implements ISekilSablonu{
    private double h;
    private double taban;
    public Ucgen(){}
    public Ucgen(double h, double taban){
        this.h = h;
        this.taban = taban;
    }
    @Override
    public void Cevre() {
        System.out.println("Cevre: ucgenin cevresini bilmiyorum");
    }

    @Override
    public void Alan() {
        System.out.println("Alan: " + 0.5*taban*h);
    }
}
