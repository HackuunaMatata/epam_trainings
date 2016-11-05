package com.sasha.SE_05.Task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * Created by Александра on 06.11.2016.
 */
public class WorkWithFile {
    private static Path path;

    public static Path getPath() {
        return path;
    }

    public static void setPath(String path) {
        WorkWithFile.path = Paths.get(path);
    }

    public static String readFile() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append("\n" + line);
            }
            reader.close();
            return text.toString();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToFile(String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            writer.write(text);
            writer.close();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearAndWriteToFile(String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write(text);
            writer.close();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName() {
        return path.getFileName().toString();
    }

    public static String catalog() {
        StringBuilder way = new StringBuilder();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path paths : stream) {
                way.append(paths.getFileName() + "\n");
            }
        } catch (NotDirectoryException e) {
            System.out.println("It's file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return way.toString();
    }

    public static void createFile() {
        try {
            Path file = Files.createFile(path);
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        try {
            Files.delete(path);
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
