public class KrediDepartmani extends Departman{

    @Override
    protected boolean UygunMU(Islem islem) {
        if(islem.getTur().getTurIsmi() == "Kredi Basvurusu") {
            return true;
        }else {
            return false;
        }
    }
    @Override
    protected void islemIsle(Islem islem) {
        System.out.println("Kredi islemi tamam");
    }

}
