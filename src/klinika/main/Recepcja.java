package klinika.main;

import java.util.Scanner;

public class Recepcja extends Personel implements Pracownik
{

    @Override
    public void obsluzPacjenta(Pacjent p) {
        System.out.println("----Recepcjonista kontaktuje sie z pacjentem----");
        wyslijInformacje();
    }

    public void wyslijInformacje() {
        System.out.print("Wpisz informacje: ");
        Scanner s = new Scanner(System.in);
        String informacja = input.nextLine();
        System.out.println("\tNOWA INFORMACJA!");
        System.out.println(informacja);

    }


    public void doajOgloszenie() {
        System.out.print("Wpisz tresc ogloszenia: ");
        Scanner s = new Scanner(System.in);
        String ogloszenie = input.nextLine();
        System.out.println("\nDODANO NOWE OGLOSZENIE:");
        System.out.println(ogloszenie);
    }



    public Recepcja(String imie, String nazwisko, String adres, String haslo, int pesel, int godzinaRozpoczeciaPracy, int godzinaZakonczeniaPracy)
    {
        super(imie, nazwisko, adres, haslo, pesel, godzinaRozpoczeciaPracy, godzinaZakonczeniaPracy);
    }
}
