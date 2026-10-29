public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("10 + 5 = " + c.add(10, 5));
        System.out.println("10 - 5 = " + c.subtract(10, 5));
        System.out.println("10 * 5 = " + c.multiply(10, 5));
        System.out.println("10 / 5 = " + c.divide(10, 5));
    }
}
