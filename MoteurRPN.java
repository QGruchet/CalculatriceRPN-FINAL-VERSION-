public class MoteurRPN {
        Pile pile;

        MoteurRPN(){
            pile = new Pile();
        }
        public void enregistrer(double b)
        {
            try {
                pile.empiler(b);
                pile.affichage();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        public void calculer(Operation op) {
            try {
                double A = pile.depiler();
                double B = pile.depiler();

                pile.empiler(op.eval(A, B));
                pile.affichage();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
}

