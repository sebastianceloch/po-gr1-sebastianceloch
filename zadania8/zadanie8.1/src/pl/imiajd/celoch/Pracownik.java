package pl.imiajd.celoch;
import pl.imiajd.celoch.Osoba;

import java.time.LocalDate;
class Pracownik extends Osoba
{
    private LocalDate dataZatrudnienia;
    private int rok;
    private int msc;
    private int dzien;
    public Pracownik(String nazwisko,String imie,boolean plec,int year,int month,int day,int rok, int msc, int dzien, double pobory)
    {
        super(nazwisko,imie,plec,year,month,day);
        this.pobory = pobory;
        dataZatrudnienia = LocalDate.of(rok,msc,dzien);
    }

    public double getPobory()
    {
        return pobory;
    }
    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }


    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory,dataZatrudnienia);
    }

    private double pobory;
}