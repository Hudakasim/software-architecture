public class Main {

    public static void main(String[] args) {
        KiralamaVeOdeme aracSistemi = new KiralamaVeOdeme();


        // Araç kiralama ve ödeme işlemleri

        aracSistemi.aracKirala("sedan");

        aracSistemi.odemeYap("kredi karti", 350.00);



        aracSistemi.aracKirala("suv");

        aracSistemi.odemeYap("banka karti", 500.00);



        aracSistemi.aracKirala("spor araba");

        aracSistemi.odemeYap("nakit", 700.00);

    }

}