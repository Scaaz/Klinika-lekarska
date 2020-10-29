package klinika.main;

import java.util.*;

public class Osoba
{
    private Map<Integer, String> daneLogowania = new HashMap<>();
    private List<Pacjent> listaPacjentow = new ArrayList<>();
    private List<Lekarz> listaLekarzy = new ArrayList<>();
    private List<Recepcja> listaRecepcji = new ArrayList<>();

    private String imie;
    private String nazwisko;
    private String adres;
    private String haslo;
    private int pesel;

    Scanner input = new Scanner(System.in);




    public void rejestracja()
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

        daneLogowania.put(pesel, haslo);

        Pacjent p1 = new Pacjent(imie, nazwisko, adres, haslo, pesel);
        listaPacjentow.add(p1);

    }

    public int logowanie()
    {
        int wybor = 1;

        while (wybor != 2)
        {
            System.out.print("Wpisz pesel: ");
            int pesel = input.nextInt();
            input.nextLine();
            System.out.print("Wpisz haslo: ");
            String haslo = input.nextLine();

            if (haslo.equals(daneLogowania.get(pesel)) )
            {
                System.out.println("Zalogowano poprawnie");
                return pesel;
            }
            System.out.println("Wpisano bledne dane");
            System.out.println("Czy chcesz sprobowac ponownie?");
            System.out.println("1 - Tak     2- Nie");
            wybor = input.nextInt();
        }
        return 0;
    }


    public void wyswietlDane()
    {

    }



    public void wyswietlOgloszenia()
    {

    }

    public int getPesel()
    {
        return pesel;
    }

    public Osoba()
    {

    }

    public Osoba(String imie, String nazwisko, String adres, String haslo, int pesel)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.haslo = haslo;
        this.pesel = pesel;
    }
}

