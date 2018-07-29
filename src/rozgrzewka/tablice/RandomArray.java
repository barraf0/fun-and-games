package rozgrzewka.tablice;
import java.util.Random;

public class RandomArray {

    public static int fill() {
        Random rand = new Random();
        int losowaliczba = rand.nextInt();
        return losowaliczba;
    }

    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = fill();
            System.out.println(tablica[i]);
        }

    }
}