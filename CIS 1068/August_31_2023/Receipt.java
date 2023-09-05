package August_31_2023;

public class Receipt {
    public static void main(String[] args) {
        double subtotal = 38 + 40 + 30;
        double taxRate = 0.08;
        double tipRate = 0.20;

        double tax = subtotal * taxRate;
        double tip = subtotal * tipRate;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.print("Tip: $" + tip);
        System.out.println("Total: $" + total);
    }
}