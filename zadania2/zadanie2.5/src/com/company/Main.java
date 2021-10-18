package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] a = new double[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextDouble();
        }
        int ile=0;
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]>0 && a[j+1]>0)
                ile++;
        }
        System.out.println(ile);

    }
}
