package Assignment_02;

public class restaurant_receipt {
    // Created tax function to muiltiply subtotal and taxrate and return the value
    // as a double
    public static double tax(double subtotal, double taxrate) {
        final double tax_total = (subtotal * taxrate);
        return tax_total;
    }

    // Created tax function to muiltiply subtotal and tiprate and
    // return the value as a double
    public static double tip(double subtotal, double tiprate) {
        final double tip_total = (subtotal * tiprate);
        return tip_total;
    }

    // Created receipt function to add subtotal, tax, and tip into one value.
    // Converts the double to string, and returns the string value.
    public static String receipt(double subtotal, double tax, double tip) {
        final double total = subtotal + tax + tip;
        // Converts total value from double to String.
        String totalstring = String.valueOf(total);
        return totalstring;

    }

    public static void main(String[] args) {
        final double TAX_RATE = 0.08;
        final double TIP_RATE = 0.2;

        double subtotal = 38 + 40 + 30;
        double tax = tax(subtotal, TAX_RATE);
        double tip = tip(subtotal, TIP_RATE);
        String total = receipt(subtotal, tax, tip);

        System.out.print(" ######                                      \r\n" + //
                " #     # ######  ####  ###### # #####  ##### \r\n" + //
                " #     # #      #    # #      # #    #   #   \r\n" + //
                " ######  #####  #      #####  # #    #   #   \r\n" + //
                " #   #   #      #      #      # #####    #   \r\n" + //
                " #    #  #      #    # #      # #        #   \r\n" + //
                " #     # ######  ####  ###### # #        #   \r\n" + //
                "                                             \r\n");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Tip: $" + tip);
        System.out.println("Total: $" + total);
    }
}
