import java.util.*;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (String number : numbers) {
            integerList.add(Integer.parseInt(number));
        }

        List<Integer> uniqueArrayList = removeDuplicatesArrayList(integerList);
        List<Integer> uniqueLinkedList = removeDuplicatesLinkedList(integerList);

        System.out.println("Unique integers in ArrayList format:");
        for (Integer num : uniqueArrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Unique integers in LinkedList format:");
        for (Integer num : uniqueLinkedList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static List<Integer> removeDuplicatesArrayList(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static List<Integer> removeDuplicatesLinkedList(List<Integer> list) {
        return new LinkedList<>(new LinkedHashSet<>(list));
    }
}
