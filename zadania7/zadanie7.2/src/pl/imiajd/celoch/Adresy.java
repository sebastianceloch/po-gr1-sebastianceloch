package pl.imiajd.celoch;

public class Adresy {
    public static void main(String[] args) {
        Adres a1 = new Adres("mieszkalna",40,4,"Lodz","21300");
        Adres a2 = new Adres("warszawska",4,"Lublin","11500");
        a1.pokaz();
        a2.pokaz();
        System.out.println(a1.przed(a2));
    }
}
class Adres
{    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ulica,int numer_domu,int numer_mieszkania,String miasto,String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public Adres(String ulica,int numer_domu,String miasto,String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu=numer_domu;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }


    public void pokaz()
    {
        System.out.println(kod_pocztowy+" "+miasto);
        System.out.println(ulica+" "+numer_domu+" "+numer_mieszkania);
    }
    public boolean przed(Adres a2)
    {
        Integer a1 = Integer.valueOf(this.kod_pocztowy);
        Integer kod2 = Integer.valueOf(a2.kod_pocztowy);
        if(a1>kod2)
        {
            return true;
        }
        return false;
    }

}
