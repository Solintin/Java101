import com.example.math.Calculator;
import java.util.Scanner;
import java.time.LocalDateTime;

enum options {
    A,
    S,
    M,
    D,
    Q
}

public class MyCalculator {

    static void inputReceiver(Scanner input, int[] nums) {
        System.out.println("Enter your first input");
        nums[0] = input.nextInt();
        System.out.println("Enter your second input");
        nums[1] = input.nextInt();
    }

    static void instruction() {
        for (options op : options.values()) {
            System.out.println(op + " 1 for addition");
        }
        System.out.println("2 for subtraction,");
        System.out.println("3 for multiply");
        System.out.println("4 for division");
        System.out.println("0 to quit calculator");
    }

    public static void main(String arg[]) {
        LocalDateTime dateObj = LocalDateTime.now();
        System.out.println(dateObj);

        int[] nums = new int[2];
        Calculator mathTool = new Calculator();
        System.out.println("Welcome to my Calculator");
        System.out.println("Follow the instruction below");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        instruction();
        

        while (selection != 0) {
            System.out.println("Enter your choice for new calc operation");
            instruction();

            int choice = input.nextInt();
            selection = choice;
            switch (choice) {
                case 1:
                    inputReceiver(input, nums);
                    mathTool.add(nums[0], nums[1]);
                    break;
                case 2:
                    inputReceiver(input, nums);
                    mathTool.subtract(nums[0], nums[1]);
                    break;
                case 3:
                    inputReceiver(input, nums);
                    mathTool.multiply(nums[0], nums[1]);
                    break;
                case 4:
                    inputReceiver(input, nums);
                    mathTool.divide(nums[0], nums[1]);
                    break;

                default:
                    System.out.println("Invalid Input");
                    instruction();
                    break;
            }

        }
        System.out.println("Bye. Thank You");
    }
}