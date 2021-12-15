package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Pair<T>
{
    private T first;
    private T second;


    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }
    public void swap()
    {
        T temp = first;
        first = second;
        second = temp;
    }
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }
}