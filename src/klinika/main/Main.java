package klinika.main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wybor = 0;

        Osoba o1 = new Osoba();
        Personel admin = new Personel("admin", "admin", "", "admin", 112, 0, 0);
        o1.getDaneLogowania().put(112, "admin");

        Lekarz lek1 = new Lekarz("Donald", "Trump", "Ameryka 3", "dtrump", 111, 4, 6, "Neurolog");
        o1.getDaneLogowania().put(111, "dtrump");
        admin.getListaLekarzy().add(lek1);

        Lekarz lek2 = new Lekarz("Andrzej", "Duda", "Warszawa 4", "aduda", 222, 8, 20, "Kardiolog");
        o1.getDaneLogowania().put(222, "aduda");
        admin.getListaLekarzy().add(lek2);

        Lekarz lek3 = new Lekarz("Joe", "Biden", "Ameryka obok Trumpa", "jbiden", 333, 4, 8, "Psycholog");
        o1.getDaneLogowania().put(333, "dtrump");
        admin.getListaLekarzy().add(lek3);

        Lekarz lek4 = new Lekarz("Jaroslaw", "Kaczynski", "Polska 7", "jkaczynski", 444, 8, 16, "Urologa");
        o1.getDaneLogowania().put(444, "jkaczynski");
        admin.getListaLekarzy().add(lek4);

        Lekarz lek5 = new Lekarz("Zbigniew", "Stonoga", "Polska 0", "zstonoga", 555, 0, 24, "Neurolog");
        o1.getDaneLogowania().put(555, "zstonoga");
        admin.getListaLekarzy().add(lek5);

        KartaPacjenta karta = new KartaPacjenta();

        Harmonogram harmonogram = new Harmonogram();


        while (wybor != 3)
        {


            System.out.println("\n\t~~~~~KONSOLOWA KLINIKA LEKARSKA~~~~~");
            System.out.println("1. REJESTRACJA PACJENTA");
            System.out.println("2. LOGOWANIE");
            //System.out.println("3. FORUM");
            System.out.println("3. WYJSCIE");

            wybor = input.nextInt();

            switch (wybor)
            {
                case 1:
                    Pacjent p1 = o1.rejestracja();
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
                        int interfejsPacjenta=0;
                        while(interfejsPacjenta!=5)
                        {
                            System.out.println("\n\t~~~~~INTERFEJS PACJENTA~~~~~");
                            System.out.println("1. UMOW WIZYTE");
                            System.out.println("2. UMOW WIZYTE ONLINE");
                            System.out.println("3. WYSWIETL KARTE PACJENTA");
                            System.out.println("4. WYSWIETL SWOJE DANE");
                            System.out.println("5. WYLOGUJ");
                            interfejsPacjenta = input.nextInt();

                            if (interfejsPacjenta == 1 || interfejsPacjenta == 2)
                            {
                                p2.umowWizyte(admin);
                            } else if (interfejsPacjenta == 3)
                            {
                                karta.wyswietlKartePacjenta();
                            } else if (interfejsPacjenta == 4)
                            {
                                o1.wyswietlDanePacjenta(p2);
                            } else if (interfejsPacjenta == 5)
                            {
                                System.out.println("WYLOGOWANO");
                            }
                        }

                    } else
                    {
                        Lekarz l2 = admin.zwrocLekarz(pesel);
                        int interfejsPracownika =0;
                        while(interfejsPracownika!=4)
                        {
                            System.out.println("\n\t~~~~~INTERFEJS PRACOWNIKA~~~~~");
                            System.out.println("1. ZAREJESTRUJ LEKARZA");
                            System.out.println("2. WYSWIETL SWOJ GRAFIK");
                            System.out.println("3. WYSWIETL KARTE PACJENTA");
                            System.out.println("4. WYLOGUJ");
                            interfejsPracownika = input.nextInt();
                            if (interfejsPracownika == 1)
                            {
                                Lekarz l1 = admin.rejestracjaLekarza();
                                o1.getDaneLogowania().put(pesel, l1.getHaslo());
                            } else if (interfejsPracownika == 2)
                            {
                                harmonogram.wyswietlGrafikLekarza(l2);
                            } else if (interfejsPracownika == 3)
                            {
                                karta.wyswietlKartePacjenta();
                            }
                            else if (interfejsPracownika == 4)
                            {
                                System.out.println("WYLOGOWANO");
                            }
                        }

                    }
                    break;

            }
        }


    }
}
