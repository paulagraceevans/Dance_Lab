
public class MusicalInterlude extends NonDance
{
   private String genre;
   
    public MusicalInterlude(String theTitle, String theGenre, int len)
    {
        super(len, theTitle);
        genre = theGenre;
    }

    
    public String toString()
    {
        return super.toString()+"\n\tGenre: "+genre+"\n\t";
    }
    
     public String perform()
    { 
        return "\nThis musical interlude is "+this.toString();
    }
}
