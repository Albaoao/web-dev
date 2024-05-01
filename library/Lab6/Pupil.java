// Pupil.java
public class Pupil extends User {
    // Constructor
    public Pupil(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    // Override check method
    @Override
    public void check() {
        System.out.println("This is a pupil.");
    }
}