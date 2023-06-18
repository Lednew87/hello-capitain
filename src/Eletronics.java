import java.util.ArrayList;
import java.util.List; 
public class Eletronics {
    public static void main(String[] args) {

        List<String> eletronics = new ArrayList<>();

        eletronics.add("Notebook");
        eletronics.add("Television");
        eletronics.add("Smart phone");
        eletronics.add("Computer");

        String firstEletronic = eletronics.get(0);
        System.out.println("First eletronic: " + firstEletronic);

        System.out.println("Eletronics in the list:");
        for (String eletronic : eletronics) {
            System.out.println(eletronic);
        }

        boolean containsComputer = eletronics.contains("Computer");
        System.out.println("Contains Computer: " + containsComputer);

        eletronics.set(2, "Tablet");
        System.out.println("Updated eletronics list:");
        for (String eletronic : eletronics) {
            System.out.println(eletronic);
        }

        boolean removed = eletronics.remove("Television");
        System.out.println("Television removed: " + removed);
        System.out.println("Eletronics after removal:");
        for (String eletronic : eletronics) {
            System.out.println(eletronic);
        }

        int size = eletronics.size();
        System.out.println("Size of the list: " + size);

        boolean isEmpty = eletronics.isEmpty();
        System.out.println("List is empty: " + isEmpty);
        eletronics.clear();
        boolean isEmptyNow = eletronics.isEmpty();
        System.out.println("List is empty now: " + isEmptyNow);
    }
}

