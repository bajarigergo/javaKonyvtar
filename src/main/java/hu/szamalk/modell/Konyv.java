package hu.szamalk.modell;

import java.util.ArrayList;

public class Konyv {
    private String cim;
    private ArrayList<String> szerzok;
    private int kiadas;
    private int ar;
    private boolean kiadhato;

    public Konyv(String cim, ArrayList<String> szerzok, int kiadas, int ar, boolean kiadhato) {
        this.cim = cim;
        this.szerzok = szerzok;
        this.kiadas = kiadas;
        this.ar = ar;
        this.kiadhato = kiadhato;
    }

    public Konyv(String cim, String szerzo, int kiadas, int ar, boolean kiadhato) {
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add(szerzo);
        this(cim, szerzok, kiadas, ar, kiadhato);
    }


    public Konyv(String cim, ArrayList<String> szerzok, int kiadas, int ar) {
        this.cim = cim;
        this.szerzok = szerzok;
        this.kiadas = kiadas;
        this.ar = ar;
    }


    public Konyv(String cim, String szerzo, int kiadas, int ar) {
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add(szerzo);
        this(cim,szerzok, kiadas, ar);

    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzok=" + szerzok +
                ", kiadas=" + kiadas +
                ", ar=" + ar +
                ", kiadhato=" + kiadhato +
                '}';
    }

    public ArrayList<String> getSzerzok() {
        return szerzok;
    }

    public boolean isKiadhato() {
        return kiadhato;
    }

    public void setKiadhato(boolean kiadhato) {
        this.kiadhato = kiadhato;
    }

    public int getKiadas() {
        return kiadas;
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }
}
