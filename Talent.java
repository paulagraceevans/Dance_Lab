
public class Talent
{
    private String name;
    private String talent;
    private String bio;

    
    public Talent(String name, String talent, String bio)
    {
        this.name = name;
        this.talent = talent;
        this.bio = bio;
    }

    public String toString()
    {
        return name+ " is a "+talent+ " and a "+bio;
    }
}
