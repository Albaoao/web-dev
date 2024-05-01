import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rate = 0.2;
        double salary = 0;

        System.out.print("Enter work hours:");
        double hours = scanner.nextDouble();

        if (hours > 40 && hours <= 60) {
            salary = hours * rate * 1.5;
        } else if (hours > 60) {
            System.out.println("it is not allowed to work more than 60 hours!");
            return;
        } else {
            salary = hours * rate;
        }

        System.out.print("Your salary:" + salary);
    }
}