import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class SaisieRPN {
    private Scanner sc;
    private MoteurRPN calcul;

    /**On initialise le moteur et le scanner**/
    public SaisieRPN(){
        sc = new Scanner(System.in);
        calcul = new MoteurRPN();
    }

    /**cette fonction recupere ce que vous avez entree et affectuer les calculs.
     * Elle retourne une erreur quand le nombre d'élément dans la pile est insuffisant.
     */
    public void saisie() throws Exception {
        String signe;
        final int MAX_VALUE = 10000;
        final int MIN_VALUE = -10000;
        System.out.println("Veuillez saisir un nombre, un operateur ou 'quitter' pour arreter le programme:");
        if (sc.hasNextDouble()) {
            double d = sc.nextDouble();
            if (d > MIN_VALUE && d < MAX_VALUE) {
                calcul.enregistrer(d);
            } else {
                System.out.println("Veuillez entrer un nombre entre " + MIN_VALUE + " et " + MAX_VALUE);
            }
        }
        else{
            signe = sc.nextLine();
            switch (signe) {

                case "+":
                    if (calcul.pile.getSommet() >= 1) {
                        calcul.calculer(Operation.PLUS);
                    } else {
                        throw new Exception("Nombre d'éléments dans la pile insuffisant");
                    }
                    break;

                case "*":
                    if (calcul.pile.getSommet() >= 1) {
                            calcul.calculer(Operation.MULTIPLICATION);
                    } else {
                        throw new Exception("Nombre d'éléments dans la pile insuffisant");
                    }
                    break;

                case "/":
                    if (calcul.pile.getSommet() >= 1) {
                        calcul.calculer(Operation.DIVISION);
                    } else {
                        throw new Exception("Nombre d'éléments dans la pile insuffisant");
                    }
                    break;

                case "-":
                    if (calcul.pile.getSommet() >= 1) {
                        calcul.calculer(Operation.MOINS);
                    } else {
                        throw new Exception("Nombre d'éléments dans la pile insuffisant");
                    }
                    break;

                case "quitter":
                    System.out.println("Au revoir et a bientot !");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Erreur dans la saisie !");
            }
        }
    }
}
