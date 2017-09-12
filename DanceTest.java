import java.util.ArrayList;
public class DanceTest
{
   
    public static void main()
    {
        ArrayList<String> dancers = new ArrayList<String>();
        dancers.add("Tess Haber");
        dancers.add("Annabelle Lassally");
        dancers.add("Mollie Berger");
        Dance d = new Dance ("Cell Block Tango", "Roberta Fosse" , dancers, 185);
        System.out.println(d.perform());
    }


}
