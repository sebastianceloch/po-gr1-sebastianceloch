package pl.imiajd.celoch;
import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    ArrayList<Autor> autorzy = new ArrayList<Autor>();
    autorzy.add(new Autor("Shakespear","shakespear@gmail.com",'M'));
    autorzy.add(new Autor("Shakespear","shakespearxx@gmail.com",'K'));
    autorzy.add(new Autor("bbShakespearowa","shakespearwe@gmail.com",'K'));
    autorzy.add(new Autor("aaShakespearowa","ashakespearxd@gmail.com",'M'));
    System.out.println(autorzy);
    Collections.sort(autorzy);
    System.out.println(autorzy);
    ArrayList<Ksiazka> Listaksiazek = new ArrayList<Ksiazka>();
    Listaksiazek.add(new Ksiazka("Basnie grim",40.30,"Shakespear","shakespear@gmail.com",'M'));
    Listaksiazek.add(new Ksiazka("Robin Hud",20,"bbShakespearowa","shakespearwe@gmail.com",'K'));
    Listaksiazek.add(new Ksiazka("Basnie grim",50.30,"Shakespear","shakespear@gmail.com",'M'));
    Listaksiazek.add(new Ksiazka("Robin Hud 2",25,"Shakespear","shakespearxx@gmail.com",'K'));
    System.out.println(Listaksiazek);
    Collections.sort(Listaksiazek);
    System.out.println(Listaksiazek);
    LinkedList<String> books = new LinkedList<String>();
    books.add("jedna");
    books.add("druga");
    books.add("trzecia");
    books.add("czwarta");
    books.add("piata");
    books.add("piataa");
    books.add("piataba");
    System.out.println(books);
    redukuj(books);
    System.out.println(books);
    }
    static void redukuj(LinkedList <String> books)
    {
        int n = 1;
        for(int i=1;i<=books.size()-1;i++)
        {
            books.remove(n);
            n++;
        }
    }
}
