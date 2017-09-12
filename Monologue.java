
public class Monologue extends NonDance
{

   private String speaker;
   
    public Monologue(String theTopic, String theSpeaker, int len)
    {
        super(len, theTopic);
        speaker = theSpeaker;
    }

    
    public String toString()
    {
        return "\nThis performance is "+super.toString()+"The monologue speaker is: "+speaker+"\n\t";
    }
    
     public String perform()
    { 
        return this.toString();
    }
}
