package Projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class project2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //input folder name
        String folderName = sc.nextLine();
        String path = System.getProperty("user.home") + "\\Onedrive\\"
                + folderName;

        //create a directory on desktop
        File f = new File(path);
        f.mkdir();

        //create three files inside that directory
        f = new File(path+"\\index.html");
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        fw.append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  " +
                "  <meta charset=\"UTF-8\">\n  " +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  " +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n  " +
                "  <link rel=\"stylesheet\" href=\"style.css\">\n   " +
                " <title>Document</title>\n</head>\n<body>\n    \n" +
                "    <script src=\"script.js\"></script>\n</body>\n</html>");
        fw.close();

        f = new File(path + "\\style.css");
        f.createNewFile();

        fw = new FileWriter(f);
        fw.append("*{\n    margin: 0;\n  " +
                    "  padding: 0;\n " +
                    "   box-sizing: border-box;\n}\nhtml,body{\n  " +
                "  width: 100%;\n    height: 100%;\n}");
        fw.close();

        f = new File(path + "\\script.js");
        f.createNewFile();
    }
}
