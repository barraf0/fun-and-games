package rozgrzewka.tablice;
import java.util.Random;

public class EvenNumberArray {
/*
    public static int fill() {
        int g = g++;
        return g;
    }
*/
    public static void main(String[] args) {
        int g = 0;
        int[] tablica = new int[30];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = g;
            g++;
            g++;
            System.out.println(tablica[i]);
        }
    }
}