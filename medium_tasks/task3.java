import java.util.*;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();

        String[] strings = input.split(" ");
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        List<String> uniqueStrings = removeDuplicates(stringList);

        System.out.println("Updated list without duplicates:");
        for (String str : uniqueStrings) {
            System.out.print(str + " ");
        }

        scanner.close();
    }

    public static List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
