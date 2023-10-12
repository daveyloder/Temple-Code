package Assignment_06;

import java.util.*;
import java.io.*;

public class Webify_v2 {
    // Outline
    // The user should enter the name of an input file which ends ".txt". The output
    // file should have the same name as the input file, except that instead of
    // ending ".txt", it should end ".html"

    // Method to create the ".txt" file.
    public static String createTextFile() throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in a filename, case does matter.");
        // Create file name using user input and adding ".txt" extension.
        String fileName = userInput.next();

        // Create a new file using file name
        File file = new File("Assignment_06/" + fileName + ".txt");
        // Create a FileWriter to call writing to the file.
        FileWriter writer = new FileWriter(file);

        // Test write to the file.
        writer.write("_This is a test._\r\n" + //
                "This is another test.");

        // Close the writer when finished.
        writer.close();
        userInput.close();
        // returns filename
        return fileName;

    }

    // Method to convert ".txt" file to ".html"
    public static void convertTxtToHtml(String rp, String filename) throws Exception {
        // Create HTML file
        File htmlFile = new File(rp + filename + ".html");

        PrintWriter writer = new PrintWriter(htmlFile);
        FileReader reader = new FileReader(rp + filename + ".txt");
        BufferedReader br = new BufferedReader(reader);

        String line;
        writer.print("<html>\r");
        writer.print("<body>\r");
        while ((line = br.readLine()) != null) {
            // Checks for _ and replaces with <h1></h1>
            if (line.contains("_")) {
                // line = line.replaceFirst("_","<h1>");
                line = "\t<h1>" + line.substring(1, line.length() - 1);
                line = line + "</h1>\r";
                writer.write(line);
            } else if (line.substring(0) == "-") {

            } else {
                writer.write(line);
            }
        }

        writer.print("\r</body>\r");
        writer.print("</html>");
        br.close();
        writer.close();

    }

    public static void main(String[] args) throws Exception {
        String relativePath = "Assignment_06/";
        String fileTextPath = createTextFile();
        convertTxtToHtml(relativePath, fileTextPath);
    }
}
