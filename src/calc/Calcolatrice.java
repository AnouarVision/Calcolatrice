package calc;

import advancedCalc.CalcolatriceEstensioni;

import java.util.Scanner;

public class Calcolatrice{
    protected int num1;
    protected int num2;

    boolean continua = true;
    Scanner scanner = new Scanner(System.in);

    public Calcolatrice(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void menu(){
      CalcolatriceEstensioni calcolatriceEstensioni = new CalcolatriceEstensioni(num1,num2);

      while (continua) {
        System.out.println();
        System.out.println("Scegli un'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Differenza");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Potenza");
        System.out.println("6. Radice");
        System.out.println("7. Logaritmo");
        System.out.println("0. Esci");

        System.out.println();

        int scelta = scanner.nextInt();

        if (scelta == 0) {
          continua = false;
          System.out.println("Uscita dal programma.");
          continue;
        }

        switch (scelta) {
          case 1 -> System.out.println("Risultato della somma: " + somma());
          case 2 -> System.out.println("Risultato della differenza: " + sottrazione());
          case 3 -> System.out.println("Risultato della moltiplicazione: " + moltiplicazione());
          case 4 -> System.out.println("Risultato della divisione: " + divisione());
          case 5 -> System.out.println(num1 + " elevato alla potenza di " + num2 + " è: " + calcolatriceEstensioni.potenza());
          case 6 -> System.out.println("La radice " + num2 + "-esima di " + num1 + " è: " + calcolatriceEstensioni.radice());
          case 7 -> System.out.println("Logaritmo di " + num2 + " con base " + num1 + " è: " + calcolatriceEstensioni.logaritmo());
          default -> System.out.println("Scelta non valida. Riprova.");
        }
      }
    }

    public int somma() {
        int ris;
        ris = num1 + num2;
        return ris;
    }

    public int sottrazione(){
        int ris;
        ris = num1 - num2;
        return ris;
    }

    public double divisione(){
        double ris = 0;
          try {
            ris = (double) num1 / num2;
          }
          catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero non consentita.");
          }
          return ris;
    }

    public double moltiplicazione(){
        double ris;
        ris = num1 * num2;
        return ris;
    }

}
