package klinika.main;

public class KartaPacjenta
{
    private String diagnoza;
    private String szczepienia;
    private String zalecania;
    private String dataOstatniejChoroby;

    public void wyswietlKartePacjenta()
    {
        System.out.println("Diagnoza: "+diagnoza);
        System.out.println("Szczepienia: "+szczepienia);
        System.out.println("zalecenia: "+zalecania);
        System.out.println("Data ostatniej Choroby: "+dataOstatniejChoroby);
    }



}
