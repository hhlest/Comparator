import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {

        Group g1 = new Group("101");

        Input in = new Input();

        in.setName();
        in.setLastName();

        try {
            in.setGender();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        try {
            in.setID();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Input issue. ID isn't integer.");
        }


        Student s4 = in.createStudent(g1);

        try {
            g1.addStudent(s4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(g1);
    }
}
