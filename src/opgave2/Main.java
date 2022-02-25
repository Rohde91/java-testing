package opgave2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            TODO Metode der returnerer det mindste tal af 2 input fra parameterliste
            TODO Metode der returnerer det største tal af 2 input fra parameterliste
            TODO Metode der returnerer det mindste tal af 3 input fra parameterliste
            TODO Metode der returnerer det største tal af 3 input fra parameterliste
            TODO Metode der returnerer det mindste tal i et array input fra parameterliste
            TODO Metode der returnerer det største tal i et array input fra parameterliste
            TODO Metode der returnerer summen af tal i et array input fra parameterliste
            TODO Metode der returnerer gennemsnittet tal i et array input fra parameterliste
         */

        Scanner scanner = new Scanner(System.in);

        
    }

    public int mindsteTalParameterliste(int tal1, int tal2){
        if (tal1 < tal2){
            return tal1;
        }
        else {
            return tal2;
        }
    }
}
