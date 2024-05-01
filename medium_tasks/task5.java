import java.util.*;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        System.out.println("Enter student scores (enter 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                int score = Integer.parseInt(input);
                scores.add(score);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }

        Map<Character, Integer> gradeFrequency = calculateGradeFrequencies(scores);

        for (Map.Entry<Character, Integer> entry : gradeFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Character, Integer> calculateGradeFrequencies(List<Integer> scores) {
        Map<Character, Integer> gradeFrequency = new HashMap<>();
        gradeFrequency.put('A', 0);
        gradeFrequency.put('B', 0);
        gradeFrequency.put('C', 0);
        gradeFrequency.put('D', 0);
        gradeFrequency.put('F', 0);

        for (int score : scores) {
            char grade = calculateGrade(score);

            gradeFrequency.put(grade, gradeFrequency.get(grade) + 1);
        }

        return gradeFrequency;
    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
