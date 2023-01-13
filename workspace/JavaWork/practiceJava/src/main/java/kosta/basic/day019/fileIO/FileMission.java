package kosta.basic.day019.fileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileMission {

    public static final String ABSOLUTE_SOURCE_PATH = System.getProperty("user.dir") + "/src";

    public static void main(String[] args) throws IOException {
        // 1. 바이트 스트림을 이용하여 이미지 파일을 복사해보자.

        // 2. 전체 디렉토리 복사 !

        // 현재 파일에서 상위 디렉토리로 올라가서 img 폴더를 찾고
        // img 있는 파일을 찾아서 해당 파일 추출
        // img copy 폴더를 새로 만들어서
        // 거기다가 카피

        File absoluteSourceFile = getAbsoluteSourceFile();

        List<File> allFilesInFolder = getAllFiles();
        List<File> imageFile = getImageFile(allFilesInFolder);
        List<String> allFilePaths = getAllFilePaths(allFilesInFolder);
        List<String> allImageFoldersNames = getImageFoldersNames(allFilePaths);
        List<String> allImageFoldersPaths = getImageFoldersPaths(allFilePaths);
        List<String> allImagePathsAbovePaths = getImageFoldersAboveFolder(allFilePaths);
//        copyImageFolder(allImageFoldersNames, allImagePathsAbovePaths);
//
//        String copySourcePath = getCopySourcePath(allImageFoldersPaths);
//        String copyTargetPath = allImagePathsAbovePaths.get(0)+"/img_2";
//        String copyTargetName = getCopySourceName(allImageFoldersPaths);
//
//        copyImageFile(new File(copySourcePath), new File(copyTargetPath,copyTargetName));
    }

    private static String getCopySourcePath(List<String> allImageFoldersPaths) {
        File file = new File(allImageFoldersPaths.get(0));
        File[] filesBelow = file.listFiles();
        return filesBelow[0].getPath();
    }

    private static String getCopySourceName(List<String> allImageFoldersPaths) {
        File file = new File(allImageFoldersPaths.get(0));
        File[] filesBelow = file.listFiles();
        return filesBelow[0].getName();
    }

    private static void copyImageFile(File source, File target) throws IOException {

        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(target);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.close();
    }

    private static void copyImageFolder(List<String> allImagePaths, List<String> allImagePathsAbovePaths) throws
            IOException {
        // TODO : 맵으로 이미지와 상위 폴더를 매칭시켜서 받아와야 하는데 일단은 하드코딩...
        for (String imgFolderName : allImagePaths) {
            File file = new File(String.format("%s/%s_2", allImagePathsAbovePaths.get(0), imgFolderName));
            file.mkdirs();
        }
    }

    private static List<String> getImageFoldersAboveFolder(List<String> allFilePaths) {
        return allFilePaths.stream().filter(name -> name.contains("img"))
                .map(v -> v.substring(0, v.lastIndexOf("img") - 1))
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<String> getImageFoldersNames(List<String> allFilePaths) {
        return allFilePaths.stream().filter(name -> name.contains("img"))
                .map(v -> v.substring(v.lastIndexOf("img"), v.lastIndexOf("img") + 5))
                .map(v -> v.substring(0, v.lastIndexOf("/")))
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<String> getImageFoldersPaths(List<String> allFilePaths) {
        return allFilePaths.stream().filter(name -> name.contains("img"))
                .map(v -> v.substring(0, v.lastIndexOf("img") + 3))
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<String> getAllFilePaths(List<File> allFilesInFolder) {
        return allFilesInFolder.stream().map(File::getPath).collect(Collectors.toList());
    }

    private static void showAllFiles(List<File> allFilesInFolder) {
        allFilesInFolder.forEach(s -> System.out.println(s.getName()));
    }

    private static List<File> getImageFile(List<File> allFilesInFolder) {
        return allFilesInFolder.stream()
                .filter(fileEach -> fileEach.getName().contains("image") || fileEach.getName().contains("img"))
                .filter(fileEach -> getFileExtension(fileEach.getName()).equals("img") || getFileExtension(fileEach.getName()).equals("png"))
                .toList();
    }

    private static List<File> getAllFiles() throws IOException {
        List<File> filesInFolder = Files.walk(Paths.get(System.getProperty("user.dir")))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .toList();
        return filesInFolder;
    }

    private static File getAbsoluteSourceFile() throws IOException {
        /*
         * return current files absolute parent file as file object
         */
        return new File(ABSOLUTE_SOURCE_PATH);
    }

    public static String getFileExtension(String fullName) {
        int dotIndex = fullName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fullName.substring(dotIndex + 1);
    }

}
