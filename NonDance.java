

public abstract class NonDance extends RecitalComponent
{
    public NonDance(int len, String n)
    {
        super(len, n);
    }
    public String toString()
    {
        return " not a dance. "+super.toString()+" and will provide time for dancers to change costumes.\n\t";
    }
}
