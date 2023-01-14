import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private String name;
    private String lastName;
    private Gender gender;
    private int ID;

    public Input() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Name : ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Lastname: ");
        Scanner sc = new Scanner(System.in);
        this.lastName = sc.next();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender() throws IllegalArgumentException {
        System.out.println("Gender M/F: ");
        Scanner sc = new Scanner(System.in);
        String gen = sc.next().toUpperCase();

        if (gen.equals("M") || gen.equals("F")) {
            this.gender = Gender.valueOf(gen);
        } else {
            throw new IllegalArgumentException("Input issue. No such enum constant.");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID() throws InputMismatchException {
        System.out.println("ID: ");
        Scanner sc = new Scanner(System.in);
        this.ID = sc.nextInt();
    }

    public Student createStudent(Group group) {
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
