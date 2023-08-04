package StaticFactoryMethod;

public class MyClass {
    private int value;
    private MyClass(int value) {
        this.value = value;
    }

    public static MyClass getInstance(int value){
        System.out.println("Creating object with value " + value);
        return new MyClass(value);
    }

}
