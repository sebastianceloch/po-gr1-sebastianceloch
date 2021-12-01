package pl.imiajd.celoch;

public class Fortepian extends Instrument {
    public Fortepian(String producent,String rok_produkcji)
    {
        super(producent,rok_produkcji);
    }
    void dzwiek()
    {
        System.out.println("fortepianowaty");
    }
}
