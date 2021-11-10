package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(4);
	a.add(16);
	a.add(9);
	ArrayList<Integer> b = reversed(a);
	System.out.println(b);
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
       final ArrayList<Integer> wynik = new ArrayList<Integer>();
        for(int i = a.size()-1;i>=0;i--)
        {
           wynik.add(a.get(i));

        }
        return wynik;
    }
}
