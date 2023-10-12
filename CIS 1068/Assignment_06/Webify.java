package Assignment_06;

import java.util.*;
import java.io.*;

public class Webify {
    // The user should enter the name of an input file which ends ".txt". The output
    // file should have the same name as the input file, except that instead of
    // ending ".txt", it should end ".html"
    public static String userFileInput() throws Exception {
        Scanner userFileInput = new Scanner(System.in);
        System.out.println("Please type the file name of the text document");
        System.out.println("Case and spaces do matter");
        String txtFileName = userFileInput.next();
        File pathToTxt = new File("Assignment_06/" + txtFileName + ".txt");
        FileWriter writer = new FileWriter(pathToTxt);
        writer.write("_This is a header");

        return txtFileName;
    }

    public static void checkForH1(char c) {
        if (c == '_') {

        }
    }

    public static void ConvertTxtToHtml(String filename) throws IOException {

        File txtFile = new File("Assignment_06/" + filename + ".txt");
        File htmFile = new File("Assignment_06/" + filename + ".html");

        PrintWriter writer = new PrintWriter(htmFile);

        FileReader reader = new FileReader(txtFile);
        int c;
        writer.print("<html>\r");
        writer.print("<body>\r");
        while ((c = reader.read()) != -1) {
            writer.print((char) c);
        }
        writer.print("</body>\r");
        writer.print("</html>");
        reader.close();
        writer.close();

    }

    // Converting txt file to html rules

    public static void main(String[] args) throws Exception {
        String txtFile = userFileInput();
        ConvertTxtToHtml(txtFile);
    }
}
