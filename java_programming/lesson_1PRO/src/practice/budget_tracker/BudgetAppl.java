package practice.budget_tracker;

import practice.budget_tracker.dao.Budget;
import practice.budget_tracker.dao.BudgetImpl;
import practice.budget_tracker.model.Menu;
import practice.budget_tracker.model.Purchase;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BudgetAppl {
    private static final String FILE_NAME = "java_programming/lesson_1PRO/src/practice/budget_tracker/budget.csv";

    public static void main(String[] args) {
        double budget = 0;
        List<Purchase> purchaseList = new ArrayList<>();
        Budget monthBudget = new BudgetImpl(budget, purchaseList); // создаем объект для работы

        Scanner scanner = new Scanner(System.in);

        // организуем бесконечный цикл для работы с меню
        while (true) {
            Menu.printMenu(); // появилось меню и приглашение для пользователя
            try {
                int choice = scanner.nextInt(); // получаем число с клавиатуры

                switch (choice) {
                    case 1 -> {
                        System.out.println("Input amount of money");
                        double money = scanner.nextDouble();
                        budget = monthBudget.addMoney(money);
                        System.out.println("Month budget is: " + budget);
                    }
                    case 2 -> {
                        // спрашиваем у пользователя все (id, store, personName, amount, date) про покупку
                        System.out.println("Input ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Input store: ");
                        String store = scanner.nextLine();
                        System.out.println("Input name: ");
                        String person = scanner.nextLine();
                        System.out.println("Input amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Input date(yyyy-MM-dd): ");
                        String dateStr = scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate date = LocalDate.parse(dateStr, formatter);
                        // создадим новую покупку и добавим ее в список покупок
                        purchaseList.add(new Purchase(id, store, person, amount, date));
                    }
                    case 3 -> {
                        System.out.println("Checking...");
                        // распечатать покупки
                        purchaseList.forEach(System.out::println); // печатаем на основе ToString
                        // сколько осталось
                        double spends = monthBudget.calcBudget();
                        System.out.println("Current amount of spends is: " + spends);
                        boolean check = monthBudget.checkBudget();
                        System.out.println("Is budget positive? " + check);
                        double checkMoney = monthBudget.checkMoney();
                        System.out.println("Rest of the budget is " + checkMoney);
                    }
                    case 4 -> {
                        System.out.println("Budget by store");
                        scanner.nextLine();
                        System.out.println("Input store: ");
                        String store = scanner.nextLine();
                        System.out.println("In store " + store + " spent " + monthBudget.getBudgetByStore(store));
                    }
                    case 5 -> {
                        System.out.println("Budget by person");
                        scanner.nextLine();
                        System.out.println("Input name of person: ");
                        String person = scanner.nextLine();
                        System.out.println("Person " + person + " spent " + monthBudget.getBudgetByPerson(person));
                    }
                    case 6 -> {
                        System.out.println("Budget for a period");
                        scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        System.out.println("Input date(yyyy-MM-dd) from: ");
                        String dateFromStr = scanner.nextLine();
                        LocalDate dateFrom = LocalDate.parse(dateFromStr, formatter);
                        System.out.println("Input date(yyyy-MM-dd) to: ");
                        String dateToStr = scanner.nextLine();
                        LocalDate dateTo = LocalDate.parse(dateToStr, formatter);
                        System.out.println("Spent for a period: " + monthBudget.getBudgetByDate(dateFrom, dateTo));
                    }
                    case 7 -> {
                        System.out.println("Saving budget...");
                        try {
                            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME));
                            pw.println("id,store,person,amount,date");
                            for (Purchase p : purchaseList) {
                                pw.println(p);
                            }
                            pw.println(budget); // сохранили бюджет
                            pw.flush();
                            pw.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case 8 -> {
                        System.out.println("Loading...");
                        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
                            purchaseList = new ArrayList<>();
                            String str = br.readLine();
                            str = br.readLine();
                            while (str != null) {
                                String[] cells = str.split(",");
                                if (cells.length == 1) {
                                    budget = Double.parseDouble(cells[0]);
                                    break;
                                }
                                int id = Integer.parseInt(cells[0]);
                                String store = cells[1];
                                String person = cells[2];
                                double amount = Double.parseDouble(cells[3]);
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                LocalDate date = LocalDate.parse(cells[4], formatter);
                                printCells(cells);
                                Purchase purchase = new Purchase(id, store, person, amount, date);
                                purchaseList.add(purchase);
                                monthBudget.addPurchase(purchase);
                                str = br.readLine();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case 9 -> {
                        return;
                    }
                    default -> System.out.println("Wrong input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please, try again");
                scanner.nextLine();
            }
        } // end of while
    } // end of main

    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t"); // \t - это табуляция
        }
        System.out.println();
    }
} // end of class
