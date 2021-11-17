package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Main {

    public static void main(String[] args) {
    }
}

class IntegerSet{
    private static int Range = 101;
    private boolean[] a = new boolean[Range];
    public static IntegerSet union(IntegerSet seta,IntegerSet setb)
    {
        IntegerSet union = new IntegerSet();
        for(int i=0;i<Range;i++)
        {
            union.a[i] = seta.a[i] || setb.a[i];
        }
        return union;
    }
    public static IntegerSet intersection(IntegerSet seta,IntegerSet setb)
    {
        IntegerSet intersect = new IntegerSet();
        int i=0;
        while(i<Range)
        {
            intersect.a[i]=seta.a[i] && setb.a[i];
            i++;
        }
        return intersect;
    }
    public void insertElement(int newElement)
    {
        a[newElement] = true;
    }
    public void deleteElement(int delElement)
    {
        a[delElement] = false;
    }
    public boolean isEqual(IntegerSet seta)
    {
        for(int i=0;i<Range;i++)
        {
            if(a[i]!=seta.a[i])
            {
                return false;
            }
        }
        return true;
    }

}
