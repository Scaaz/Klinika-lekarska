package klinika.main;


import java.util.Scanner;

public class Harmonogram
{
    Scanner input = new Scanner(System.in);

    public void wyswietlGrafikLekarza(Lekarz lekarz)
    {
        for (int i = 0; i < 5; i++)
        {
            switch (i)
            {
                case 0:
                    System.out.println("Poniedzialek");
                    break;
                case 1:
                    System.out.println("Wtorek");
                    break;
                case 2:
                    System.out.println("Sroda");
                    break;
                case 3:
                    System.out.println("Czwartek");
                    break;
                case 4:
                    System.out.println("Piatek");
                    break;
            }

            for (int j = 0; j < lekarz.getGodzinaZakonczeniaPracy() - lekarz.getGodzinaRozpoczeciaPracy(); j++)
            {
                System.out.print(lekarz.getGodzinaRozpoczeciaPracy() + j + " - ");
                if (lekarz.grafik[i][j])
                    System.out.println("zajety");
                else
                    System.out.println("wolny");
            }
            System.out.println("");
        }

    }



    public void aktualizujGrafikLekarza(Lekarz lekarz, int dzien, int godzina)
    {
        lekarz.grafik[dzien - 1][godzina - 1] = true;
    }

    public void nowyGrafik()
    {

    }

    public void wyborTerminu(Lekarz lekarz)
    {
        int start = lekarz.getGodzinaRozpoczeciaPracy();
        int koniec = lekarz.getGodzinaZakonczeniaPracy();

        System.out.println("Wybierz termin:");
        System.out.println("1. Poniedzialek");
        System.out.println("2. Wtorek");
        System.out.println("3. Sroda");
        System.out.println("4. Czwartek");
        System.out.println("5. Piatek");

        int dzien = input.nextInt();

        System.out.println("Wybierz godzine:");

        int j = 0;
        for (int i = start; i < koniec; i++)
        {
            j++;
            if (!lekarz.grafik[dzien - 1][i - start])
            {
                System.out.println(j + ". " + i + ":00");
            }


        }

        int godzina = input.nextInt();
        aktualizujGrafikLekarza(lekarz, dzien, godzina);
    }


}
