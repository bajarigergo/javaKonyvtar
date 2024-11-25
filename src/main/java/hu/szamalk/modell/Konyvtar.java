package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Konyvtar {

    private ArrayList<Konyv> konyvek;

    public Konyvtar() {
        konyvek = new ArrayList<>();
    }
    public Konyvtar(ArrayList<Konyv> konyvek) {
        this.konyvek = konyvek;
    }
    public void konyvFelvesz(String cim, ArrayList<String> szerzok, int kiadas, int ar, boolean kiadhato){
        Konyv ujKonyv = new Konyv(cim, szerzok, kiadas, ar, kiadhato);
        konyvek.add(ujKonyv);
    }


    public void konyvFelvesz(String cim, String szerzo, int kiadas, int ar, boolean kiadhato){
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add(szerzo);
        Konyv ujKonyv = new Konyv(cim, szerzok, kiadas, ar, kiadhato);
        konyvek.add(ujKonyv);
    }
    public void keszletKiir(){
        Collections.sort(konyvek, Comparator.comparingInt(Konyv::getKiadas));
        for (int i = 0; i < konyvek.size(); i++) {
            System.out.println(konyvek.get(i));
        }

    }
    public void kolcsonozheto(){
        for (Konyv konyv: konyvek){
            if (konyv.isKiadhato()){
                System.out.println(konyv);
            }
        }
    }
    public void kolcsonoz(int i){
        if (konyvek.get(i).isKiadhato()){
            konyvek.get(i).setKiadhato(false);
        }
    }
    public Konyv legdragabb(){
        int max = 0;
        for (int i = 1; i < konyvek.size(); i++) {
            if( konyvek.get(max).getAr() < konyvek.get(i).getAr()){
                max = i;
            }
        }
        return konyvek.get(max);
        //return Collections.max(konyvek, Comparator.comparingInt(Konyv::getAr));
    }
    public boolean vanEKiadasiEvSzerint(int ev){
        boolean valasz=false;
        int i = 0;
        while (!valasz && i <konyvek.size()){
            valasz = (konyvek.get(i).getKiadas() == ev);
            i++;
        }
        return valasz;
    }
    public boolean csakEgySzerzo(){
        boolean valasz=true;
        int i = 0;
        while (valasz && i <konyvek.size()){
            valasz = (konyvek.get(i).getSzerzok().size()<2);
            i++;
        }
        return valasz;
    }
}


