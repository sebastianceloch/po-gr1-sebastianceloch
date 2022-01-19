package pl.imiajd.celoch;

public class Ksiazka extends Autor {
    private String tytul;
    private double cena;

    public Ksiazka(String tytul,double cena, String nazwa, String adres, char plec)
    {
        super(nazwa,adres,plec);
        this.tytul = tytul;
        this.cena = cena;
    }
    public int compareTo(Ksiazka k)
    {
        int wynik = this.getNazwa().compareTo(k.getNazwa());
        if(wynik == 0)
        {
            wynik = this.tytul.compareTo(k.tytul);
        }
        if(wynik == 0)
        {
            wynik = Double.compare(this.cena,k.cena);
        }
        return wynik;
    }
    public String toString()
    {
        return "tytul: "+tytul + " cena: "+ cena + " Autor: ["+getNazwa() + ", " + getAdres() + ", " + getPlec() + "]" +'\n';
    }



}
