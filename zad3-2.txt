package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Random;
public class Main {
    public static int ileNieparzystych(int tab[])
    {
        int ileniep=0;
        for(int i = 0;i<tab.length-1;i++)
        {
            if(tab[i]%2==1)
                ileniep++;
        }
        return ileniep;
    }
    public static int ileParzystych(int tab[])
    {
        int ilep=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]%2==0)
                ilep++;
        }
        return ilep;
    }
    public static int ileDodatnich(int tab[])
    {
        int dod=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]>0)
                dod++;
        }
        return dod;
    }
    public static int ileUjemnych(int tab[])
    {
        int uj=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]<0)
                uj++;
        }
        return uj;
    }
    public static int ileZerowych(int tab[])
    {
        int z=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]==0)
                z++;
        }
        return z;
    }
    public static int ileMaksymalnych(int tab[])
    {
        int max=tab[0];
        int ilemax=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(max<tab[i])
                max = tab[i];
        }
        for(int j=0;j<tab.length-1;j++)
        {
            if(max == tab[j])
                ilemax++;
        }
        return ilemax;
    }
    public static int sumaDodatnich(int tab[])
    {
        int sumadod=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]>0)
                sumadod+=tab[i];
        }
        return sumadod;
    }
    public static int sumaUjemnych(int tab[])
    {
        int sumauj=0;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]<0)
            {
                sumauj+=tab[i];
            }
        }
        return sumauj;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])
    {
        int lendod=0;
        int maxlen=1;
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]>0 && tab[i+1]>0)
            {
                lendod++;
                if(lendod>maxlen)
                {
                    maxlen=lendod;
                }
            }
            else
            {
                lendod=0;
            }
        }
        return maxlen;
    }
    public static void odwrocFragment(int tab[],int lewy,int prawy)
    {
        for(int i=0;i<lewy;i++)
        {
            int temp = tab[i];
            tab[i]=tab[tab.length-1-i];
            tab[tab.length-1-1]=temp;
        }
        for(int j=prawy;j<prawy;j++)
        {
            int temp2=tab[j];
            tab[j] = tab[tab.length-1-j];
            tab[tab.length-1-j] = temp2;
        }
        for(int k=0;k<tab.length-1;k++)
        {
            System.out.println(tab[k]);
        }
    }
    public static void signum(int tab[])
    {
        for(int i=0;i<tab.length-1;i++)
        {
            if(tab[i]>0)
            {
                tab[i]=1;
            }
            else if(tab[i]<0)
            {
                tab[i]=0;
            }
        }
        for(int j=0;j<tab.length-1;j++)
        {
            System.out.println(tab[j]);
        }
    }
    public static void main(String[] args) {
	Random r = new Random();
	int n = r.nextInt(99)+1;
	int[] tab = new int[n];
	for(int p=0;p<=tab.length-1;p++)
    {
        tab[p]= r.nextInt(1999)-999;
        System.out.println(tab[p]);
    }
   System.out.println("nieparzystych liczb jest: "+ileNieparzystych(tab));
	System.out.println("parzystych liczb jest: "+ileParzystych(tab));
	System.out.println("dodatnich liczb jest: "+ileDodatnich(tab));
	System.out.println("ujemnych liczb jest: "+ileUjemnych(tab));
	System.out.println("zer jest: "+ileZerowych(tab));
	System.out.println("maksymalnych liczb jest: "+ileMaksymalnych(tab));
	System.out.println("suma liczb dodatnich: "+sumaDodatnich(tab));
	System.out.println("suma liczb ujemnych: "+sumaUjemnych(tab));
	System.out.println("dlugosc maksymalnego ciagu dodatnich to: "+dlugoscMaksymalnegoCiaguDodatnich(tab));
	odwrocFragment(tab,4,10);

    }
}
