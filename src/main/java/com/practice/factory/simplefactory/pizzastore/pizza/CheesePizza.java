package com.practice.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("給製作 " + getName() + " 準備原材料;");
    }
}