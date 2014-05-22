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
    /*
     * Annalyse des monogrammes
     */
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

    /*
     * Annalyse des bigrammes
     */
    float nbEN = 0; // ALLEMAND & ESPAGNOL
    float nbES = 0; // FRANCAIS
    float nbTH = 0; // ANGLAIS

    double percentEN = 0;
    double percentES = 0;
    double percentTH = 0;

    /*
     * Annalyse des Trigrammes
     */
    float nbDER = 0; // ALLEMAND
    float nbENT = 0; // FRANCAIS & ESPAGNOL
    float nbTHE = 0; // ANGLAIS

    double percentDER = 0;
    double percentENT = 0;
    double percentTHE = 0;




    public int Analyse(String maa){
        this.theString = maa.toUpperCase();

        ArrayList<String> listOfString = StringToList(this.theString);
        for(int i=0;i<listOfString.size();i++){
            wichLetter(listOfString.get(i));
            // éviter le out of bound i = -1
            if(i>0){
                isItABigram(listOfString.get(i - 1), listOfString.get(i));

                // pour eviter le out of bounds exception
                if(i<listOfString.size()-1){
                    isItATrigram(listOfString.get(i-1),listOfString.get(i),listOfString.get(i+1));
                }
            }
        }
        setPercents();
        /**
         * Comparaison des pourcentages par rapports au statistiques enregistrées
         *
         */
        whatIsThisFuckingLangage();
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
    /*
     * On teste la présence d'un bigramme en analysant la lettre courante et la lettre précédente
     */
    public void isItABigram(String previousLetter, String currentLetter){
        // si la lettre actuelle est N , on teste la lettre précédente
        if(currentLetter.equals("N")){
            // si la lettre précédente est un E
            if(previousLetter.equals("E")){
                this.nbEN +=1;
            }
        }
        if(currentLetter.equals("S")){
            // si la lettre précédente est un E
            if(previousLetter.equals("E")){
                this.nbES +=1;
            }
        }
        if(currentLetter.equals("H")){
            if(previousLetter.equals("T")){
                this.nbES +=1;
            }

        }

    }

    /*
     * On teste la présence d'un trigramme en analysant la lettre courante, la lettre précédente et la suivante
     */
    public void isItATrigram(String previousLetter, String currentLetter , String nextLetter){
        if((currentLetter.equals("N"))&&(previousLetter.equals("E"))&&(nextLetter.equals("T"))){
            // on a un trigramme
            this.nbENT +=1;
        }
        if((currentLetter.equals("E"))&&(previousLetter.equals("D"))&&(nextLetter.equals("R"))){
            // on a un trigramme
            this.nbDER +=1;
        }
        if((currentLetter.equals("H"))&&(previousLetter.equals("T"))&&(nextLetter.equals("H"))){
            // on a un trigramme
            this.nbTHE +=1;
        }
    }
    // Fonction CHUCK NORRIS
    public void whatIsThisFuckingLangage(){
        System.out.println("Chuck norris à la rescousse !");
        if((this.percentDER>this.percentENT)&&(this.percentDER>this.percentTHE)){
            System.out.println("c'est surement de l'allemand..");
            if((this.percentEN>this.percentTH)&&(this.percentEN>this.percentES)){
                System.out.println("là ça se précise...");
                if((this.percentE>this.percentN)&&(this.percentN>this.percentI)){
                    // ALLEMAND
                    System.out.println("PUTAIN C'EST DU BOCHE !!");
                }

            }
        }
        if((this.percentENT>this.percentDER)&&(this.percentENT>this.percentTHE)){
            // Français ou espagnol ?
        }
        if((this.percentTHE>this.percentDER)&&(this.percentTHE>this.percentENT)){
            // ANGLAIS
        }

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
        this.percentE=Math.round((this.nbE/(float)this.theString.length())*100);
    }
    public void setPercentA() {
        this.percentA=Math.round((this.nbA/(float)this.theString.length())*100);
    }
    public void setPercentI() {
        this.percentI=Math.round((this.nbI/(float)this.theString.length())*100);
    }
    public void setPercentS() {
        this.percentS=Math.round((this.nbS/(float)this.theString.length())*100);
    }
    public void setPercentT() {
        this.percentT=Math.round((this.nbT/(float)this.theString.length())*100);
    }
    public void setPercentN() {
        this.percentN=Math.round((this.nbN/(float)this.theString.length())*100);
    }
    public void setPercentEN() {
        this.percentEN=Math.round((this.nbEN/(float)this.theString.length()*100));
    }
    public void setPercentES() {
        this.percentES=Math.round((this.nbES/(float)this.theString.length()*100));
    }
    public void setPercentTH() {
        this.percentTH=Math.round((this.nbTH/(float)this.theString.length()*100));
    }
    public void setPercentTHE() {
        this.percentTHE=(this.nbTHE/(float)this.theString.length()*100);
    }
    public void setPercentDER() {
        this.percentDER=(this.nbDER/(float)this.theString.length()*100);
    }
    public void setPercentENT() {
        this.percentENT=(this.nbENT/(float)this.theString.length()*100);
    }
    public void setPercents(){
        setPercentA();
        setPercentE();
        setPercentI();
        setPercentN();
        setPercentS();
        setPercentT();
        setPercentEN();
        setPercentES();
        setPercentTH();
        setPercentTHE();
        setPercentENT();
        setPercentDER();
    }
    public double getPercentEN() {
        return percentEN;
    }

    public double getPercentES() {
        return percentES;
    }

    public double getPercentTH() {
        return percentTH;
    }

    public double getPercentDER() {
        return percentDER;
    }

    public double getPercentTHE() {
        return percentTHE;
    }

    public double getPercentENT() {
        return percentENT;
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
