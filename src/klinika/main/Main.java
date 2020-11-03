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
        Lekarz lek1 = new Lekarz("Donald", "Trump","Ameryka 3","dtrump", 111,4,6,"Neurolog");
        lek1.getDaneLogowania().put(111,"dtrump");
        Lekarz lek2 = new Lekarz("Andrzej","Duda","Warszawa 4","aduda",222,8,20,"Kardiolog");
        lek2.getDaneLogowania().put(222,"aduda");
        Lekarz lek3 = new Lekarz("Joe","Biden","Ameryka obok Trumpa","jbiden",333,4,8,"Psycholog");
        lek3.getDaneLogowania().put(333,"dtrump");
        Lekarz lek4 = new Lekarz("Jaroslaw","Kaczynski","Polska 7","jkaczynski",444,8,16,"Urologa");
        lek4.getDaneLogowania().put(444,"jkaczynski");
        Lekarz lek5 = new Lekarz("Zbigniew","Stonoga","Polska 0","zstonoga",555,0,24,"Neurolog");
        lek5.getDaneLogowania().put(555,"zstonoga");

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
                        Pacjent p2 = o1.zwrocPacjent(pesel);
                        int interfejsPacjenta;
                        System.out.println("\n\t~~~~~INTERFEJS PACJENTA~~~~~");
                        System.out.println("1. UMOW WIZYTE");
                        System.out.println("2. WYSWIETL KARTE PACJENTA");
                        System.out.println("3. WYSWIETL SWOJE DANE");
                        interfejsPacjenta = input.nextInt();

                        if(interfejsPacjenta == 1)
                        {
                            p2.umowWizyte(admin);
                        }
                        else if(interfejsPacjenta == 2)
                        {

                        }
                        else if(interfejsPacjenta == 3)
                        {
                            o1.wyswietlDanePacjenta(p2);
                        }

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
