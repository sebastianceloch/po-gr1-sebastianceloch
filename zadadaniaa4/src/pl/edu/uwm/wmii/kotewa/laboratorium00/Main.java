package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.lang.StringBuffer;
public class Main {
public static String repeat(String s,int n)
{
    StringBuffer sb = new StringBuffer();
    String str = s;
    for(int i=0;i<=n-1;i++)
    {
        sb.append(str);
    }
    return sb.toString();
}
public static int countChar(String str, char c)
{
    int suma = 0;
    StringBuffer sb = new StringBuffer(str);
    for(int i=0;i<sb.length();i++)
    {
        if(sb.charAt(i) == c)
            suma++;
    }
    return suma;
}
public static int countSubStr(String str,String substr)
{
    StringBuffer sb = new StringBuffer(str);
    int count = (str.split(substr,-1).length)-1;
    return count;

}
public static String middle(String s)
{
    StringBuffer sb = new StringBuffer(s);
    StringBuffer str = new StringBuffer();
    if(sb.length()%2==0)
    {
        str.append(sb.charAt(sb.length()/2-1)).append(sb.charAt(sb.length()/2));
    }
    if(sb.length()%2!=0)
    {
        str.append(sb.charAt(sb.length()/2));
    }
    return str.toString();
}
public static String change(String s)
{
    StringBuffer sb = new StringBuffer(s);
    for(int i=0;i<sb.length();i++)
    {
        char c = sb.charAt(i);
        if(Character.isLowerCase(c))
        {
            sb.setCharAt(i,Character.toUpperCase(c));
        }
        else{
            sb.setCharAt(i,Character.toLowerCase(c));
        }
    }
    return sb.toString();
}
public static String nice(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        for(int i=3;i<sb.length();i=i+3)
        {
            sb.insert(i,'.');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
	String s = "dDVfddc";
	String g = "dd";
	char c = 'c';
	String licz = "12345";
	System.out.println(repeat(s,4));
	System.out.println(countChar(s,c));
	System.out.println(middle(s));
	System.out.println(nice(licz));
	System.out.println(countSubStr(s,g));
	System.out.println(change(s));

    }
}
