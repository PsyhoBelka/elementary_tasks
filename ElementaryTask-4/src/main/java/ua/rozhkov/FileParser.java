package ua.rozhkov;

import java.io.*;
import java.util.Scanner;

public class FileParser {

    private StringBuilder fileString = new StringBuilder();

    private void readFile(String source) {
        try {
            FileReader fileReader = new FileReader(new File(source));
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                fileString.append(scanner.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error in file opening!");
        }
    }

    public int parseFile(String source, String strCount) {
        int count = 0;
        readFile(source);
        if (fileString.indexOf(strCount) > 0) {
            int tmpIndex = 0;
            while (tmpIndex >= 0) {
                tmpIndex = fileString.indexOf(strCount);
                if (tmpIndex < 0) {
                    break;
                } else {
                    count++;
                    fileString.delete(0, fileString.indexOf(strCount) + strCount.length());
                }
            }
        } else {
            System.out.println("String not found!");
        }
        fileString.delete(0, fileString.length());

        return count;
    }

    public void parseFile(String source, String strSearch, String strReplace) {
        readFile(source);
        if ((fileString.indexOf(strSearch) > 0)) {
            fileString.replace(fileString.indexOf(strSearch), fileString.indexOf(strSearch) + strSearch.length(), strReplace);
        } else {
            System.out.println("String not found!");
            return;
        }
        try (FileWriter fileWriter = new FileWriter(new File(source))) {
            fileWriter.write(fileString.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileString.delete(0, fileString.length());
    }

    public void resetFile(String filename) {
        String fileContent = "Наша мама мыла раму (с).\n" +
                "Кто бы вымыл нашу маму?\n" +
                "Вся она в песке и пенке,\n" +
                "Поцарапаны коленки.\n" +
                "Если я вдруг магом стану,\n" +
                "Сможет рама вымыть маму.";
        try (FileWriter fileWriter = new FileWriter(new File(filename))) {
            fileWriter.write(fileContent);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
