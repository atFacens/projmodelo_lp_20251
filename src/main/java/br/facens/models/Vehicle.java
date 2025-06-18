package br.facens.models;

public class Vehicle {
    private int cod;
    private String brand;
    private String model;
    private int manufactureYear;

    public Vehicle() {
    }

    public Vehicle(int cod, String brand, String model, int manufactureYear) {
        this.cod = cod;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

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

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Vehicle [cod=" + cod + ", brand=" + brand + ", model=" + model + ", manufactureYear=" + manufactureYear
                + "]";
    }

}
