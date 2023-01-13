package kosta.basic.day019.fileIO.problem3;

import java.io.*;

public class CopyUtil {

    public static void copyFile(File sourceFile, File destinationFile) throws IOException {
        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.close();
    }


}
