package klinika.main;

public class Personel extends Osoba
{
    private int godzinaRozpoczeciaPracy;
    private int godzinaZakonczeniaPracy;






    public Personel(String imie, String nazwisko, String adres, String haslo, int pesel, int godzinaRozpoczeciaPracy, int godzinaZakonczeniaPracy)
    {
        super(imie, nazwisko, adres, haslo, pesel);
        this.godzinaRozpoczeciaPracy = godzinaRozpoczeciaPracy;
        this.godzinaZakonczeniaPracy = godzinaZakonczeniaPracy;
    }

}
