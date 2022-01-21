package com.company;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class STUDENCI {
    public static void usun(SortedMap<String,String> studenci,String n)
    {
        studenci.remove(n);
    }
    public static void dodaj(SortedMap<String,String> studenci,String a,String b)
    {
        studenci.put(a,b);
    }
    public static void update(SortedMap<String,String> studenci,String x,String y)
    {
        studenci.replace(x,y);
    }
public static void main(String[] args) {
        SortedMap<String, String> studenci = new TreeMap<>();
        studenci.put("Kowalski", "bd");
        studenci.put("Kowalska", "db+");
        studenci.put("Kowalski2", "db");
        studenci.put("Cowak", "dst");
        usun(studenci,"Kowalski");
        dodaj(studenci,"Nowak2","dst");
        update(studenci,"Nowak2","bd");
        Set<Entry<String,String>> entrySet = studenci.entrySet();
        for(Entry<String,String> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}