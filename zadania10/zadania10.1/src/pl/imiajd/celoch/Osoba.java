package pl.imiajd.celoch;
import java.time.LocalDate;

public class Osoba implements Comparable<Osoba> {

    private String nazwisko;
    LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int year, int month, int day)
    {
        this.nazwisko = nazwisko;
        dataUrodzenia = LocalDate.of(year,month,day);
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }
    @Override
    public String toString()
    {
        return ("Osoba [" + nazwisko + " " + dataUrodzenia + "]");
    }

    public boolean equals(Osoba a)
    {
        if((this.nazwisko == a.nazwisko) || (this.dataUrodzenia == a.dataUrodzenia))
        {
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Osoba a)
    {
        String naz1 = getNazwisko();
        String naz2 = a.getNazwisko();
        return naz1.compareTo(naz2);
    }
}