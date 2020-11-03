package klinika.main;




import java.util.Scanner;

public class Pacjent extends Osoba
{




    public void wyborSpecjalizacji()
    {
        int wybor;
        System.out.println("1. PIERWSZEGO KONTAKTU");
        System.out.println("2. KARDIOLOG");
        System.out.println("3. NEUROLOG");
        System.out.println("4. UROLOG");
        System.out.println("5. PSYCHOLOG");
        System.out.println("6. LARYNGOLOG");
        wybor = input.nextInt();
    }

    public void wyborLekarza()
    {

    }

    public void umowWizyte()
    {
        int wybor;
        Scanner input = new Scanner(System.in);
        System.out.println("1. WYBOR LEKARZA");
        System.out.println("2. WYBOR SPECJALIZACJI");
        wybor = input.nextInt();

        if (wybor == 1)
        {
            this.wyborLekarza();
        }
        else if(wybor == 2)
        {
            this.wyborSpecjalizacji();
        }
        else
            umowWizyte();
    }



    public Pacjent(String imie, String nazwisko, String adres, String haslo, int pesel)
    {
        super(imie, nazwisko, adres, haslo, pesel);
    }


}
