package klinika.main;

import java.util.ArrayList;
import java.util.List;

public class Personel extends Osoba
{
    private int godzinaRozpoczeciaPracy;
    private int godzinaZakonczeniaPracy;
    private List<Lekarz> listaLekarzy = new ArrayList<>();
    private List<Recepcja> listaRecepcji = new ArrayList<>();

    public Personel()
    {

    }

     public Lekarz rejestracjaLekarza()
    {
        System.out.print("Wpisz pesel: ");
        int pesel = input.nextInt();
        input.nextLine();
        System.out.print("Wpisz haslo: ");
        String haslo = input.nextLine();
        System.out.print("Wpisz imie: ");
        String imie = input.nextLine();
        System.out.print("Wpisz nazwisko: ");
        String nazwisko = input.nextLine();
        System.out.print("Wpisz adres: ");
        String adres = input.nextLine();
        System.out.print("Wpisz godzine rozpoczecia pracy: ");
        godzinaRozpoczeciaPracy = input.nextInt();
        System.out.print("Wpisz godzine zakonczenia pracy: ");
        godzinaZakonczeniaPracy = input.nextInt();
        System.out.println("Wpisz specjalizacje: ");
        String specjalizacja = input.nextLine();

       // o1.daneLogowania.put(pesel, haslo);
        Lekarz l1 = new Lekarz(imie, nazwisko, adres, haslo, pesel, godzinaRozpoczeciaPracy, godzinaZakonczeniaPracy, specjalizacja);
        listaLekarzy.add(l1);
        return l1;
    }





    public Personel(String imie, String nazwisko, String adres, String haslo, int pesel, int godzinaRozpoczeciaPracy, int godzinaZakonczeniaPracy)
    {
        super(imie, nazwisko, adres, haslo, pesel);
        this.godzinaRozpoczeciaPracy = godzinaRozpoczeciaPracy;
        this.godzinaZakonczeniaPracy = godzinaZakonczeniaPracy;
    }

}
