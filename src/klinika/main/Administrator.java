package klinika.main;

public class Administrator extends Personel implements Pracownik{

    @Override
    public void obsluzPacjenta(Pacjent p) {
        System.out.println("----Administrator kontaktuje sie z pacjentem----");
        //funkcje administratora sterowane w kodzie
        //brak wywolania konkretnej funckji
        //zalezne od problemu
    }

    public Administrator(String imie, String nazwisko, String adres, String haslo, int pesel, int godzinaRozpoczeciaPracy, int godzinaZakonczeniaPracy)
    {
        super(imie, nazwisko, adres, haslo, pesel, godzinaRozpoczeciaPracy, godzinaZakonczeniaPracy);
    }
}
