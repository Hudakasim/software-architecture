import Motor.IMotor;
import Motor.SedanMotor;

public class Main {

    public static void main(String[] args) {

        KiralamaVeOdeme aracSistemi = new KiralamaVeOdeme();


        // Araç kiralama ve ödeme işlemleri

        aracSistemi.aracKirala("Sedan");

        aracSistemi.odemeYap("Kredi Karti", 350.00);


        aracSistemi.aracKirala("SUV");

        aracSistemi.odemeYap("Banka Karti", 500.00);


        aracSistemi.aracKirala("Spor Araba");

        aracSistemi.odemeYap("Nakit", 700.00);

    }

}
