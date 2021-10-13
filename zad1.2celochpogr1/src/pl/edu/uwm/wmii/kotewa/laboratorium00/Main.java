package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];;
        for(int i = 0; i<a.length;i++)
        {
            a[i]=s.nextDouble();
        }
        double pom = a[0];
        for(int j=1;j<a.length;j++)
        {
            System.out.println(a[j]);
        }
        System.out.println(pom);
    }
}
