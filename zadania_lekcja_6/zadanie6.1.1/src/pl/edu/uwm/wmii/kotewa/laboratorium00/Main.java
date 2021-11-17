package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Main {

    public static void main(String[] args) {
	RachunekBankowy saver1 = new RachunekBankowy(2000,0.04);
	RachunekBankowy saver2 = new RachunekBankowy(3000,0.04);
	System.out.println(saver1.obliczMiesieczneOdsetki());
	System.out.println(saver2.obliczMiesieczneOdsetki());


    }
}
class RachunekBankowy{
    private double saldo;
    static double rocznaStopaProcentowa;
    public RachunekBankowy(double saldo,double rocznaStopaProcentowa)
    {
        this.saldo = saldo;
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
    public double obliczMiesieczneOdsetki()
    {
        double odsetki;
        odsetki = (this.saldo * this.rocznaStopaProcentowa)/12;
        return odsetki;
    }


}
