package org.example;

public class Car {

    private String brand;

    private String model;

    private String color;

    private String number;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 21 + this.getBrand().length();
        result = result * 21 + this.getModel().length();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return brand == car.brand & model == car.model;
    }
}