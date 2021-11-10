package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<Integer> c = mergeSorted(a,b);
        System.out.println(c);
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,ArrayList<Integer> b)
    {
    a.addAll(b);
    Collections.sort(a);

    return a;
    }
}
