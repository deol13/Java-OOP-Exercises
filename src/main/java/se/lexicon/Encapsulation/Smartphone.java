package se.lexicon.Encapsulation;

// Exercise 9
public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

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

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorage(int capacityIncrease){
        if(capacityIncrease <= 0) throw new IllegalArgumentException("capacityIncrease variable is not allowed to be 0 or lower.");
        storageCapacity += capacityIncrease;

        //if(capacityIncrease > 0)
        //  storageCapacity += capacityIncrease;
    }
}
