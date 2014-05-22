package Stats;

/**
 * Created by Maxence on 23/05/14.
 */
public abstract class Langue {

    private double tauxE;
    private double tauxS;
    private double tauxA;
    private double tauxI;
    private double tauxT;
    private double tauxN;

    private String premierBi;
    private String premierTri ;

    private String specialsChars[];

    public String[] getSpecialsChars() {
        return specialsChars;
    }
}
