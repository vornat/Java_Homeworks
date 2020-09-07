package hw.telran.data;

import org.w3c.dom.ls.LSOutput;

public class Smartphone {

    private String brand;
    private double price;
    private String operatingSystem;
    private double screenSize;
    private int ram;
    private int internalStorage;

    public Smartphone(){};

    public Smartphone(String brand, String operatingSystem, double screenSize, int ram, int internalStorage) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.ram = ram;
        this.internalStorage = internalStorage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(int internalStorage) {
        this.internalStorage = internalStorage;
    }

    public double getPrice(){
        price =0;
        if (brand=="Samsung") {
            price = 500;
        } else if (brand=="Apple") {
            price = 1000;
        }
        System.out.println(price);
        return price;
    }

    @Override
    public String toString() {
        return "Smartphone " + brand +
                ", operatingSystem=" + operatingSystem +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", internalStorage=" + internalStorage;
    }
}
