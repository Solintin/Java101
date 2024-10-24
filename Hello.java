/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        int num1 = 3;
        double num2 = 4.5;
        char c = 'c';
        boolean bool = false;
        byte b2 = (byte) 787;
        int test = 787 % 256;

        System.out.println(num1 + num2);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(b2);
        System.out.println(test);

        int items = 50;
        double price = 4.99;
        char symbol = '$';
        boolean isOnSale = true;
        double totalCost = items * price;
        String result = isOnSale ? String.format("TotalCost is %s %.2f", symbol, totalCost) : "Sales ended";
        System.out.println(result.toLowerCase());

    }
}