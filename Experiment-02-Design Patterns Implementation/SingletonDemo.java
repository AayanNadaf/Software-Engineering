public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {
        System.out.println("Singleton Object Created");
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = SingletonDemo.getInstance();
        System.out.println(obj1 == obj2);
    }
}
