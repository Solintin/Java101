/**
 * Object
 */
class Calculator {
    int a = 10;

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result + this.a;
    }
}

public class Object {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println(result);

    }
}