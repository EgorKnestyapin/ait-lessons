package practice.archive;

import practice.archive.dao.Archive;
import practice.archive.dao.ArchiveImpl;
import practice.archive.dto.DocumentDto;
import practice.archive.model.Document;
import practice.archive.model.Menu;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ArchiveAppl {
    private static final String FILE_NAME_READ = "java_programming/lesson_1PRO/src/practice/archive/DocumentDto.csv";
    private static final String FILE_NAME_WRITE = "java_programming/lesson_1PRO/src/practice/archive/documents.csv";

    public static void main(String[] args) {
        Archive archive = new ArchiveImpl(new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.printMenu();
            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("All documents: ");
                        printDocuments(archive.getAllDocuments());
                    }
                    case 2 -> {
                        System.out.println("Documents by name: ");
                        scanner.nextLine();
                        System.out.println("Input name: ");
                        String name = scanner.nextLine();
                        printDocuments(archive.findDocumentsByName(name));
                    }
                    case 3 -> {
                        System.out.println("Documents by author: ");
                        scanner.nextLine();
                        System.out.println("Input author: ");
                        String author = scanner.nextLine();
                        printDocuments(archive.findDocumentsByAuthor(author));
                    }
                    case 4 -> {
                        System.out.println("Documents for a period: ");
                        scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        System.out.println("Input date(yyyy-MM-dd) from: ");
                        String dateFromStr = scanner.nextLine();
                        LocalDate dateFrom = LocalDate.parse(dateFromStr, formatter);
                        System.out.println("Input date(yyyy-MM-dd) to: ");
                        String dateToStr = scanner.nextLine();
                        LocalDate dateTo = LocalDate.parse(dateToStr, formatter);
                        printDocuments(archive.findDocumentsForPeriod(dateFrom, dateTo));
                    }
                    case 5 -> {
                        System.out.println("Input name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Input author: ");
                        String author = scanner.nextLine();
                        System.out.println("Input date(yyyy-MM-dd): ");
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String dateStr = scanner.nextLine();
                        LocalDate date = LocalDate.parse(dateStr, formatter);
                        System.out.println("New document: " + archive.addDocument(new Document(name, author, date)));
                    }
                    case 6 -> {
                        System.out.println("Input id: ");
                        int id = scanner.nextInt();
                        System.out.println("Input name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Input author: ");
                        String author = scanner.nextLine();
                        System.out.println("Input date(yyyy-MM-dd): ");
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String dateStr = scanner.nextLine();
                        LocalDate date = LocalDate.parse(dateStr, formatter);
                        System.out.println("Updated: " + archive.updateDocumentById(id, new DocumentDto(name, author, date)));
                    }
                    case 7 -> {
                        System.out.println("Input id: ");
                        int id = scanner.nextInt();
                        System.out.println("Deleted: " + archive.removeDocumentById(id));
                    }
                    case 8 -> {
                        System.out.println("Saving documents...");
                        try {
                            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME_WRITE));
                            for (Document p : archive.getAllDocuments()) {
                                pw.println(p);
                            }
                            pw.flush();
                            pw.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case 9 -> {
                        System.out.println("Loading...");
                        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_READ))) {
                            archive = new ArchiveImpl(new ArrayList<>());
                            String str = br.readLine();
                            str = br.readLine();
                            while (str != null) {
                                String[] cells = str.split(",");
                                String name = cells[0];
                                String author = cells[1];
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                LocalDate date = LocalDate.parse(cells[2], formatter);
                                archive.addDocument(new Document(name, author, date));
                                str = br.readLine();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case 10 -> {
                        return;
                    }
                    default -> System.out.println("Wrong input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please, try again");
                scanner.nextLine();
            }
        }
    }

    private static void printDocuments(List<Document> documents) {
        documents.forEach(System.out::println);
    }
}
