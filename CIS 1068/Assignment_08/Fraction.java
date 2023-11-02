package Assignment_08;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("0 in the denometer is not allowed.");

        } else {
            numerator = n;
            denominator = d;
        }

    }

    public Fraction add(Fraction a) {
        if (denominator == a.denominator) {
            a.numerator += numerator;
            a.denominator += denominator;
            reduceFract(a);
            return a;
        } else {
            int top = ((a.numerator * denominator) + (a.denominator * numerator));
            int bottom = denominator * a.denominator;
            a.numerator = top;
            a.denominator = bottom;
            reduceFract(a);
            return a;
        }

    }

    public boolean equals(Fraction a) {
        if ((numerator == a.numerator) && (denominator == a.denominator)) {
            return true;
        } else {
            return false;
        }
    }

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        denominator = d;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    private Fraction reduceFract(Fraction a) {
        int top = a.getNum();
        int bottom = a.getDenom();
        int gcd = 0;
        while (bottom != 0) {
            gcd = bottom;
            bottom = (top % bottom);
            top = gcd;

        }
        a.setNum(a.getNum() / gcd);
        a.setDenom(a.getDenom() / gcd);
        return a;
    }
}