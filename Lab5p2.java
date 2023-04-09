//name:omar muhammed abdlefatah sha'rawy ⁄„— „Õ„œ ⁄»œ«·› «Õ ‘⁄—«ÊÌ
package rational;

public class Rational {

    int numerator, denominator, wholeNumber;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
        this.wholeNumber = 0;
    }

    public double getDoubleValue() {
        double doubleValue = (double) numerator + denominator;
        return doubleValue;
    }

    public static Rational add(Rational r1, Rational r2) {
        Rational rational = new Rational(r1.numerator + r2.numerator, r1.denominator + r2.denominator);
        return rational;
    }

    public static Rational subract(Rational r1, Rational r2) {
        Rational rational = new Rational(r1.numerator - r2.numerator, r1.denominator - r2.denominator);
        return rational;
    }

    public static Rational multiply(Rational r1, Rational r2) {
        Rational rational = new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
        return rational;
    }

    public static Rational divide(Rational r1, Rational r2) {
        Rational rational = new Rational(r1.numerator / r2.numerator, r1.denominator / r2.denominator);
        return rational;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }

    public void setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    public boolean equals(Rational a, Rational b) {
        boolean bool = (a.getDoubleValue() == b.getDoubleValue());

        return bool;
    }

    public String toString(Rational a) {
        String b = "" + a.numerator + "/" + a.denominator;
        return b;
    }

    public static void main(String[] args) {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(2, 3);
        Rational c = b.add(a, b);

        System.out.println(c.toString(c));
    }
}
