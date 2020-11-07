package klinika.main;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pacjent extends Osoba
{

    private Map<Integer, KartaPacjenta> kartaPacjentaHashMap = new HashMap<>();


    public void wyborSpecjalizacji(Personel personel)
    {
        int licznik = 1;
        String wyborSpecjalizacji;
        System.out.println("1. PIERWSZEGO KONTAKTU");
        System.out.println("2. KARDIOLOG");
        System.out.println("3. NEUROLOG");
        System.out.println("4. UROLOG");
        System.out.println("5. PSYCHOLOG");
        System.out.println("6. LARYNGOLOG");
        System.out.print("\n Wpisz wybrana specjalizacje: ");
        wyborSpecjalizacji = input.nextLine();
        for (Lekarz obiektLekarz : personel.getListaLekarzy())
        {
            if (obiektLekarz.getSpecjalizacja().contains(wyborSpecjalizacji))
            {
                System.out.println(licznik + ". " + obiektLekarz.getImie() + " " + obiektLekarz.getNazwisko());
                licznik++;
            }
        }
        String wybranyLekarz;

        System.out.println("\n Wpisz nazwisko wybranego lekarza: ");
        wybranyLekarz = input.nextLine();
        Harmonogram harmonogram = new Harmonogram();
        Lekarz lekarz = new Lekarz();
        for (Lekarz obiektLekarz : personel.getListaLekarzy())
        {
            if (obiektLekarz.getNazwisko().equals(wybranyLekarz))
            {
               lekarz = obiektLekarz;
            }
        }
        harmonogram.wyborTerminu(lekarz);



    }

    public void wyborLekarza(Personel personel)
    {
        int licznik = 1;
        for (Lekarz obiektLekarz : personel.getListaLekarzy())
        {
            System.out.println(licznik + ". " + obiektLekarz.getImie() + " " + obiektLekarz.getNazwisko());
            licznik++;
        }
    }

    public void umowWizyte(Personel personel)
    {
        int wybor;
        Scanner input = new Scanner(System.in);
        System.out.println("1. WYBOR LEKARZA");
        System.out.println("2. WYBOR SPECJALIZACJI");
        wybor = input.nextInt();
        if (wybor == 1)
        {
            this.wyborLekarza(personel);
        } else if (wybor == 2)
        {
            this.wyborSpecjalizacji(personel);

        }
        else
            umowWizyte(personel);



    }


    public Pacjent(String imie, String nazwisko, String adres, String haslo, int pesel)
    {
        super(imie, nazwisko, adres, haslo, pesel);
    }

    public Map<Integer, KartaPacjenta> getKartaPacjentaHashMap()
    {
        return kartaPacjentaHashMap;
    }
}
