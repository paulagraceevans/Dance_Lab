
public class Monologue2 extends NonDance
{

   private Talent speaker;
   
    public Monologue2(String theTopic, Talent theSpeaker, int len)
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
