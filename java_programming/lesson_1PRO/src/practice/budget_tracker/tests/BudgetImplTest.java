package practice.budget_tracker.tests;

import practice.budget_tracker.dao.Budget;
import practice.budget_tracker.dao.BudgetImpl;
import practice.budget_tracker.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {
    double b = 1000;
    List<Purchase> purchaseList = new ArrayList<>();
    Budget monthBudget = new BudgetImpl(b, purchaseList); // создали объект, в нем величина бюджета и список покупок

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        purchaseList = List.of(
                new Purchase(1, "Lidl", "Mom", 120, LocalDate.of(2023, 12, 01)),
                new Purchase(2, "Aldi", "Dad", 180, LocalDate.of(2023, 12, 03)),
                new Purchase(3, "Kaufland", "Mom", 200, LocalDate.of(2023, 12, 15))
        );

        for (Purchase p : purchaseList) {
            monthBudget.addPurchase(p);
        }
    }

    @org.junit.jupiter.api.Test
    void addMoney() {
        assertEquals(1100, monthBudget.addMoney(100));
        assertEquals(1300, monthBudget.addMoney(200));
    }

    @org.junit.jupiter.api.Test
    void checkBudget() {
        assertTrue(monthBudget.checkBudget());
    }

    @org.junit.jupiter.api.Test
    void addPurchase() {
        Purchase p = new Purchase(4, "Lidl", "Mom", 100, LocalDate.of(2023, 12, 20));
        assertTrue(monthBudget.addPurchase(p));
    }

    @org.junit.jupiter.api.Test
    void calcBudget() {
        assertEquals(500, monthBudget.calcBudget());
    }

    @org.junit.jupiter.api.Test
    void getBudgetByPerson() {
        System.out.println(purchaseList);
        assertEquals(320, monthBudget.getBudgetByPerson("Mom"));
        assertEquals(180, monthBudget.getBudgetByPerson("Dad"));
    }

    @org.junit.jupiter.api.Test
    void getBudgetByStore() {
        assertEquals(200, monthBudget.getBudgetByStore("Kaufland"));
    }

    @org.junit.jupiter.api.Test
    void getBudgetByDate() {
        LocalDate from = LocalDate.of(2023, 12, 01).minusDays(1);
        LocalDate to = LocalDate.of(2023, 12,31).plusDays(1);
        assertEquals(500, monthBudget.getBudgetByDate(from, to));
    }

    @org.junit.jupiter.api.Test
    void checkMoney() {
        assertEquals(500, monthBudget.checkMoney());
    }
}