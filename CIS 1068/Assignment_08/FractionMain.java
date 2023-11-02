package Assignment_08;

public class FractionMain {
    public static void main(String[] args) {
        // Creating new fractions
        System.out.println("// Creating new fractions");
        Fraction frac1 = new Fraction(1, 4);
        Fraction frac2 = new Fraction(7, 8);
        Fraction frac3 = new Fraction(1, 2);
        Fraction frac4 = new Fraction(13, 8);
        System.out.println(frac1);
        System.out.println(frac2);
        System.out.println(frac3);
        System.out.println("\r");
        // Adding
        System.out.println("// Adding");
        frac1 = frac1.add(frac2);
        System.out.println(frac1);
        frac1 = frac2.add(frac3);
        System.out.println(frac1);
        System.out.println("\r");
        // Comparison
        System.out.println("// Comparison");
        System.out.println(frac1.equals(frac4));
        System.out.println(frac1.equals(frac2));
        System.out.println("\r");
    }
}