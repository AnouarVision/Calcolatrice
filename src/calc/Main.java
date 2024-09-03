package calc;

import advancedCalc.CalcolatriceEstensioni;

import java.util.Scanner;

public class Main {
    /* Realizza un’applicazione che esegue somma, sottrazione, moltiplicazione e divisione di
    due numeri interi. Le classi devono appartenere al package calc.
    calc. Crea un nuovo package advancedCalc con una classe che estende quella base, aggiungendo:
    - Elevamento a potenza (con base ed esponente specificati come parametri di ingresso);
    - Radice quadrata;
    - Logaritmo.
    Verifica le funzionalità della calcolatrice avanzata con un main di prova
    */

    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Inserisci il primo numero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Errore: per favore inserisci un numero intero positivo.");
                scanner.next();
            }
            numero1 = scanner.nextInt();
        } while (numero1 < 0);

        do {
            System.out.print("Inserisci il secondo numero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Errore: per favore inserisci un numero intero positivo.");
                scanner.next();
            }
            numero2 = scanner.nextInt();
        } while (numero2 < 0);

        CalcolatriceEstensioni calcolatriceEstensioni = new CalcolatriceEstensioni(numero1,numero2);

        calcolatriceEstensioni.menu();
    }
}
