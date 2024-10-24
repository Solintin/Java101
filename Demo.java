public class Demo {
    public static void main(String args[]) {
        // int a = 10;
        // int b = 20;
        // boolean result = b > a;
        // System.out.println(result);
        int n = 4;

        switch (n) {
            case 1 ->
                System.out.println("The day is Sunday");

            case 2 -> System.out.println("The day is Monday");
            case 3 -> System.out.println("The day is Tues");
            case 4 -> System.out.println("The day is Wednesday");
            case 5 -> System.out.println("The day is Thursday");
            case 6 -> System.out.println("The day is Friday");
            case 7 -> System.out.println("The day is Saturday");
            default -> System.out.println("The day is unknown");
        }
    }
}