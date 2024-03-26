package Java.DZ.Laptop;

import java.util.Objects;

public class Laptop {

    private double screenDiagonal;
    private String modelName;
    private String operatingSystem;
    private int ram;
    private int storageCapacity;


    public Laptop(String modelName, double screenDiagonal, String operatingSystem, int ram, int storageCapacity) {
        this.screenDiagonal = screenDiagonal;
        this.modelName = modelName;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getModelName() {
        return modelName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return String.format("Модель = %s, \tДиагональ = %.1f, \tОЗУ = %d, \tОбъем накопителя = %d, \tOC = %s",
                modelName, screenDiagonal, ram, storageCapacity, operatingSystem);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return screenDiagonal == laptop.screenDiagonal &&
                modelName.equals(laptop.modelName) &&
                ram == laptop.ram &&
                storageCapacity == laptop.storageCapacity &&
                operatingSystem.equals(laptop.operatingSystem);

    }

    @Override
    public int hashCode() {
        return Objects.hash(screenDiagonal, modelName, ram, storageCapacity, operatingSystem);
    }

}




