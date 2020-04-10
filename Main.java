import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Bienvenue dans une calculatrice RPN !");
        System.out.println("Le but est très simple. A l'aide d'une structure pile, cette calculatrice stocke les elements entrés.");
        System.out.println("Si un opérateur est entré, le programme fera le calcul sur les deux dernières entrés de la pile.");
        int recommencer = 1;
        while(recommencer == 1) {
            try {
                SaisieRPN b = new SaisieRPN();
                while (true) {
                    b.saisie();
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Voulez vous recommencer ? ( 1:oui / 0:non )");
                Scanner sc = new Scanner(System.in);
                int rep = sc.nextInt();
                if(rep == 1){
                    recommencer = 1;
                }
                else{
                    recommencer = 0;
                }
            }
        }
    }
}

