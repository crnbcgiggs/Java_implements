package DesignPattern;

public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton() {

    }
    public HungerSingleton getInstance() {
        return instance;
    }
}
