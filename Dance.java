import java.util.ArrayList;
public class Dance extends RecitalComponent
{
    private String choreographer;
    private ArrayList<String> dancers;

   
    public Dance(String n, String chor,ArrayList<String> dan, int len )
    {
        super(len, n);
        choreographer = chor;
        dancers = dan;
        
    }

   
    public String toString()
    {
        return super.toString()+"\n\tThe artists are:\n\t\tChoreographer: "+choreographer+"\n\t\tDancers: "+dancers+"\n\t";
    }
    
    public String perform()
    { 
        return this.toString();
    }
}

