package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
//        Student student2;
//        student2 = new Student();
        student2.name = "stu2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}

