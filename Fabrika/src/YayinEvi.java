public class YayinEvi {
    private static YayinEvi instance;

    private YayinEvi(){ // to make constuctor private

    }
    public static YayinEvi getInstance(){
        if (instance == null)
            return new YayinEvi();
        else
            return instance;
    }
    public KitapFabrikasi getFabrika(String KitapTuru){
        if (KitapTuru == "EdebiEser")
            return new KBY();
        else if (KitapTuru == "DersKitabi")
            return new Pegem();
        return null;
    }
}
