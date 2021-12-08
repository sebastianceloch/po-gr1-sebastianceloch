package pl.imiajd.celoch;

public class TestStudent {
    public static void main(String[] args)
    {
        Student s1 = new Student("Kowalski",2000,11,12,3.43);
        Student s2 = new Student("nowak",1999,11,2,3.5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.compareTo(s2));
    }
}
