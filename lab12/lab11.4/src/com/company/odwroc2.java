package com.company;
import java.util.LinkedList;

public class odwroc2 {
    public static <T>void odwroc(LinkedList<T> lista)
    {
        LinkedList<T> nl = new LinkedList<T>();
        for(int i=lista.size()-1;i>=0;i--)
            nl.add(lista.get(i));
        lista.clear();
        for(int i=0;i<nl.size();i++)
            lista.add(nl.get(i));

    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Kowalski");
        ll.add("Nowak");
        ll.add("Nowak2");
        ll.add("Nowak3");
        System.out.print(ll);
        System.out.println();
        odwroc(ll);
        System.out.print(ll);
    }
}