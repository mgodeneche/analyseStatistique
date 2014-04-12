import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Maxence on 12/03/14.
 */
class anaylse {
    String theString ;
    double percentE = 0;
    double percentA = 0;
    double percentS = 0;
    double percentT = 0;
    double percentI = 0;
    double percentN = 0;
    double percentR = 0;
    double percentO = 0;
    double percentU = 0;

    int nbE = 0;
    int nbA = 0;
    int nbS = 0;
    int nbT = 0;
    int nbI = 0;
    int nbU = 0;
    int nbO = 0;
    int nbR = 0;
    int nbN = 0;

    HashMap FRENCH = new HashMap();

    Hashtable<Integer, String> source = new Hashtable<Integer,String>();
    HashMap<Integer, String>  map = new HashMap(source);


    map.put(21, "Twenty One");


    Hashtable<String,Double> ENGLISH = new Hashtable<String, Double>();
    Hashtable<String,Double> ESPAGNOL = new Hashtable<String, Double>();
    Hashtable<String,Double> ITALIEN = new Hashtable<String, Double>();


    public int analyse(String maa){
        this.theString = maa;
        ArrayList<String> listOfString = StringToList(maa);
        for(int i=0;i<listOfString.size();i++){
            wichLetter(listOfString.get(i));
        }
        return 0;
    }

    public ArrayList<String> StringToList(String s)
    {
        ArrayList<String> convertedString = new ArrayList<String>();

        String character;

        for(int i = 0; i < s.length(); i++){
            character = ""+s.charAt(i);
            convertedString.add(character);
        }

        return convertedString;
    }
    public void wichLetter(String letter){
        if(letter.equals("E")){
            this.nbE+=1;
        }else if(letter.equals("A")){
            this.nbA+=1;
        }else if(letter.equals("I")){
            this.nbI+=1;
        }else if(letter.equals("O")){
            this.nbO+=1;
        }else if(letter.equals("U")){
            this.nbU+=1;
        }else if(letter.equals("R")){
            this.nbR+=1;
        }else if(letter.equals("S")){
            this.nbS+=1;
        }else if(letter.equals("T")){
            this.nbT+=1;
        }else if(letter.equals("N")){
            this.nbN+=1;
        }
    }

    public void setPercentE() {
        this.percentE=(nbE/this.theString.length())*100;
    }
    public void setPercentA() {
        this.percentA=(nbA/this.theString.length())*100;
    }
    public void setPercentI() {
        this.percentI=(nbI/this.theString.length())*100;
    }
    public void setPercentO() {
        this.percentO=(nbO/this.theString.length())*100;
    }
    public void setPercentU() {
        this.percentU=(nbU/this.theString.length())*100;
    }
    public void setPercentR() {
        this.percentR=(nbR/this.theString.length())*100;
    }
    public void setPercentS() {
        this.percentS=(nbS/this.theString.length())*100;
    }
    public void setPercentT() {
        this.percentT=(nbT/this.theString.length())*100;
    }
    public void setPercentN() {
        this.percentN=(nbN/this.theString.length())*100;
    }








}
