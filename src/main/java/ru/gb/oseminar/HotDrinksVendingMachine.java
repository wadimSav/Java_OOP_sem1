package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    private List<HotDrink> productList;

    public void setProductList(List<HotDrink> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : productList) {
            if (hotDrink.getName().equals(name)
                && hotDrink.getVolume() == volume
                && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for (Product product : productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public void addHotDrink(HotDrink hotDrink) {
        this.productList.add(hotDrink);
    }
}
