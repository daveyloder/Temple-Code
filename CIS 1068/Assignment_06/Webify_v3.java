package Assignment_06;

import java.io.*;
import java.util.*;

public class Webify_v3 {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static String userTextInput() {
        System.out.println("Please type in the text file name, please make sure it is correct case");
        String txtFile = CONSOLE.next();
        return txtFile;
    }

    public static void convertTxtToHtml(String tf) throws Exception {
        File txtFile = new File("Assignment_06/" + tf);
        File htmlFile = new File("Assignment_06/" + tf.substring(0, tf.length() - 4) + ".html");

        PrintWriter writer = new PrintWriter(htmlFile);
        FileReader reader = new FileReader(txtFile);
        BufferedReader br = new BufferedReader(reader);

        String line;
        String lastLine = "";
        boolean inList = false;
        writer.print("<html>\r");
        writer.print("<body>\r");
        while ((line = br.readLine()) != null) {
            // Checks for "_" and replace with html tag
            if ((line.startsWith("_")) && line.endsWith("_")) {
                line = "<h1>" + line.substring(1, line.length() - 1) + "</h1>\r";
                writer.write(line);
                lastLine = line;
                // Checks for "-" to start list
            } else if (line.startsWith("-")) {
                // If first time running, adds starting <ul> and switchs boolean to false
                if (!inList) {
                    line = "<ul>\r";
                    writer.write(line);
                    inList = true;
                }
            } else if (line.startsWith("-") && inList == true) {
                // Adds items that start with - with li tags
                line = "<li>" + line.substring(2) + "</li>\r";
                writer.write(line);
                lastLine = line;
            } else if (!line.startsWith("-") && inList == true) {
                line = "</ul>\r";
                writer.write(line);
                lastLine = line;
                inList = false;
            } else if ((line.startsWith("[[")) && line.endsWith("]]")) {
                String url = line.substring(2, line.indexOf("]"));
                String description = line.substring(line.indexOf("]") + 2, line.length() - 2);
                String hyperlink = "<a href=" + url + ">" + description + "</a>\r";
                line = hyperlink;
                writer.write(line);

            } else if ("".equals(line)) {
                writer.write("<p>\r");
            }
        }
        writer.print("</body>\r");
        writer.print("</html>");
        br.close();
        writer.close();

    }

    public static void main(String[] args) throws Exception {
        String fileTextName = userTextInput();
        convertTxtToHtml(fileTextName);
    }
}
