package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];
        double suma = 0;
        int iled = 0;
        int ileu = 0;
        int ilez = 0;
        for(int i = 0; i<a.length;i++)
        {
            a[i] = s.nextDouble();
        }
        //zad2.2
        for(int j = 0; j<a.length;j++)
        {
            if(a[j]>0)
            {
                suma+=a[j];
            }
        }
        suma *=2;
        System.out.println(suma);
        //zad2.3
        for(int p = 0; p<a.length;p++)
        {
            if(a[p]>0)
            {
                iled++;
            }
            else if(a[p]<0)
            {
                ileu++;
            }
            else if(a[p]==0)
            {
                ilez++;
            }
        }
        System.out.println("liczb dodatnich jest: "+iled);
        System.out.println("liczb ujemnych jest: "+ileu);
        System.out.println("zer jest: "+ilez);

    }
}
