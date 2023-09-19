package Assignment_03;

import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double homeworkWeight = .50;
        double exam1weight = .20;
        double exam2weight = .30;

        System.out.println("Number of assignments? ");
        int numOfAssign = scanner.nextInt();

        System.out.println("Average homework grade? ");
        double averageHWGrade = scanner.nextDouble();

        System.out.println("Number of late days used? ");
        int lateDaysUsed = scanner.nextInt();

        System.out.println("Labs attended? ");
        int labsAttended = scanner.nextInt();

    }

}
