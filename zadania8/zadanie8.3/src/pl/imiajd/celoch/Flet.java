package pl.imiajd.celoch;

public class Flet extends Instrument{
    public Flet(String producent,String rok_produkcji)
    {
        super(producent,rok_produkcji);
    }
    void dzwiek()
    {
        System.out.println("fletowaty");
    }
}
