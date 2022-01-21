package com.company;
import java.util.*;
public class HashSet{

    public static class Student
    {
        String imie;
        String ocena;
        public Student(String imie,String ocena)
        {
            this.imie = imie;
            this.ocena = ocena;

        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
        Scanner in5 = new Scanner(System.in);
        Scanner in6 = new Scanner(System.in);
        int wybor;
        HashMap<String, String> mapa = new HashMap<String, String>();
        do{
            System.out.print("Lista zadań"+"\n");
            System.out.print("1.Dodaj studenta"+"\n");
            System.out.print("2.Usuń studenta"+"\n");
            System.out.print("3.Zmień ocenę studenta"+"\n");
            System.out.print("4.Wypisz"+"\n");
            System.out.print("5.Zakończ"+"\n");
            wybor = in.nextInt();
            switch(wybor)
            {
                case 1:

                    System.out.print("Imię:"+"\n");
                    String imie = in2.nextLine();
                    System.out.print("Ocena:"+"\n");
                    String ocena = in3.nextLine();
                    Student student = new Student(imie, ocena);
                    mapa.put(student.imie,student.ocena);
                    break;

                case 2:
                    System.out.print("Imię studenta do usunięcia:"+"\n");
                    String imie2 = in4.nextLine();
                    mapa.remove(imie2);
                    break;

                case 3:
                    System.out.print("Imię studenta do zmiany oceny:"+"\n");
                    String imie3 = in5.nextLine();
                    System.out.print("Ocena po zmianie:"+"\n");
                    String ocena2 = in6.nextLine();
                    mapa.replace(imie3,ocena2);
                    break;

                case 4:
                    System.out.print(mapa+"\n");
                    break;
                case 5:
                    System.exit(0);

            }

        }while(wybor!=5);

        in.close();
        in2.close();
        in3.close();
        in4.close();
        in5.close();
        in6.close();
    }
}