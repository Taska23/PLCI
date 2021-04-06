import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = scanner.nextLine();

        input.toLowerCase();
        char[] proceed = input.toCharArray();

        for (int i = 0; i<proceed.length; i++){


            String temp = "words/Anastasia/wav edited/" + proceed[i] + ".wav";
            Sound.playSound(temp).join();
        }
    }
}
