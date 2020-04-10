import java.lang.String;

public enum Operation {

    PLUS('+') {
        public double eval(double a, double b) {
            return a + b;
        }
    },

    DIVISION('/') {
        public double eval(double a, double b) {
            return a/b;
        }
    },

    MULTIPLICATION('*'){
        public double eval(double a, double b){
            return a*b;
        }
    },

    MOINS('-'){
        public double eval(double a, double b){
            return a-b;
        }
    };

        private char symbole;
        Operation(char symbole) {
            this.symbole = symbole;
        }

        public void getSymbole() {
            System.out.println("l'Operation est " + symbole);
        }

        public abstract double eval(double a, double b);
}

