package org.example;

public class HotBeveragesVendingMachine {
    public HotBeverages hotBeverages;
    private View view;

    public HotBeverages getHotBeverages() {
        return hotBeverages;
    }

    public void setHotBeverages(HotBeverages hotBeverages) {
        this.hotBeverages = hotBeverages;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public HotBeveragesVendingMachine(HotBeverages hotBeverages, View view) {
        this.hotBeverages = hotBeverages;
        this.view = view;
    }

    @Override
    public String toString() {
        return "HotBeveragesVendingMachine{" +
                "hotBeverages=" + hotBeverages +
                ", view=" + view +
                '}';
    }

    public void updateView() {
        view.printBeveragesMenu(HotBeverages.getName(), HotBeverages.getVolume(),
                HotBeverages.getTemperature(), HotBeverages.getPrice());

    }
}
