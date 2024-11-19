public class Main {
    public static void main(String[] args) {

        // piyade
        IPiyade ilk = new Piyade(100, 20, 5);
        PiyadeKaydi kayit = new PiyadeKaydi();
        kayit.prototipEkle("ilkPiyade", ilk);

        // okçu piyade
        Piyade okcu = (Piyade) ilk.birimClone();
        okcu.hizAyarla(20);
        okcu.saglikAyarla(98);
        okcu.saldiriAyarla(25);

        kayit.prototipEkle("okcu1", okcu);
        okcu.ozellikleriGoster();

        // atlı piyade
        Piyade atli = (Piyade) ilk.birimClone();
        atli.hizAyarla(100);
        atli.saldiriAyarla(45);
        atli.saglikAyarla(66);

        kayit.prototipEkle("atli1", atli);
        atli.ozellikleriGoster();

    }
}
