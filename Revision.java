
class FirstClass {
    int test = 10;
}

public class Revision {
    final int b = 5;

    static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        // int i = 0;
        // while (i < 10) {
        // if (i == 4) {
        // i++;
        // continue;
        // }
        // System.out.println(i);
        // i++;
        // }
        String[] cars = { "benz", "corolla", "Mercedes benz", "Honda", "Audi", "Ferrari", "Bugatti" };
        // for (String car : cars) {
        // System.out.println(car);
        // }
        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // System.out.println(myNumbers.length);
        // for (int i = 0; i < myNumbers.length; ++i) {
        // System.out.println(myNumbers[i]);
        // for (int j = 0; j < myNumbers[i].length; ++j) {
        // System.out.println(myNumbers[i][j]);
        // }
        // }
        // for (int[] is : myNumbers) {
        // System.out.println(is);
        // for (int i : is) {
        // System.out.println(i);
        // }
        // }
        // FirstClass obj = new FirstClass();
        // Revision obj2 = new Revision();
        // myMethod();
        // System.out.println(obj.test);
        // System.out.println(obj2.b);

        Integer num1 = 9;
        String numStr = "12";

        System.out.println(num1.getClass());
        System.out.println(numStr.getClass());

    }
}