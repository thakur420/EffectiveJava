package StaticFactoryMethod;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = MyClass.getInstance(5);
        MyClass obj2 = MyClass.getInstance(10);

    }
}
