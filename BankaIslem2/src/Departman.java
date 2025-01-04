public abstract class Departman {
    protected Departman sonraki;

    public void setSonraki(Departman sonraki) {
        this.sonraki = sonraki;
    }
    public void islemYap(Islem islem){
        if(UygunMU(islem)){
            islemIsle(islem);
        }else if(sonraki != null && sonraki.UygunMU(islem)){
            sonraki.islemIsle(islem);
        }else{
            System.out.println("ISLEM GECERSIZ");
        }
    }
    protected abstract boolean UygunMU(Islem islem);
    protected abstract void islemIsle(Islem islem);
}
