import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type a paragraph: ");
        String  text = scanner.nextLine();

        String[] words = text.split("\\s+");

        Map <String, Integer> textMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                int frequency = textMap.getOrDefault(word,0);
                textMap.put(word, frequency + 1);
            }
        }
        System.out.println("\nWord Frequency:");
        for (Map.Entry entry : textMap.entrySet()) {
            String word = (String) entry.getKey();
            int frequency = (int) entry.getValue();
            System.out.println(word + ": " + frequency);
        }
        scanner.close();
    }
}


        //Use um HashMap para armazenar os pares palavra-frequência.
        //Solicitar ao usuário que insira um parágrafo de texto.
        //Divida o parágrafo em palavras individuais e conte a frequência de cada palavra.
        //Mostrar a palavra e sua frequência.