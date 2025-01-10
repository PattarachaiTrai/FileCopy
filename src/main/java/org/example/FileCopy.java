package org.example;

import java.io.*;
import java.nio.file.*;

public class FileCopy {

    public static void copyFiles(String srcFile, String destFolder, int count, String baseFileName) throws IOException {
        File sourceFile = new File(srcFile);
        File destinationFolder = new File(destFolder);

        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs();  // Create destination folder if it doesn't exist
        }

        String fileExtension = getFileExtension(sourceFile);

        for (int i = 0; i < count; i++) {
            String newFileName = baseFileName + "_" + (i + 1) + fileExtension;
            File destFile = new File(destinationFolder, newFileName);

            Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File " + (i + 1) + " copied to: " + destFile.getAbsolutePath());
        }
    }

    // Get file extension
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex > 0) ? fileName.substring(dotIndex) : "";
    }

    public static void main(String[] args) {
        try {
            String srcFile = "C:\\Users\\S_BPattarachai\\Desktop\\xmlFile\\1398020.xml";
            String destFolder = "C:\\Users\\S_BPattarachai\\Desktop\\xmlFile\\testReplace";
            int count = 20;
            String baseFileName = "TestData_V2";

            copyFiles(srcFile, destFolder, count, baseFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
