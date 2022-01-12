package com.company;

import java.util.ArrayList;
public class zadd8 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        print(list);

    }
    public static <T> void print (Iterable<T>x)
    {
        for(T item: x)
        {
            System.out.print(item+",");
        }
    }
}
