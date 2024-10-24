class Student {
    String name;
    int age;
    String level;
    String regNo;
}

public class ObjectArray {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.level = "100L";
        s1.regNo = "R1234";

        Student EngineStudents[] = new Student[1];
        EngineStudents[0] = s1;
        System.out.println(EngineStudents);
        for (Student s : EngineStudents) {
            System.out.println(String.format("Student Name: %s", s.level));
        }
    }
}