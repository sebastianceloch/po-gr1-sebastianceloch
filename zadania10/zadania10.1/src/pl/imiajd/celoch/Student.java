package pl.imiajd.celoch;

public class Student extends Osoba {
    private double sredniaOcen;
    public Student(String nazwisko, int year, int month, int day, double sredniaOcen)
    {
        super(nazwisko, year, month, day);
        this.sredniaOcen = sredniaOcen;
    }
    public int compareTo(Student b)
    {
        if(getNazwisko() == b.getNazwisko())
        {
            return 1;
        }
        else if(getDataUrodzenia() == b.getDataUrodzenia())
        {
            return 1;
        }
        else if(this.sredniaOcen == b.sredniaOcen)
        {
            return 1;
        }
        return 0;
    }

}
