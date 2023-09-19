package Assignment_03;

// Delete the above package.
import java.util.*;

public class Grading_Calculator {
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

        // Checks conditions of inputs
        // if averageHomeworkGrade is a negative number, set averageHomeworkGrade to 0
        if (averageHomeworkGrade < 0) {
            averageHomeworkGrade = 0;
            totalPoints = (averageHomeworkGrade * assignmentNumber + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
            // if late days are more than half of homework assigned amount, deduct 10% from
            // homeworkGrade.
        } else if (lateDays > (assignmentNumber * .5)) {
            totalPoints = (averageHomeworkGrade * assignmentNumber + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
            homeworkGrade -= (homeworkGrade * .10);
            System.out.println("You lost 10% for submitting more late assignments then what half was assigned.");
            // if there are no late days and the average homework grade is less than 10, add
            // 5 points onto totalPoints.
        } else if ((lateDays == 0) && (averageHomeworkGrade < 10)) {
            totalPoints = 5;
            totalPoints += (averageHomeworkGrade * assignmentNumber + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
            System.out.println("You gained 5 points for not submitting any late assignments. Great job!");
        } else {
            totalPoints = (averageHomeworkGrade * assignmentNumber + 4 * labAttendance);
            homeworkGrade = 100 * (totalPoints / (10 * 10 + 4 * 10));
        }
        // Output results for homework.
        System.out.print("Total points: " + totalPoints + " / 140\r\n");
        weightedHomeworkScore = (homeworkweight * homeworkGrade) / 100;
        System.out.print("Weighted score: " + (Math.round(weightedHomeworkScore * 100.0) / 100.0) + "\r\n");
        System.out.println();
        return weightedHomeworkScore;

    }

    public static double weightedexamgrade(String examnumber, double examweight) {
        // Create input using scanner
        Scanner examscoreInput = new Scanner(System.in);
        // Create all variables for the function.
        double examScore, curveScore, weightedscore;
        // Ask questions about exam score and curve points
        System.out.print("Exam " + examnumber + ":\r\n");
        System.out.print("Score? ");
        examScore = examscoreInput.nextDouble();
        System.out.print("Curve? ");
        curveScore = examscoreInput.nextDouble();
        // Checks to see if examscore and curve score are greater or equal to 100
        if (examScore + curveScore >= 100) {
            examScore = 100;
        } else {
            examScore += curveScore;
        }
        // Outputs results for exams.
        System.out.print("Total Score: " + examScore + " / 100 \r\n");
        weightedscore = examweight * (examScore / 100);
        System.out.print("Weighted score: " + (Math.round(weightedscore * 100.0) / 100.0) + "\r\n");
        System.out.println();
        return weightedscore;
    }

    public static void main(String[] args) {
        // Create scanner for weight input
        Scanner weightInput = new Scanner(System.in);
        // Ask for exam 1, exam 2, and homework weight percents in whole int
        System.out.print("What is Homework weight? :");
        double homeworkweight = weightInput.nextInt();
        System.out.print("What is Exam 1 weight? :");
        double exam1weight = weightInput.nextInt();
        System.out.print("What is Exam 2 weight? :");
        double exam2weight = weightInput.nextInt();
        // Save outputs of functions to variables while also calling functions
        double weightedhomeworkgrade = homeworkgradewithweight(homeworkweight);
        double weightedexam1grade = weightedexamgrade("1", exam1weight);
        double weightedexam2grade = weightedexamgrade("2", exam2weight);
        // Add weighted grades together and output results in double.
        double grade = weightedhomeworkgrade + weightedexam1grade + weightedexam2grade;
        System.out.print("Course grade: " + (Math.round(grade * 100.0) / 100.0));

    }
}