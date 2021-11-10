package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(16);
        a.add(9);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        ArrayList<Integer> c = merge(a,b);
        System.out.println(c);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a,ArrayList<Integer> b)
    {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        for(int i=0;i<b.size();i++)
        {
            if(i<a.size()) wynik.add(a.get(i));
            if(i<b.size()) wynik.add(b.get(i));
        }
        return wynik;

    }
}
