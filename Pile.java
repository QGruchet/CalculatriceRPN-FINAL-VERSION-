public class Pile {

    private double pile[];
    private int sommet;
    private int maxPile = 100;

    /**creation de la structure pile**/
    public Pile(){
        pile = new double[maxPile];
        sommet = -1;
    }

    /**permet de retourner l'élément le plus haut de la pile**/
    public int getSommet(){
        return sommet;
    }

    /**verifie si la pile est vide**/
    public boolean estVide(){
        if(sommet == -1){
            return true;
        }
        else {
            return false;
        }
    }

    /**verifie si la pile est pleine**/
    public boolean estPleine(){
        if(sommet == pile.length){
            return true;
        }
        else{
            return false;
        }
    }

    /**enlève le dernier element de la pile**/
    public double depiler() throws Exception{
        if(estVide()){
            throw new Exception("La pile est vide");
        }
        sommet--;
        return pile[sommet+1];
    }

    /**permet d'ajouter elem a la pile**/
    public void empiler(double elem) throws Exception{
        if(estPleine()){
            throw new Exception("La pile est pleine");
        }
        else{
            pile[sommet+1] = elem;
            sommet++;
        }

    }

    /**affiche le contenu et le nombre de valeurs de la pile**/
    public void affichage()
    {
        int Som = getSommet();
        Som++;
        System.out.println("Dans la pile, il y a " +Som+ " valeurs :");
        for(int i = this.sommet ; i >= 0; i--) {
            System.out.println(" [ " + pile[i] + " ] ");
        }
    }
}