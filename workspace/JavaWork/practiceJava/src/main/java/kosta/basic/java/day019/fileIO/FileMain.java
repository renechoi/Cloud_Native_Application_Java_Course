package kosta.basic.java.day019.fileIO;

import java.io.File;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));

        showFile(new File("./src/main/java/kosta"));
        showFile(new File("./src"));
        showFile(new File("./src/test"));
        showFile(new File("./src/test/java/kosta/toyMission/baseball/domain/computer", "ComputerNumberGeneratorTest.java"));


        fileToString(new File("./src/test/java/kosta/toyMission/baseball/domain/computer/ComputerNumberGeneratorTest.java"));

    }

    private static void fileToString(File file) {
        // convert the file into the string
        String stringFile = file.toString();

        int index = stringFile.lastIndexOf('/');
        if(index > 0) {
            String fileName = stringFile.substring(index + 1);
            System.out.println("File Name: " + fileName);
        }
    }


    private static void showFile(File currentFile) {
        if (currentFile.isDirectory()) {
            System.out.println("dir: " + currentFile.getName());
            File[] filesBelow = currentFile.listFiles();

            for (File fileEach : filesBelow) {
                System.out.println(fileEach.getName());
            }
            System.out.println("-".repeat(20));
            return;
        }
        System.out.println(currentFile.getName());
        System.out.println("-".repeat(10));

    }


    private static void fileTest() {
        File file = new File(".");
        System.out.println(file.getAbsoluteFile());  // /Users/Rene/Documents/rene/Kosta/Cloud_Native_Application_Java_Course/workspace/JavaWork/practiceJava/.
        System.out.println(file.getAbsoluteFile().getParentFile());  // /Users/Rene/Documents/rene/Kosta/Cloud_Native_Application_Java_Course/workspace/JavaWork/practiceJava/
        int filesTotal = file.getAbsoluteFile().listFiles().length;
    }
}
