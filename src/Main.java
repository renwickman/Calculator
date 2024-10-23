public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.divide(35, 7));
        System.out.println(myCalculator.multiply(5, 5));
        System.out.println(myCalculator.modulo(28, 3));
    }
}