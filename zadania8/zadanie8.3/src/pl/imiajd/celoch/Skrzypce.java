package pl.imiajd.celoch;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent,String rok_produkcji)
    {
        super(producent,rok_produkcji);
    }
    void dzwiek()
    {
        System.out.println("Skrzypkowaty");
    }

}
