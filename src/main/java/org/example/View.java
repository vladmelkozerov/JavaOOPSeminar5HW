package org.example;

public class View {
    public void printBeveragesMenu(String Name, Integer Volume, Integer Temperature, Integer Price){
        System.out.println("Меню алкомата: ");
        System.out.println("Название напитка: " + Name);
        System.out.println("Объем напитка: " + Volume);
        System.out.println("Температура напитка: " + Temperature);
        System.out.println("Цена напитка: " + Price);
    }

}
