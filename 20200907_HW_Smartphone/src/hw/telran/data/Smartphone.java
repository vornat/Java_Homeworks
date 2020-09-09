package hw.telran.data;

import org.w3c.dom.ls.LSOutput;

public class Smartphone {

    private String brand;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSize() {
        return screenSize;
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

    @Override
    public String toString() {
        return "Smartphone " + brand +
                ", operatingSystem=" + operatingSystem +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", internalStorage=" + internalStorage;
    }

    public void madeIn(){
        if (brand=="Samsung") {
            System.out.println("Made in South Korea");}
        else if (brand=="Apple") {
            System.out.println("Made in USA");}
        else {
            System.out.println("Made in China");}
    }

}
