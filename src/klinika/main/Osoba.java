package klinika.main;

import java.util.*;

public class Osoba
{
    private Map<Integer, String> daneLogowania = new HashMap<>();
    private List<Pacjent> listaPacjentow = new ArrayList<>();

    private String imie;
    private String nazwisko;
    private String adres;
    private String haslo;
    private int pesel;

    Scanner input = new Scanner(System.in);


    public Pacjent rejestracja()
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
        KartaPacjenta karta = new KartaPacjenta();
        p1.getKartaPacjentaHashMap().put(pesel,karta);
        return p1;

    }

    public boolean czyPacjent(int pesel)
    {
        for (Pacjent obiektPacjent : listaPacjentow)
        {
            if (obiektPacjent.getPesel() == pesel)
            {
                return true;
            }
        }
        return false;
    }

    public Pacjent zwrocPacjent(int pesel)
    {
        for (Pacjent obiektPacjent : listaPacjentow)
        {
            if (obiektPacjent.getPesel() == pesel)
            {
                return obiektPacjent;
            }
        }
        return null;
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

            if (haslo.equals(daneLogowania.get(pesel)))
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

    public void wyswietlDanePacjenta(Pacjent p1)
    {
        System.out.println("Imie: "+ p1.getImie());
        System.out.println("Nazwisko: "+p1.getNazwisko());
        System.out.println("Pesel: "+ p1.getPesel());
        System.out.println("Adres: "+p1.getAdres());

    }


    public void wyswietlOgloszenia()
    {

    }



    public Map<Integer, String> getDaneLogowania()
    {
        return daneLogowania;
    }

    public String getHaslo()
    {
        return haslo;
    }

    public int getPesel()
    {
        return pesel;
    }

    public List<Pacjent> getListaPacjentow()
    {
        return listaPacjentow;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getAdres()
    {
        return adres;
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

