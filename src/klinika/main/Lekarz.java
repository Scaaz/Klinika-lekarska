package klinika.main;

public class Lekarz extends Personel
{
private String specjalizacja;

public boolean grafik [][] = new boolean[5][this.getGodzinaZakonczeniaPracy()-this.getGodzinaRozpoczeciaPracy()];




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

        for (int i=0; i<5; i++)
        {
            for (int j=0; j< this.getGodzinaZakonczeniaPracy() - this.getGodzinaRozpoczeciaPracy(); j++)
            {
                this.grafik[i][j] = false;
            }
        }

    }

    public Lekarz()
    {

    }



}
