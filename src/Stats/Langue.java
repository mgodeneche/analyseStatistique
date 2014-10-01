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

    private String specialsChars[] ={};

    public String[] getSpecialsChars() {
        return specialsChars;
    }

    public void returnSpecialChars() {
        for(int i=0;i<specialsChars.length;i++){
            System.out.println("ok");
            System.out.println(specialsChars[i]);
        }
    }
}
