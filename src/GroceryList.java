import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> items = new ArrayList<>();

        // Add elements to the list
        items.add("Vegetables");
        items.add("Rice");
        items.add("Meat");
        items.add("Fish");

        // Accessing elements by index
        String firstItem = items.get(0);
        System.out.println("First item of grocery list: " + firstItem);

        // Iterating over the list using a for loop
        System.out.println("Items in the list:");
        for (String item : items) {
            System.out.println(item);
        }

        // Checking if an element exists in the list
        boolean containsMeat = items.contains("Meat");
        System.out.println("Contains Meat: " + containsMeat);

        // Updating an element in the list
        items.set(2, "Chicken");
        System.out.println("Updated item of the grocery list:");
        for (String item : items) {
            System.out.println(item);
        }

        // Removing an element from the list
        boolean removed = items.remove("Rice");
        System.out.println("Rice removed: " + removed);
        System.out.println("Grocery list after removal:");
        for (String item : items) {
            System.out.println(item);
        }

        // Size of the list
        int size = items.size();
        System.out.println("Size of the list: " + size);

        // Clearing the list

        boolean isEmpty = items.isEmpty();
        System.out.println("List is empty? : " + isEmpty);
        items.clear();

        boolean isEmptyNow = items.isEmpty();
        System.out.println("List is empty now? : " + isEmptyNow);
        int sizeNow = items.size();
        System.out.println("Size of the list: " + sizeNow);
    }
}








    //Adicionar itens à lista de compras.
    //Remova itens da lista de compras.
    //Imprima a lista de compras atual.
    //Verifique se um item específico já está na lista de compras.
    //Limpe toda a lista de compras.