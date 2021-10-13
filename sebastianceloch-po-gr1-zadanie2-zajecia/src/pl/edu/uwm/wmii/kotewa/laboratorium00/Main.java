package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];
        int ile=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextDouble();
        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2==1)
            {
                ile++;
            }

        }
        System.out.println(ile);
        ile=0;
        for(int k=0;k<a.length;k++)
        {
            if(a[k]%3==0 || a[k]%5==1)
            {
                ile++;
            }
        }
        System.out.println(ile);
        ile=0;
        for(int g=0;g<a.length;g++)
        {
            if(a[g]%2==1 && a[g]>=0)
            {
                ile++;
            }
        }
        System.out.println(ile);
        ile=0;

    }
}
