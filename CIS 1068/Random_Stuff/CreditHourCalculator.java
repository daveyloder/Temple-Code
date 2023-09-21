package Random_Stuff;

import java.util.*;

public class CreditHourCalculator {

    public static String[] userInfo() {
        Scanner userInput = new Scanner(System.in);
        String firstName = "", lastName = "";
        System.out.println("What is your first name?");
        firstName = userInput.next();
        System.out.println("What is your last name?");
        lastName = userInput.next();
        String[] name = { "", "" };
        name[0] = firstName;
        name[1] = lastName;
        System.out.println("Hello, " + name[0] + " " + name[1]);
        return name;
    }

    public static String userMajor() {
        Scanner userInput = new Scanner(System.in);
        HashMap<Integer, String> majorDictionary = new HashMap<Integer, String>();
        String major = "";
        int majorSelection = 0;
        majorDictionary.put(1, "IST");
        majorDictionary.put(2, "CIS");
        majorDictionary.put(3, "ACCT");
        majorDictionary.put(4, "BIO");
        majorDictionary.put(5, "PSYCH");

        System.out.println("What is your major? Please type a number");
        for (int i : majorDictionary.keySet()) {
            System.out.println(i + ". " + majorDictionary.get(i));
        }
        majorSelection += userInput.nextInt();
        for (int i : majorDictionary.keySet()) {
            if (majorSelection == i) {
                major = majorDictionary.get(i);
                System.out.println("Your major is " + major);
            }
        }

        return major;

    }

    public static void main(String[] args) {
        String[] user = userInfo();
        String major = userMajor();
    }
}