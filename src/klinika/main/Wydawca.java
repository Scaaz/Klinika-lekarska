package klinika.main;

import java.util.ArrayList;
import java.util.List;

public class Wydawca implements Obserwator{
    private List<Osoba> osobyObserwujace=new ArrayList<>();
    private List<String> ogloszenia = new ArrayList<>();
    private int glownyStatus;

    @Override
    public void obserwuj(Osoba o){
        osobyObserwujace.add(o);
    }

    @Override
    public void przestanObserwowac(Osoba o){
        osobyObserwujace.remove(o);
    }

    @Override
    public void wyslijInformacjeObserwujacym(){
        if(glownyStatus!=0){
            for(Osoba obserwujacy : osobyObserwujace){
                obserwujacy.wyswietlOgloszenia();
            }
            glownyStatus=0;
        }
    }

    public List<Osoba> getOsobyObserwujace() {
        return osobyObserwujace;
    }

    public int getGlownyStatus() {
        return glownyStatus;
    }

    public List<String> getOgloszenia() {
        return ogloszenia;
    }

    public void setGlownyStatus(int glownyStatus) {
        this.glownyStatus = glownyStatus;
    }

    public Wydawca() {
        this.glownyStatus = 0;
    }
}
