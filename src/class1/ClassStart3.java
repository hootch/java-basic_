package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"student1", "student2", "student3"};
        int[] studentAges = {18, 15, 17};
        int[] studentGrades = {90, 70, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + " " + studentAges[i] + " " + studentGrades[i]);
        }
    }
}
