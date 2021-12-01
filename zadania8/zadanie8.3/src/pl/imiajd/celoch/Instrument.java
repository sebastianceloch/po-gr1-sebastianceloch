package pl.imiajd.celoch;
import java.time.LocalDate;
abstract class Instrument{

    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent,String rok_produkcji)
    {
        this.producent = producent;
        rokProdukcji = LocalDate.parse(rok_produkcji);
    }
    public String getProducent()
    {
        return producent;
    }
    public LocalDate getRokProdukcji()
    {
        return rokProdukcji;
    }
    abstract void dzwiek();

    public String toString()
    {
        return "Producent to " + this.producent + " rok produkcji to " + rokProdukcji;
    }


}
