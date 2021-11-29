package pl.imiajd.celoch;

public class OsobaTest {

    public static void main(String[] args) {
        Osoba o1 = new Osoba("Kowalski",2002);
        Student s1 = new Student("Adamczyk",1998,"Informatyka");
        Nauczyciel n1 = new Nauczyciel("Baran",1876,2138);
        System.out.println(o1);
        System.out.println(s1);
        System.out.println(n1);
        System.out.println(o1.getNazwisko());
        System.out.println(s1.getKierunek());
        System.out.println(n1.getPensja());
        System.out.println(s1.getNazwisko());
    }
}
class Osoba{
    String nazwisko;
    int rokUrodzenia;
    public Osoba(String nazwisko,int rokUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public String toString()
    {
        return nazwisko+" "+rokUrodzenia;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
}
class Student extends Osoba
{
    String kierunek;
    public Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko,rokUrodzenia);
        this.kierunek = kierunek;
    }
    public String toString()
    {
        return nazwisko+" "+rokUrodzenia+" "+kierunek;
    }
    public String getKierunek()
    {
        return kierunek;
    }
}
class Nauczyciel extends Osoba
{
    int pensja;
    public Nauczyciel(String nazwisko,int rokUrodzenia,int pensja)
    {
        super(nazwisko,rokUrodzenia);
        this.pensja=pensja;
    }
    public String toString()
    {
        return nazwisko+" "+rokUrodzenia+" "+pensja;
    }
    public int getPensja()
    {
        return pensja;
    }
}