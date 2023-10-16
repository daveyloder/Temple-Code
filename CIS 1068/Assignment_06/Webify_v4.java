package Assignment_06;

import java.io.*;
import java.util.*;

/* Welcome to the Webify_v4. 
 * A program designed to convert txt files to html code. 
 * In order to use this program correctly, the following must be understood.
 * When the program runs, you must enter the txt file name including the extention ".txt"
 * Here is a table on how to convert txt to html based on what your looking to do.
 * Support is only for the following and will not result in other tags being displayed.
 * For <h1> tags, use "_" before and after the content on the line. - (example) -> "_This is an example of a header_".
 * 
 *  -WARNING- 
 * the following tags need to have a space, 
 * if any issues please just copy and paste the character for your text file.
 * The space is included in the examples below.
 * 
 * For <ul> and <li> tags, use "- " before the the line - (example) -> "- this is part of a list"
 * For <b> tags, use "## " before the line. - (example) -> "## This should be bold."
 * For <i> tags, use "^^ " before the line. - (example) -> "^^ This should be italic."
 * 
 * For <a> tags, please do the following;
 * [[https://example.com][ThisIsTheDescription]]
 * The first nested bracket is the web address. The second is the description of the link.
 * Please make sure to follow this example.
 */

public class Webify_v4 {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static void programIntro() {
        System.out.print(" #     #                                             #       \r\n" + //
                " #  #  # ###### #####  # ###### #   #         #    # #    #  \r\n" + //
                " #  #  # #      #    # # #       # #          #    # #    #  \r\n" + //
                " #  #  # #####  #####  # #####    #           #    # #    #  \r\n" + //
                " #  #  # #      #    # # #        #           #    # ####### \r\n" + //
                " #  #  # #      #    # # #        #            #  #       #  \r\n" + //
                "  ## ##  ###### #####  # #        #             ##        #  \r\n" + //
                "                                      #######                \r\n" + //
                "Now with the power of two hamsters vs our previous 1.5 hamster technology!\r\n");
        System.out.print("");

    }

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
                line = "<h1>" + line.substring(1, line.length() - 1) + "</h1>";
                writer.write(line);
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
                String hyperlink = "<a href=\"" + url + "\">" + description + "</a>";
                line = hyperlink;
                writer.write(line);
            } else if ("".equals(line)) {
                line = "<P>";
                writer.write(line);
                // This line of code checks to see if leading tag has two hastags. IF so, wraps
                // in bold html tag.
            } else if (line.startsWith("##")) {
                line = "<b>" + line.substring(3) + "</b>";
                writer.write(line);
            } else if (line.startsWith("^^")) {
                line = "<i>" + line.substring(3) + "</i>";
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
        programIntro();
        String txtFile = userTextInput();
        convertTxtToHTML(txtFile);
    }

}
