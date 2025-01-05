package Abone;

import java.util.ArrayList;

import java.util.List;

public class KargoTakipSistemi {

    private List<IAbone> aboneler = new ArrayList<>();

    public void aboneEkle(IAbone abone) {
        aboneler.add(abone);
    }
    public void durumDegistir(String mesaj) {
        for (IAbone abone : aboneler) {
            abone.guncelle(mesaj);
        }
    }
}