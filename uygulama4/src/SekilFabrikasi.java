public class SekilFabrikasi {
    public ISekilSablonu SekilOlustur(int SekilNumarasi){
        if (SekilNumarasi == 1){
            return new Dekdortgen();
        }
        else if (SekilNumarasi == 2){
            return new Ucgen();
        }else{
            return null;
        }
    }
}
