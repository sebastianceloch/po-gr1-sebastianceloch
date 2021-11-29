package pl.imijad.Celoch;

public class PunktTest {

    public static void main(String[] args) {
	NazwanyPunkt p1 = new NazwanyPunkt(3,4,"raz");
    p1.show();
    Punkt p2 = new Punkt(4,1);
    Punkt p3 = new NazwanyPunkt(3,1,"dwa");
    p3.show();
    }
}
class Punkt{
    int x;
    int y;
    public Punkt(int x,int y)
    {
        this.x=x;
        this.y= y;
    }
    public void show()
    {
        System.out.println("<" + x + ", "+ y + ">");
    }
    public int x()
    {
        return x;
    }
    public int y()
    {
        return y;
    }
}
class NazwanyPunkt extends Punkt{
    private String name;
    public NazwanyPunkt(int x, int y, String name)
    {
        super(x,y);
        this.name = name;
    }
    public void show()
    {
        System.out.println(name+ "<" + x + ", "+ y + ">");
    }
}
