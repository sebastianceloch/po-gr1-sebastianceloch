package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Main {

    public static void main(String[] args) {
	RachunekBankowy saver1 = new RachunekBankowy();
	saver1.setRocznaStopaProcentowa(0.04);
	System.out.println(saver1.obliczMiesieczneOdsetki(saver1.rocznaStopaProcentowa,2000));
	RachunekBankowy saver2 = new RachunekBankowy();
	saver2.setRocznaStopaProcentowa(0.04);
	System.out.println(saver2.obliczMiesieczneOdsetki(saver2.rocznaStopaProcentowa,3000));
    }
}

class RachunekBankowy
{
    static double rocznaStopaProcentowa;
    private double saldo;
    public double obliczMiesieczneOdsetki(double rocznaStopaProcentowa, double saldo) {
        double odsetki;
        odsetki = ((saldo * rocznaStopaProcentowa) / 12);
        return odsetki;
    }
    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
}

