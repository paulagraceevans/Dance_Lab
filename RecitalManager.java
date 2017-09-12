import java.util.ArrayList;
public class RecitalManager
{
    public static void main()
    {
        ArrayList<RecitalComponent> recital = new  ArrayList<RecitalComponent> ();
        MusicalInterlude mi = new MusicalInterlude ("Stay with Me", "R & B" , 210);
        recital.add(mi);
        ArrayList<String> dancers = new ArrayList<String>();
        dancers.add("Tess Haber");
        dancers.add("Annabelle Lassally");
        dancers.add("Mollie Berger");
        recital.add(new Dance ("Cell Block Tango", "Roberta Fosse" , dancers, 185));
        //Talent nancy = new Talent("Nancy McNamara", "Dance Spirit Editor", "graduate of Princeton University's English and Dance program.");
        recital.add(new Monologue ("New Costumes 2015 Fashion Show", "Nancy McNamara", 6210));
        
        System.out.println("\nThis is the current recital program: \n");
        for(RecitalComponent rc: recital)
        {
            System.out.println(rc.perform());
        }
        //System.out.println("The total length of the recital is: "+RecitalComponent.getLength());
        
    }

    
}
