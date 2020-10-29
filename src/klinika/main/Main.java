package klinika.main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wybor = 0;

        Osoba o1 = new Osoba();

        while (wybor != 4)
        {


            System.out.println("\n\t~~~~~KONSOLOWA KLINIKA LEKARSKA~~~~~");
            System.out.println("1. REJESTRACJA");
            System.out.println("2. LOGOWANIE");
            System.out.println("3. KORONA");
            System.out.println("4. WYJSCIE");

            wybor = input.nextInt();

            switch (wybor)
            {
                case 1:
                    o1.rejestracja();
                    break;

                case 2:
                    int pesel = o1.logowanie();
                    if(pesel!=0)
                    {
                        System.out.println("Zalogowano osobe o peselu: "+pesel);
                    }
                    break;

                case 3:

                    break;
            }
        }


    }
}
