package September_14_2023;

public class WeirdStringStuff {
    public static void main(String[] args) {
        String msg = "i need coffee";
        // Can't use brackets for strings
        // System.out.println(msg[0])
        // charAt(index) returns character at index position
        System.out.println(msg.charAt(0));
        // Strings cannot be modified after they are declared.

        // How to change the first character
        msg = 'I' + msg.substring(1);
        System.out.println(msg);
    }
}
