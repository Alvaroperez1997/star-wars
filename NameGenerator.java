
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * Genera un nombre y apellidos
     */
    public void generateStarWarsName(String name, String undername, String undernameMother,String city)
    {
        final int ZERO = 0;
        final int TRES_PRIMERAS = 3;
        final int DOS_PRIMERAS = 2;
        
        String nameFilm = undername.substring(ZERO,TRES_PRIMERAS) + name.substring(ZERO,TRES_PRIMERAS);
        String undernameFilm = undernameMother.substring(ZERO, DOS_PRIMERAS) + city.substring(ZERO,TRES_PRIMERAS);
        System.out.println(nameFilm + " " + undernameFilm);
    }
}
