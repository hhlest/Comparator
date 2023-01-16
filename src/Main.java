
public class Main {
    public static void main(String[] args) {

        Group g1 = new Group("101");

        InputStudent inputStudent = new InputStudent();

        Student s4 = inputStudent.createStudent(g1);

        try {
            g1.addStudent(s4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(g1);
    }
}
