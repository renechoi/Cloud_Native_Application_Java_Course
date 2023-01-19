package kosta.basic.java.day019.fileIO.problem3;

import java.io.*;

public class ProblemMain {
    public static void main(String[] args) throws IOException {

        String source = "/Users/Rene/Documents/rene/Kosta/Cloud_Native_Application_Java_Course/workspace/JavaWork/practiceJava/src/main/java/kosta/basic/day019/testSource";
        String target = "/Users/Rene/Documents/rene/Kosta/Cloud_Native_Application_Java_Course/workspace/JavaWork/practiceJava/src/main/java/kosta/basic/day019/targetDir";

        File sourceDirectory = new File(source);
        File targetDirectory = new File(target);

        copyAll(sourceDirectory, targetDirectory);
    }

    private static void copyAll(File sourceDirectory, File targetDirectory) throws IOException {
        createTargetDirectory(targetDirectory);

        for (File fileEach : sourceDirectory.listFiles()) {
            if (fileEach.isDirectory()) {
                copyAll(fileEach, getFileToCopy(targetDirectory, fileEach));
                continue;
            }
            copyFile(fileEach, getFileToCopy(targetDirectory, fileEach));
        }
    }

    private static void copyFile(File source, File target) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(target);

        copyBytes(inputStream, outputStream);

        inputStream.close();
        outputStream.close();
    }

    private static void createTargetDirectory(File destinationDirectory) {
        if (!destinationDirectory.exists()) {
            destinationDirectory.mkdir();
        }
    }

    private static File getFileToCopy(File targetDirectory, File fileEach) {
        return new File(targetDirectory, fileEach.getName());
    }

    private static void copyBytes(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int length = inputStream.read(buffer);
        while (length > 0) {
            outputStream.write(buffer, 0, length);
            length = inputStream.read(buffer);
        }
    }
}
