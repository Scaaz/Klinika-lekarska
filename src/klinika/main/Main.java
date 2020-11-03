package klinika.main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wybor = 0;

        Osoba o1 = new Osoba();
        Personel admin = new Personel("admin","admin","","admin",112,0,0 );
        o1.getDaneLogowania().put(112, "admin");

        while (wybor != 4)
        {


            System.out.println("\n\t~~~~~KONSOLOWA KLINIKA LEKARSKA~~~~~");
            System.out.println("1. REJESTRACJA PACJENTA");
            System.out.println("2. LOGOWANIE");
            System.out.println("3. KORONA");
            System.out.println("4. WYJSCIE");

            wybor = input.nextInt();

            switch (wybor)
            {
                case 1:
                    Pacjent p1= o1.rejestracja();
                    System.out.println("\nLOGOWANIE");

                case 2:
                    int pesel = o1.logowanie();
                    if (pesel != 0)
                    {
                        System.out.println("Zalogowano osobe o peselu: " + pesel);
                    }
                    boolean czyPacjent = o1.czyPacjent(pesel);
                    if (czyPacjent)
                    {
                        System.out.println("\n\t~~~~~INTERFEJS PACJENTA~~~~~");
                        System.out.println("1. UMOW WIZYTE");
                        System.out.println("2. WYSWIETL KARTE PACJENTA");

                    }
                    else
                    {

                        int interfejsPracownika;
                        System.out.println("\n\t~~~~~INTERFEJS PRACOWNIKA~~~~~");
                        System.out.println("1. ZAREJESTRUJ LEKARZA");

                        interfejsPracownika = input.nextInt();
                        if(interfejsPracownika == 1)
                        {
                            Lekarz l1 = admin.rejestracjaLekarza();
                            o1.getDaneLogowania().put(pesel, l1.getHaslo());
                        }
                    }
                    break;

                case 3:

                    break;
            }
        }


    }
}
