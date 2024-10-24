/**
 * Method
 */
class Computer {

    public void playMusic() {
        System.out.println("Playing.. music");
    }

    public String penCost(int cost) {
        double totalCost = (cost * (1.5 / 100)) + cost;

        return "This pen cost " + totalCost;
    }
}

public class JavaMethod {
    public static void main(String args[]) {
        Computer compObj = new Computer();
        String price = compObj.penCost(1000);
        System.out.println(price);
    }
}