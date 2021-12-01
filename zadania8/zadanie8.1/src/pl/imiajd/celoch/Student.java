package pl.imiajd.celoch;

import pl.imiajd.celoch.Osoba;

class Student extends Osoba
{
    public Student(String nazwisko,String imie,boolean plec,int year, int month, int day, String kierunek,double srednia)
    {
        super(nazwisko,imie,plec,year,month,day);
        this.kierunek = kierunek;
        this.srednia = srednia;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getSrednia()
    {
        return srednia;
    }
    public void setSrednia(double newSrednia)
    {
        this.srednia = newSrednia;
    }


    private String kierunek;
    private double srednia;
}