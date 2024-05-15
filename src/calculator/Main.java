package calculator;

public class Main {
    public static void main(String[] args) {



        Rational rational1 = new Rational();
        rational1.setUpRational(4, 8);

        Rational rational2 = new Rational();
        rational2.setUpRational(4, 8);

        // Test addition
        System.out.println("Addition: " + rational1.add(rational2));

        // Test subtraction
        System.out.println("Subtraction: " + rational1.subtract(rational2));

        // Test multiplication
        System.out.println("Multiplication: " + rational1.multiply(rational2));

        // Test division
        System.out.println("Division: " + rational1.divide(rational2));

    }
}
