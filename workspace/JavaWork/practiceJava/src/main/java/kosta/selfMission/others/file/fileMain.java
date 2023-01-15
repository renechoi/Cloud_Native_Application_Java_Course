package kosta.selfMission.others.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class fileMain {

    public static final Path CURRENT_DIRECTORY = Paths.get(".");

    public static void main(String[] args) throws IOException {
        Path pathFileToWrite = Paths.get("./src/main/java/kosta/selfMission/others/file/resources/file-write.txt");

        List<String> strings = List.of("Apple", "Boy", "Cat", "Dog");

        Files.write(pathFileToWrite, strings);

    }

    private static void practiceReadLines(Path pathFileToRead) throws IOException {
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str->str.contains("a"))
                .forEach(System.out::println);
    }

    private static void practiceFindMethod() throws IOException {
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) ->  String.valueOf(path).contains(".java");
        Files.find(CURRENT_DIRECTORY, 20, javaMatcher).forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) ->  attributes.isDirectory();
        Files.find(CURRENT_DIRECTORY, 20, directoryMatcher).forEach(System.out::println);
    }

    private static void getAllFilesAndFilter() throws IOException {
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(CURRENT_DIRECTORY,4)
                .filter(predicate);
    }

    private static void getCurrentDirFiles() throws IOException {
        Path currentPath = CURRENT_DIRECTORY;
        Files.list(currentPath).forEach(System.out::println);
    }
}
