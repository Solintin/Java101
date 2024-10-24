abstract class Father {
    abstract void sleep();

    public void speak() {
        System.out.println("Human can speak");
    }
}

class Son extends Father {
    void sleep() {
        System.out.println("Son is sleeping");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Son A = new Son();
        A.sleep();
    }
}