 class MyParent {
    MyParent() {
        System.out.println("MyParent constructor");
    }
}

public class ConstructorExample extends MyParent {

    ConstructorExample() {
        super();
        System.out.println("Constructor Example");
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}
