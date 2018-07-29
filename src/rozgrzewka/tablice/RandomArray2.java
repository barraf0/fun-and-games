package rozgrzewka.tablice;
import java.util.Random;

public class RandomArray2 {

    public static int fill() {
        Random rand = new Random();
        int losowaliczba = rand.nextInt(11);
        //int losowaliczba = rand.ints(10)+10;
        return losowaliczba;
    }

    public static void main(String[] args) {
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i=i+2) {
            tablica[i] = fill();
            System.out.println("pod komorka: " + i + " widnieje watosc " + tablica[i]);
        }

    }
}
