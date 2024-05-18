package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine vMachine = new HotDrinksVendingMachine();
        List<HotDrink> productList = new ArrayList<>();

        HotDrink product = new HotDrink("capuchino", 150, 100, 60);

        productList.add(product);

        vMachine.setProductList(productList);
        vMachine.addHotDrink(new HotDrink("coffee", 150, 100, 60));
        vMachine.addHotDrink(new HotDrink("tea", 100, 150, 65));
        vMachine.addHotDrink(new HotDrink("green tea", 110, 180, 55));

        System.out.println(vMachine.getProduct("capuchino", 100, 60));
    }
}