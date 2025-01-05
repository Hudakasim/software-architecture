public class KargoMerkeziYoneticisi extends KargoFabrikasi{
    private static KargoMerkeziYoneticisi yonetici;

    public KargoMerkeziYoneticisi(){
        // yonetici = new KargoMerkeziYoneticisi();
    }
    public static KargoMerkeziYoneticisi getInstance(){
        if (yonetici == null){
            return new KargoMerkeziYoneticisi();
        }else return yonetici;
    }
}
