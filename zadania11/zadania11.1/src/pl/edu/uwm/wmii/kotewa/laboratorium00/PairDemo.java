package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class PairDemo
{
    public static void main(String[] args)
    {
            Pair<String> p1 = new Pair<String>("seima","nara");
            System.out.println(p1.toString());
            p1.swap();
            System.out.println(p1.toString());
            PairUtil<String> p2 = new PairUtil<String>("elo","nq");
            System.out.println(p2.toString());
            p2.swap();
            System.out.println(p2.toString());

    }
    }

