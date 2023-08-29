package ait.cars.dao;

import ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || cars.length == size || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                Car deletedCar = cars[i];
                cars[i] = cars[size - 1];
                cars[size - 1] = null;
                size--;
                return deletedCar;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        Predicate<Car> predicate = car -> car.getModel().toLowerCase().equals(model.toLowerCase());
        return findCarsByPredicate(predicate);
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        Predicate<Car> predicate = car -> car.getCompany().toLowerCase().equals(company.toLowerCase());
        return findCarsByPredicate(predicate);
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        Predicate<Car> predicate = car -> car.getEngine() >= min && car.getEngine() < max;
        return findCarsByPredicate(predicate);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        Predicate<Car> predicate = car -> car.getColor().toLowerCase().equals(color.toLowerCase());
        return findCarsByPredicate(predicate);
    }

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                counter++;
            }
        }
        Car[] colorCars = new Car[counter];
        for (int i = 0, j = 0; j < colorCars.length; i++) {
            if (predicate.test(cars[i])) {
                colorCars[j] = cars[i];
                j++;
            }
        }
        return colorCars;
    }
}
