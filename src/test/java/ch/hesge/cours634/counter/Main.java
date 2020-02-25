package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(0);
        try {
            counter.inc();
            System.out.println("Counter : " + counter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        try {
            counter.add(-3);
            System.out.println("Counter : " + counter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        UpperLimitedPositiveCounter ulpCounter = new UpperLimitedPositiveCounter(0, 5);
        //test pour l'incrémentation du compteur
        try {
            ulpCounter.inc();
            System.out.println("UpperLimitedPositiveCounter : " + ulpCounter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        //test pour un ajout positif
        try {
            ulpCounter.add(5);
            System.out.println("UpperLimitedPositiveCounter : " + ulpCounter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        //test pour incrémenter au-dessus de la valeur max
        try {
            ulpCounter.inc();
            System.out.println("UpperLimitedPositiveCounter : " + ulpCounter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        //test pour decrémenter le compteur
        try {
            ulpCounter.add(-3);
            System.out.println("UpperLimitedPositiveCounter : " + ulpCounter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        //test pour la valeur négatif
        try {
            ulpCounter.add(-3);
            System.out.println("UpperLimitedPositiveCounter : " + ulpCounter.getValue());
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
    }
}
