package pl.imiajd.celoch;

public class Autor implements Cloneable, Comparable<Autor> {
    private String nazwa;
    private String adres;
    private char plec;
    public Autor(String nazwa,String adres,char plec)
    {
        this.nazwa = nazwa;
        this.adres = adres;
        this.plec = plec;
    }

    public String getNazwa()
    {
       return nazwa;
    }
    public String getAdres()
    {
        return adres;
    }
    public char getPlec()
    {
        return plec;
    }
    public void setNazwa(String newNazwa)
    {
        nazwa = newNazwa;
    }
    public void setAdres(String newAdres)
    {
        adres = newAdres;
    }
    public void setPlec(char newPlec)
    {
        plec = newPlec;
    }

    public String toString()
    {
        return "Autor [nazwisko = " + nazwa + ", email = "+ adres + " plec =" + plec +"]";
    }
    @Override
    public int compareTo(Autor a)
    {
        int wynik = this.nazwa.compareTo(a.nazwa);
        if(wynik == 0)
        {
            wynik = Integer.compare(this.plec,a.plec);
        }
        return wynik;
    }
}
