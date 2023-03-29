package org.example;

public class Main {
    public static void main(String[] args) {
        HotBeverages hotBeverages = initHotBeverages();
        View view = new View();
        HotBeveragesVendingMachine hbvm = new HotBeveragesVendingMachine(hotBeverages,view);
        hbvm.updateView();
    }

    private static HotBeverages initHotBeverages() {
        HotBeverages hb1 = new HotBeverages("Кофий",100,70,120);
        return hb1;
    }
}