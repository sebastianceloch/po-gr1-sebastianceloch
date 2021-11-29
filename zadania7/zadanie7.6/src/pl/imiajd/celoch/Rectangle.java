package pl.imiajd.celoch;

public class Rectangle {

    public static void main(String[] args) {
        BetterRectangle b1 = new BetterRectangle(7,4);
        System.out.println(b1.getArea());
        System.out.println(b1.getPerimeter());
    }
}
class BetterRectangle extends java.awt.Rectangle {

    public BetterRectangle(int setLocation,int setSize) {
        super(setLocation,setSize);;
    }
    public int getArea()
    {
        return(int)(getWidth()*getHeight());
    }
    public int getPerimeter()
    {
        return(int)(2*(getWidth()*getHeight()));
    }

}
