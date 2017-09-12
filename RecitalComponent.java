
public abstract class RecitalComponent
{
    
    private int length;
    private String name;
    //private static int totalLength = 0;
    
    
    public RecitalComponent(int len, String n)
    {
        length = len;
        name = n;
        //totalLength += length;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "\nPerformed:\n\tThe performance name is: " + name + ".  Its length is: "+length + " seconds " ;
    } 
    
    public abstract String perform(); 
    
    /*
     public static int getLength()
    {
        return totalLength;
    }
    */
 
}
