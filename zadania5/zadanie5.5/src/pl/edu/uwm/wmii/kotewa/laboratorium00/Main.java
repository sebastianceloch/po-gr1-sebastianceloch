package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(16);
        a.add(9);
        reverse(a);

    }
    public static void reverse(ArrayList<Integer> a)
    {
        for(int i=a.size()-1;i>=0;i--)
        {
           System.out.println(a.get(i));
        }
    }
}
