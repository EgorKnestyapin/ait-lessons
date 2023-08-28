package ait.cars.dao;

import ait.cars.model.Car;

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
            if (cars[i].getRegNumber().toLowerCase().equals(regNumber.toLowerCase())) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getModel().toLowerCase().equals(model.toLowerCase())) {
                counter++;
                System.out.println(counter);
            }
        }
        Car[] modelCars = new Car[counter];
        for (int i = 0, j = 0; j < modelCars.length; i++) {
            if (cars[i].getModel().toLowerCase().equals(model.toLowerCase())) {
                System.out.println(cars[i]);
                modelCars[j] = cars[i];
                j++;
            }
        }
        return modelCars;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getCompany().toLowerCase().equals(company.toLowerCase())) {
                counter++;
            }
        }
        Car[] companyCars = new Car[counter];
        for (int i = 0, j = 0; j < companyCars.length; i++) {
            if (cars[i].getCompany().toLowerCase().equals(company.toLowerCase())) {
                companyCars[j] = cars[i];
                j++;
            }
        }
        return companyCars;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() >= min && cars[i].getEngine() < max) {
                counter++;
            }
        }
        Car[] engineCars = new Car[counter];
        for (int i = 0, j = 0; j < engineCars.length; i++) {
            if (cars[i].getEngine() >= min && cars[i].getEngine() < max) {
                engineCars[j] = cars[i];
                j++;
            }
        }
        return engineCars;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor().toLowerCase().equals(color.toLowerCase())) {
                counter++;
            }
        }
        Car[] colorCars = new Car[counter];
        for (int i = 0, j = 0; j < colorCars.length; i++) {
            if (cars[i].getColor().toLowerCase().equals(color.toLowerCase())) {
                colorCars[j] = cars[i];
                j++;
            }
        }
        return colorCars;
    }
}
