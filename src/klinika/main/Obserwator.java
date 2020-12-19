package klinika.main;

public interface Obserwator {
    public void obserwuj(Osoba o);
    public void przestanObserwowac(Osoba o);
    public void wyslijInformacjeObserwujacym();
}
