package pl.imiajd.celoch;
public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan", "Jan",true,2000,12,4,2012,4,5,431213);
        ludzie[1] = new Student("Nowak", "Malgorzata",false,2000,12,12,"informatyka",3.4);
        Student s1 = new Student("Now","Mal",false,2000,12,12,"inf",3.2);
        Pracownik p1 = new Pracownik("Nowak","Jan",true,1999,12,4,2016,4,3,4141);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
        System.out.println(ludzie[0].getNazwisko());
        System.out.println(ludzie[0].getOpis());
        System.out.println(ludzie[0].getDataUrodzenia());
        System.out.println(ludzie[0].getImie());
        System.out.println(ludzie[0].getPlec());;
        System.out.println(s1.getSrednia());
        s1.setSrednia(4.3);
        System.out.println(s1.getSrednia());
        System.out.println(p1.getDataZatrudnienia());
        System.out.println(p1.getOpis());
        System.out.println(p1.getPobory());

    }
}