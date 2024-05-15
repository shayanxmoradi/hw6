package calculator;

public class Rational {
    private int numerator;
    private int denominator;
    private int carryOn;



    public void setCarryOn(int carryOn) {
        this.carryOn = carryOn;
    }

//    public void setUpRational(int numerator, int denominator) {
//        if (denominator == 0) {
//            // Handle division by zero
//            System.out.println("Error: Division by zero!");
//            return;
//        }
//
//        int num = numerator;
//        int den = denominator;
//
//        // Find the greatest common divisor
//        int gcd = findGCD(num, den);
//
//        // Simplify the rational number
//        num /= gcd;
//        den /= gcd;
//
//        while (den > 1) {
//            if (num % den == 0) {
//                num /= den;
//                den /= den;
//            } else if (den % num == 0) {
//                den /= num;
//                num /= num;
//            } else {
//                break;
//            }
//        }
//
//        // Store the simplified values into instance variables
//        this.numerator = num;
//        this.denominator = den;
//
//        // Calculate carrier if necessary
//        if (numerator >= denominator) {
//            this.carryOn = numerator / denominator;
//            this.numerator = numerator % denominator;
//            this.denominator = denominator;
//
//        } else {
//            carryOn = 0;
//        }
//        // if (this.numerator==0){this.denominator=0;}
//
//
//    }

    public void setUpRational(int numerator, int denominator) {
        if (denominator == 0) {
            // Handle division by zero
            System.out.println("Error: Division by zero!");
            return;
        }

        int num = numerator;
        int den = denominator;

        // Handle cases where either numerator or denominator is 0
        if (num == 0) {
            this.numerator = 0;
            this.denominator = 1;
            this.carryOn = 0;
            return;
        }

        if (den == 0) {
            System.out.println("Error: Denominator cannot be zero!");
            return;
        }

        // Find the greatest common divisor
        int gcd = findGCD(num, den);

        // Simplify the rational number
        num /= gcd;
        den /= gcd;

        // Start from 2 to avoid division by zero
        for (int i = 2; i <= Math.min(num, den); i++) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
                i = 1;  // Restart the loop from 2 after reducing the fraction
            }
        }

        // Store the simplified values into instance variables
        this.numerator = num;
        this.denominator = den;

        // Calculate carry if necessary
        if (numerator >= denominator) {
            this.carryOn = numerator / denominator;
            this.numerator = numerator % denominator;
        } else {
            carryOn = 0;
        }
    }


    // Helper method to find greatest common divisor using Euclidean algorithm
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    @Override
    public String toString() {
        if (numerator == 0 && carryOn == 0) {
            return "0";
        }

        if (carryOn == 0) {
            return numerator + " / " + denominator;
        }

        if (numerator == 0) {
            return carryOn + "";
        }

        return carryOn + " + " + numerator + " / " + denominator;
    }

    public static float toFloatingPoint(Rational rational) {
        return rational.carryOn + ((float) rational.numerator / rational.denominator);
    }


    public Rational add(Rational rational) {
        // Find a common denominator
        int commonDenominator = this.denominator * rational.denominator;

        int newNumerator = (this.numerator * rational.denominator) + (rational.numerator * this.denominator);

        Rational newRational = new Rational();

        // Simplify
        int gcd = findGCD(newNumerator, commonDenominator);
        newRational.numerator = newNumerator / gcd;
        newRational.denominator = commonDenominator / gcd;

        // Calculate carry if necessary
        if (newRational.numerator >= newRational.denominator) {
            newRational.carryOn = newRational.numerator / newRational.denominator;
            newRational.numerator %= newRational.denominator;
        } else {
            newRational.carryOn = 0;
        }

        // Add the carry from both rationals
        newRational.carryOn += this.carryOn + rational.carryOn;

        // If the sum of the numerators exceeds the denominator, adjust carry and numerator
        if (newRational.numerator >= newRational.denominator) {
            newRational.carryOn += newRational.numerator / newRational.denominator;
            newRational.numerator %= newRational.denominator;
        }

        return newRational;
    }

    public Rational subtract(Rational rational) {
        // Find a common denominator
        int commonDenominator = this.denominator * rational.denominator;

        int newNumerator = (this.numerator * rational.denominator) - (rational.numerator * this.denominator);

        Rational newRational = new Rational();

        // Simplify
        int gcd = findGCD(Math.abs(newNumerator), commonDenominator);
        newRational.numerator = newNumerator / gcd;
        newRational.denominator = commonDenominator / gcd;

        // Calculate carry
        if (newRational.numerator >= newRational.denominator) {
            newRational.carryOn = newRational.numerator / newRational.denominator;
            newRational.numerator %= newRational.denominator;
        } else {
            newRational.carryOn = 0;
        }

        return newRational;
    }

    public Rational multiply(Rational rational) {
        // Multiply the numerators and denominators
        int newNumerator = this.numerator * rational.numerator;
        int newDenominator = this.denominator * rational.denominator;

        Rational newRational = new Rational();

        // Simplify
        int gcd = findGCD(newNumerator, newDenominator);
        newRational.numerator = newNumerator / gcd;
        newRational.denominator = newDenominator / gcd;

        // Calculate carry
        if (newRational.numerator >= newRational.denominator) {
            newRational.carryOn = newRational.numerator / newRational.denominator;
            newRational.numerator %= newRational.denominator;
        } else {
            newRational.carryOn = 0;
        }

        return newRational;
    }

    public Rational divide(Rational rational) {
        Rational reciprocal = new Rational();
        reciprocal.numerator = rational.denominator;
        reciprocal.denominator = rational.numerator;

        return this.multiply(reciprocal);
    }
}
