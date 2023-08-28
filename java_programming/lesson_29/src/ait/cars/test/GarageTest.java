package ait.cars.test;

import ait.cars.dao.Garage;
import ait.cars.dao.GarageImpl;
import ait.cars.model.Car;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage garage;
    Car[] cars;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        garage = new GarageImpl(6);
        cars = new Car[5];
        cars[0] = new Car("AX246HG", "Q6", "Audi", 265, "Black");
        cars[1] = new Car("KR643FV", "X5", "BMW", 400, "White");
        cars[2] = new Car("BN321FG", "X1", "BMW", 150, "Blue");
        cars[3] = new Car("JK214GN", "F350", "Ford", 400, "Black");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                garage.addCar(cars[i]);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[2]));
        Car car = new Car("KF257CV", "X1", "BMW", 150, "Blue");
        assertTrue(garage.addCar(car));
        car = new Car("JK214GN", "F350", "Ford", 400, "Black");
        assertFalse(garage.addCar(car));
        car = new Car("LR921GN", "X5", "BMW", 400, "White");
        assertTrue(garage.addCar(car));
        car = new Car("KA216NM", "X5", "BMW", 400, "White");
        assertFalse(garage.addCar(car));
    }

    @org.junit.jupiter.api.Test
    void removeCar() {
        assertEquals(cars[2], garage.removeCar("BN321FG"));
        assertNull(garage.removeCar("BN321FG"));
        assertNull(garage.removeCar("HD647JK")); // нет авто с таким номером
    }

    @org.junit.jupiter.api.Test
    void findCarByRegNumber() {
        assertEquals(cars[2], garage.findCarByRegNumber("BN321FG"));
        assertNull(garage.findCarByRegNumber("HD647JK")); // нет авто с таким номером
        garage.removeCar("BN321FG");
        assertNull(garage.findCarByRegNumber("BN321FG"));
    }

    @org.junit.jupiter.api.Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("x5");
        Car[] expected = {cars[1]};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("bmw");
        Car[] expected = {cars[1], cars[2]};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(150, 300);
        Car[] expected = {cars[0], cars[2]};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("black");
        Car[] expected = {cars[0], cars[3]};
        assertArrayEquals(expected, actual);
    }
}