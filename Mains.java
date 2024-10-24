import com.example.math.Calculator;
import java.util.Scanner;
// class person {
//     private String name;

//     public String getName() {
//         return this.name;
//     }

//     public void SetName(String newName) {
//         this.name = newName;
//     }

// }

class Mains {
    // int x;

    // Mains(int y) {
    // this.x = y;

    // }

    public static void main(String[] args) {
        // Mains m = new Mains(10);
        // System.out.println(m.x);
        Main obj = new Main();
        obj.maxSpeed(20);
        // obj.fullThrottle();
        // person personObj = new person();
        // personObj.SetName("Alley Soliu");
        // System.out.println(personObj.getName());

        Calculator mathTool = new Calculator();
        mathTool.add(9, 10);
        mathTool.subtract(9, 10);
        mathTool.multiply(9, 10);
        mathTool.divide(9, 10);
        Scanner inputScanner = new Scanner(System.in);
        try (inputScanner) {
            int var = inputScanner.nextInt();
            System.out.println("Your Input is " + var);
        }
    }
}