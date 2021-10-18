package com.company;
import java.util.Scanner;
public class Main {
    public static int silnia(int n)
    {
        int iloczyn = 1;
        for(int i=0;i<=n;i++)
        {
            iloczyn*=i;
        }
        return iloczyn;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];
        int ile=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextDouble();
        }
        //2a
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2==1)
            {
                ile++;
            }

        }
        System.out.println(ile);
        //2b
        ile=0;
        for(int k=0;k<a.length;k++)
        {
            if(a[k]%3==0 || a[k]%5==1)
            {
                ile++;
            }
        }
        System.out.println(ile);
        //2c
        ile=0;
        for(int b=0;b<a.length;b++)
        {
            if(a[b]*a[b]%2==0)
                ile++;

        }
        System.out.println(ile);
       // 2d
            ile=0;
           for(int l=0;l<a.length-1;l++)
           {
               if(a[l]<(a[l]+a[l+1]/2))
                 ile++;
          }
          System.out.println(ile);
        //2e
        ile=0;
        for(int o=0;o<a.length;o++)
        {
            if(a[o]>Math.pow(2,o) && a[o]<silnia(o))
                ile++;
        }
        System.out.println(ile);
        //2g
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
        //2h
        for(int t=0;t<a.length;t++)
        {
            if(Math.abs(a[t])<Math.pow(t,2))
                ile++;
        }
        System.out.println(ile);

    }
    }
}

