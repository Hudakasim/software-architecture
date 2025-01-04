public class RiskAnaliziZiyaretci implements IZiyaretci {
    public void ziyaretEt(Islem islem){
        if (islem.getTur().getTurIsmi() == "Para Transferi" || islem.getTur().getTurIsmi() == "Kredi Basvurusu") {
            System.out.println("rizsksiz islem");
        }else{
            System.out.println("riskli islem");
        }
    }
}
