package pl.imiajd.celoch;
import java.time.LocalDate;
abstract class Osoba
{
    public Osoba(String nazwisko,String imie,boolean plec,int year, int month, int day)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.plec = plec;
        dataUrodzenia = LocalDate.of(year,month,day);
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getImie()
    {
        return imie;
    }
    public boolean getPlec()
    {
        return plec;
    }
    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    private String nazwisko;
    private String imie;
    private boolean plec;
    private LocalDate dataUrodzenia;

}