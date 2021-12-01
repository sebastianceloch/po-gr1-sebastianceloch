package pl.imiajd.celoch;
import java.util.ArrayList;
public class TestInstrumenty {

    public static void main(String[] args) {
        Flet f1 = new Flet("Klarnetofon","2004-12-22");
        System.out.println(f1.getProducent());
        System.out.println(f1.getRokProdukcji());
        f1.dzwiek();
        ArrayList<Object> a = new ArrayList<Object>();
        a.add(new Flet("Klarnet","2003-12-12"));
        a.add(new Flet("Klarnetarz","2005-02-02"));
        a.add(new Fortepian("Fortepiano","2006-12-11"));
        a.add(new Fortepian("Fortepianorz","2003-12-11"));
        a.add(new Skrzypce("Skrzypki","2001-01-01"));
        System.out.println(a);

    }
}
