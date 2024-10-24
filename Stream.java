import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Stream {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(nums);
        Student Obj = new Student("alley", 10);
        Student Obj1 = new Student("soliu", 14);
        Student Obj2 = new Student("babatunde", 13);
        // System.out.println(Obj.age);

        List<Student> students = Arrays.asList(Obj, Obj1, Obj2);
        // Iterator<Student> studentsIt = students.iterator();
        // System.out.println(studentsIt.next().name);
        System.out.println(students);
        students.forEach((st) -> {
            if (st.name == "soliu") {
                System.out.println(st.age);
            }
        });
    }
}
