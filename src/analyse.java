import Stats.ALLEMAND;
import Stats.ANGLAIS;
import Stats.ESPAGNOL;
import Stats.FRANCAIS;
import javafx.beans.binding.Bindings;

import java.util.ArrayList;


/**
 * Created by Maxence on 12/03/14.
 */
class Analyse {

    FRANCAIS fr = new FRANCAIS();
    ANGLAIS an = new ANGLAIS();
    ALLEMAND al = new ALLEMAND();
    ESPAGNOL es = new ESPAGNOL();


    String theString ;

    double percentE = 0;
    double percentA = 0;
    double percentS = 0;
    double percentT = 0;
    double percentI = 0;
    double percentN = 0;

    float nbE = 0;
    float nbA = 0;
    float nbS = 0;
    float nbT = 0;
    float nbI = 0;
    float nbN = 0;



    public int Analyse(String maa){
        this.theString = maa.toUpperCase();

        ArrayList<String> listOfString = StringToList(this.theString);
        for(int i=0;i<listOfString.size();i++){
            wichLetter(listOfString.get(i));

        }
        setPercents();
        /**
         * Comparaison des pourcentages par rapports au statistiques enregistrées
         *
         */
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
        }else if(letter.equals("S")){
            this.nbS+=1;
        }else if(letter.equals("T")){
            this.nbT+=1;
        }else if(letter.equals("N")){
            this.nbN+=1;
        }else{

        }
    }

    public void setPercentE() {
        this.percentE=(this.nbE/(float)this.theString.length())*100;
    }
    public void setPercentA() {
        this.percentA=(this.nbA/(float)this.theString.length())*100;
    }
    public void setPercentI() {
        this.percentI=(this.nbI/(float)this.theString.length())*100;
    }
    public void setPercentS() {
        this.percentS=(this.nbS/(float)this.theString.length())*100;
    }
    public void setPercentT() {
        this.percentT=(this.nbT/(float)this.theString.length())*100;
    }
    public void setPercentN() {
        this.percentN=(this.nbN/(float)this.theString.length())*100;
    }

    public void setPercents(){
        setPercentA();
        setPercentE();
        setPercentI();
        setPercentN();
        setPercentS();
        setPercentT();
    }
    public double getPercentE() {
        return percentE;
    }

    public double getPercentA() {
        return percentA;
    }

    public double getPercentS() {
        return percentS;
    }

    public double getPercentT() {
        return percentT;
    }

    public double getPercentI() {
        return percentI;
    }

    public double getPercentN() {
        return percentN;
    }









}
