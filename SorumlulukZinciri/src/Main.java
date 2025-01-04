public class Main {
    public static void main(String[] args) {
        SupportHandler teknik = new TeknikDestekHandler();
        SupportHandler fatura = new FaturamaHandler();
        SupportHandler genel = new GenelDestekHandler();

        teknik.setNextHandler(fatura);
        fatura.setNextHandler(genel);

        teknik.handleRequest("teknik");
        teknik.handleRequest("fatura");
        teknik.handleRequest("genel");
    }
}