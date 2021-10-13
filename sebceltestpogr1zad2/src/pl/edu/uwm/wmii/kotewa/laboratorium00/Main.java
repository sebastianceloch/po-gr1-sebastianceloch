package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
        double wynik;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];
        wynik = 0;
        for(int i = 0; i<=a.length-1;i++)
        {
            a[i]=s.nextDouble();
            wynik+=a[i];
        }
        System.out.println(wynik);
        wynik = 1;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=s.nextDouble();
            wynik*=a[i];
        }
        System.out.println(wynik);
        wynik = 0;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = s.nextDouble();
            wynik +=abs(a[i]);
        }
        System.out.println(wynik);
        wynik = 0;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = s.nextDouble();
            wynik +=(sqrt(abs(a[i])));
        }
        System.out.println(wynik);
        wynik = 1;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = s.nextDouble();
            wynik *=abs(a[i]);
        }
        System.out.println(wynik);
        wynik =0;
        double pom = 1;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = s.nextDouble();
            pom *=a[i];
            wynik +=a[i];
        }
        System.out.println(wynik);
        System.out.println(pom);
        wynik=0;
        //zostalo (h i (i
    }
}
