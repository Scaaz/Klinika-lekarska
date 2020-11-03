package klinika.main;

public class Lekarz extends Personel
{
private String specjalizacja;



    public void aktualizujKartePacjenta(KartaPacjenta karta)
{

}

    public String getSpecjalizacja()
    {
        return specjalizacja;
    }

    public Lekarz(String imie, String nazwisko, String adres, String haslo, int pesel, int godzinaRozpoczeciaPracy, int godzinaZakonczeniaPracy, String specjalizacja)
    {
        super(imie, nazwisko, adres, haslo, pesel, godzinaRozpoczeciaPracy, godzinaZakonczeniaPracy);
        this.specjalizacja = specjalizacja;
    }




}
