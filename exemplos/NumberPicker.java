import java.util.Random; // import tells us where to find Random

public class NumberPicker {
    public static void main(String[] args){
        Random r = new Random(); // Não compila
        System.out.println(r.nextInt(10)); // um número 0-9
    }
}