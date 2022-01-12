package com.company;
import java.util.Stack;
import java.util.ArrayList;
public class zadanie5 {
    public static void main(String[] args)
    {

        Stack<String> b = new Stack<>();
        String c=("Ala ma kota. Jej kot lubi myszy.");
        String []a=c.split("\\.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i].toLowerCase();
            System.out.println(a[i]);
        }
        ArrayList<String> xd=new ArrayList<String>();
        for(int s=0;s<a.length;s++)
        {
            String []d=a[s].split(" ");
            for(int e=0;e<d.length;e++)
            {
                xd.add(d[e]);
            }
            xd.add("&");
        }
        System.out.println(xd);
        for(String word : xd)
        {
            b.push(word);
        }
        int d=0;
        System.out.print(b);
        while(b.empty() == false)
        {
            if(d==0)
            {
                String y=b.peek();
                if(y=="&")
                {
                    b.pop();
                    continue;
                }
                else;
                {
                    System.out.print(y.substring(0, 1).toUpperCase() + y.substring(1)+ " ");
                    d+=1;
                    b.pop();
                    continue;
                }
            }
            else;
            {
                String t=b.peek();
                if(t=="&")
                {
                    System.out.print(".");
                    d=0;
                    b.pop();
                    continue;
                }
                else;
                {
                    System.out.print(t+" ");
                    b.pop();
                }
            }
        }

    }
    public static String capitalize(String str)
    {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}