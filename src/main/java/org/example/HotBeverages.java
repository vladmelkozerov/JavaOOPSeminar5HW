package org.example;

 public class HotBeverages {
    static String name;
    static Integer volume;
    static Integer temperature;
    static Integer price;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public static Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public static Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotBeverages{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                ", price=" + price +
                '}';
    }

    public HotBeverages(String name, Integer volume, Integer temperature, Integer price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }
}








