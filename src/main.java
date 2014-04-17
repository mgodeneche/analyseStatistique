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

        System.out.println(analyse.getPercentE());


    }
}
