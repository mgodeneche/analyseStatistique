import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Maxence on 12/03/14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Analyse analyse = new Analyse();
        System.out.println("Analyse Statistique !");
        System.out.println("Donnez un texte à analyser");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();

        analyse.Analyse(userAnswer);

        System.out.println("E : "+analyse.getPercentE());
        System.out.println("A : "+analyse.getPercentA());
        System.out.println("I : "+analyse.getPercentI());
        System.out.println("S : "+analyse.getPercentS());
        System.out.println("T : "+analyse.getPercentT());
        System.out.println("N : "+analyse.getPercentN());


    }
}
