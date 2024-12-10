public class Baglam {
    private IOdemeYonetimi odemeYonetimi;

    public void setOdemeYonetimi(IOdemeYonetimi odemeYonetimi){
        this.odemeYonetimi = odemeYonetimi;
    }
    public void odemeyiTamamla(double tutar){
        odemeYonetimi.odemeYap(tutar);
    }
}
