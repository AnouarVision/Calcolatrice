package advancedCalc;

import calc.Calcolatrice;

public class CalcolatriceEstensioni extends Calcolatrice {
    public CalcolatriceEstensioni(int num1, int num2){
        super(num1,num2);
    }
    public double potenza(){
        try {
            if (num1 == 0 && num2 == 0) {
                throw new ArithmeticException("Indeterminato: 0 elevato alla 0.");
            }
            return Math.pow(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
            return Double.NaN; //Risultato non valido
        }
    }

    public double radice() {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Errore: Divisione per zero non consentita per la radice.");
            }
            return Math.pow(num1, 1.0 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
            return Double.NaN; //Risultato non valido
        }
    }

    public double logaritmo(){
        try {
            // Verifica che la base e l'argomento siano validi
            if (num1 <= 0 || num1 == 1) {
                throw new ArithmeticException("Errore: Base del logaritmo non valida. Deve essere maggiore di 0 e diversa da 1.");
            }
            if (num2 <= 0) {
                throw new ArithmeticException("Errore: Argomento del logaritmo non valido. Deve essere maggiore di 0.");
            }
            //Calcolo del logaritmo usando il cambio di base
            return Math.log(num2) / Math.log(num1);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
            return Double.NaN; //Risultato non valido
        }
    }
}
