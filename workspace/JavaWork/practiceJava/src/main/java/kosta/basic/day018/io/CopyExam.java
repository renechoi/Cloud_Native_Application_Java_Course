package kosta.basic.day018.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyExam {

    public static void main(String[] args) throws IOException {
        // Todo : poem2.txt -> 카피 -> poem3.txt로 복사해보자

        String fileOriginal = "poem2.txt";
        String fileNew = "poem3.txt";

        copyFile(fileOriginal, fileNew);
    }

    private static void copyFile(String fileOriginal, String fileNew) throws IOException {
        FileReader fileReader = new FileReader(fileOriginal);
        FileWriter fileWriter = new FileWriter(fileNew);

        char[] textTotal = readFile(fileReader, getTextLength(fileOriginal));
        writeFile(fileWriter, textTotal);
        checkResult(fileNew);
    }

    private static void checkResult(String fileNew) throws IOException {
        char[] resultBlock = new char[getTextLength(fileNew) + 2];
        FileReader copyChecker = new FileReader(fileNew);
        copyChecker.read(resultBlock);
        System.out.printf("이런 텍스트가 카피되었네요! ⇣⇣⇣\n\n");
        System.out.println(resultBlock);
    }

    private static char[] readFile(FileReader fileReader, int textLength) throws IOException {
        char[] copyBlock = new char[textLength + 2];
        fileReader.read(copyBlock);
        return copyBlock;
    }

    private static void writeFile(FileWriter fileWriter, char[] textTotal) throws IOException {
        fileWriter.write(textTotal);
        fileWriter.close();
    }

    private static int getTextLength(String fileOriginal) throws IOException {
        return Files.lines(Paths.get(fileOriginal)).mapToInt(String::length).sum();
    }

}
