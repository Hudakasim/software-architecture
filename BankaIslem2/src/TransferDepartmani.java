public class TransferDepartmani extends Departman{

    @Override
    protected boolean UygunMU(Islem islem) {
        if (islem.getTur().getTurIsmi() == "Para Transferi") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void islemIsle(Islem islem) {
        System.out.println("transfer isi tamam");
    }
}
