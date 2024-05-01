// Student.java
public class Student extends User {
    // Constructor
    public Student(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    // Override check method
    @Override
    public void check() {
        System.out.println("This is a student.");
    }
}