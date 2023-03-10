import java.util.InputMismatchException;
import java.util.Scanner;

public class InputStudent {
    private String name;
    private String lastName;
    private Gender gender;
    private int ID;
    private Scanner sc = new Scanner(System.in);

    public InputStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Name : ");
        this.name = sc.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Lastname: ");
        this.lastName = sc.next();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender() throws IllegalArgumentException {
        System.out.println("Gender M/F: ");
        String gen = sc.next().toUpperCase();

        if (gen.equals("M") || gen.equals("F")) {
            this.gender = Gender.valueOf(gen);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getID() {
        return ID;
    }

    public void setID() throws InputMismatchException {
        System.out.println("ID: ");
        this.ID = sc.nextInt();
    }

    public Student createStudent(Group group) {
        setName();
        setLastName();

        try {
            setGender();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e + ": No such enum constant. GENDER will be equal null.\n");
        }

        try {
            setID();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e + ": Input ID isn't integer. ID will be equal 0.\n");
        }
        return new Student(getName(), getLastName(), getGender(), getID(), group.getGroupName());
    }

    @Override
    public String toString() {
        return "Input{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                '}';
    }
}
