package Assignment_06;

import java.io.*;
import java.util.*;

public class Webify_v4 {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static String userTextInput() {
        System.out.println("Please type in the text file name, please make sure it is correct case");
        String txtFile = CONSOLE.next();
        return txtFile;
    }

    // public static String checkForHeader(String line) {
    // String header;
    // if ((line.startsWith("_")) && (line.endsWith("_"))) {
    // header = "<h1>" + line.substring(1, line.length() - 1) + "</h1>\r";
    // } else {
    // return "";
    // }
    // return header;
    // }

    public static String checkList(String line) {
        String list;
        boolean inList = false;
        if (line.startsWith("-")) {
            if (!inList) {
                list = "<ul>";
                inList = true;
                list += "<li>" + line.substring(2) + "</li>";
                list += "</ul>";
                return list;
            }
        }
        return list = "";
    }

    public static String checkUrl(String line) {
        if ((line.startsWith("[[")) && (line.endsWith("]]"))) {
            String url = line.substring(2, line.indexOf("]")),
                    description = line.substring(line.indexOf("]") + 2, line.length() - 2),
                    hyperlink = "<a href=\"" + url + "\">" + description + "</a>";
            return hyperlink;
        } else {
            return "";
        }

    }

    // public static String checkForBlank(String line) {
    // if (line.equals("")) {
    // line = "<p>\r";
    // }
    // return "";
    // }

    public static void convertTxtToHTML(String tf) throws Exception {
        File txtFile = new File("Assignment_06/" + tf);
        File htmlFile = new File("Assignment_06/" + tf.substring(0, tf.length() - 4) + ".html");

        PrintWriter writer = new PrintWriter(htmlFile);
        FileReader reader = new FileReader(txtFile);
        BufferedReader br = new BufferedReader(reader);

        String line;
        boolean inList = false;
        writer.write("<html>");
        writer.write("<body>");
        while ((line = br.readLine()) != null) {
            if ((line.startsWith("_")) && (line.endsWith("_"))) {
                line = "<h1>" + line.substring(2, line.length() - 1) + "</h1>";
            } else if (line.startsWith("-")) {
                if (!inList) {
                    writer.write("<ul>");
                    inList = true;
                    line = "<li>" + line.substring(2) + "</li>";
                    writer.write(line);
                } else {
                    line = "<li>" + line.substring(2) + "</li>";
                    writer.write(line);
                }

            } else if (!line.startsWith("-") && inList) {
                line = "</ul>";
                writer.write(line);
                inList = false;
            } else if ((line.startsWith("[[")) && line.endsWith("]]")) {
                String url = line.substring(2, line.indexOf("]"));
                String description = line.substring(line.indexOf("]") + 2, line.length() - 2);
                String hyperlink = "<a href=\"" + url + "\"><p>" + description + "</p></a>";
                line = hyperlink;
                writer.write(line);
            } else if ("".equals(line)) {
                line = "<P>";
                writer.write(line);
            }
        }
        if ((line == null) && inList) {
            line = "</ul>";
            writer.write(line);
            inList = false;
        }
        writer.write("</body>");
        writer.write("</html>");
        br.close();
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        String txtFile = userTextInput();
        convertTxtToHTML(txtFile);
    }

}
