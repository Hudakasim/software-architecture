public class Departman {
    protected Departman sonraki;

    public void setSonraki(Departman sonraki){
        this.sonraki = sonraki;
    }
    public void IslemYap(Islem islem){

    }
    protected boolean islemUygunMu(Islem islem){
        return true;
    }
    protected void islemIsle(Islem islem){

    }
}
