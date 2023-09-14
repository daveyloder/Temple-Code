package Assignment_03;

import java.util.*;

public class Grading_Calculator {
    // It's fixed
    public static double homeworkgradewithweight(double homeworkweight) {
        // Create Scanner for homework input variables
        Scanner homeworkscoreInput = new Scanner(System.in);
        // Create all function variables needed.
        double assignmentNumber,
                averageHomeworkGrade,
                lateDays,
                labAttendance,
                totalPoints,
                homeworkGrade,
                weightedHomeworkScore;
        // Ask for variables as doubles
        System.out.print("Homework:\r\n");
        System.out.print("Number of assignments? ");
        assignmentNumber = homeworkscoreInput.nextDouble();
        System.out.print("Average Homework Grade? ");
        averageHomeworkGrade = homeworkscoreInput.nextDouble();
        System.out.print("Number of late days used? ");
        lateDays = homeworkscoreInput.nextDouble();
        System.out.print("Labs attended? ");
        labAttendance = homeworkscoreInput.nextDouble();

        if (lateDays > (assignmentNumber * .5)) {
            totalPoints = (assignmentNumber * 10 + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
            homeworkGrade -= (homeworkGrade * .10);
            System.out.println("You lost 10% for submitting more late assignments then what half was assigned.");
        } else if ((lateDays == 0) && (averageHomeworkGrade < 10)) {
            totalPoints = 5;
            totalPoints += (assignmentNumber * 10 + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
            System.out.println("You gained 5 points for not submitting any late assignments. Great job!");
        } else {
            totalPoints = (assignmentNumber * 10 + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
        }
        System.out.print("Total points: " + totalPoints + " / 140\r\n");
        weightedHomeworkScore = (50 * homeworkGrade) / 100;
        System.out.print("Weighted score: " + weightedHomeworkScore + "\r\n");
        System.out.println();
        return weightedHomeworkScore;

    }

    public static double weightedexamgrade(String examnumber, double examweight) {
        // Create input using scanner
        Scanner examscoreInput = new Scanner(System.in);
        // Create all variables for the function.
        double examScore, curveScore, weightedscore;
        System.out.print("Exam " + examnumber + ":\r\n");
        System.out.print("Score? ");
        examScore = examscoreInput.nextDouble();
        System.out.print("Curve? ");
        curveScore = examscoreInput.nextDouble();
        if (examScore + curveScore > 100) {
            curveScore = 0;
        } else {
            examScore += curveScore;
        }
        System.out.print("Total Score: " + examScore + " / 100 \r\n");
        weightedscore = examweight * (examScore / 100);
        System.out.print("Weighted score: " + weightedscore + "\r\n");
        System.out.println();
        return weightedscore;
    }

    public static void main(String[] args) {
        double exam1weight = 20;
        double exam2weight = 30;
        double homeworkweight = 50;
        double weightedhomeworkgrade = homeworkgradewithweight(homeworkweight);
        double weightedexam1grade = weightedexamgrade("1", exam1weight);
        double weightedexam2grade = weightedexamgrade("2", exam2weight);
        double grade = weightedhomeworkgrade + weightedexam1grade + weightedexam2grade;
        System.out.print("Course grade: " + grade);

    }
}