package pl.imiajd.celoch;

import java.util.ArrayList;
import java.util.*;
public class TestOsoba {
    public static void main(String[] args)
    {
        Osoba o1 = new Osoba("kozlowski",2000,4,12);
        Osoba o2 = new Osoba("kozlowski",2000,4,12);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.compareTo(o2));
        ArrayList<Object> a = new ArrayList<Object>();
        a.add(new Osoba("Kozlaz",2000,4,12));
        a.add(new Osoba("Kozlaz",2003,4,2));
        a.add(new Osoba("Nowy",2000,5,4));
        a.add(new Osoba("NieNowy",2000,5,4));
        a.add(new Osoba("Celoch",2000,11,17));
        System.out.println(a);
    }
}
