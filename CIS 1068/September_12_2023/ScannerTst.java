package September_12_2023;

import java.util.*; // Imports java utilities like Scanner

public class ScannerTst {
    public static void main(String[] args) {
        int x = 5;
        Scanner inFromKBD = new Scanner(System.in);

        System.out.print("What's your name?\r\n");
        String name = inFromKBD.next();

        System.out.println("Hi Carl... Oh your name is " + name + ".");
        System.out.print("How old are you?\r\n");
        int age = inFromKBD.nextInt();
        System.out.println("Oh your " + age + ", thats not....too bad.");
    }
}
