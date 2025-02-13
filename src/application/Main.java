package application;

import entities.*;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1);

        Product tv = new TV("LG", 2000, 40);
        Product fridge = new Refrigerator("Brastemp", 2500, 400);
        Product stove = new Stove("Electrolux", 1700, 6);

        cart.addProduct(tv);
        cart.addProduct(fridge);
        cart.addProduct(stove);

        System.out.println(cart.getContents());
        System.out.println("Total Price: R$" + cart.getTotalPrice());

        cart.removeProduct(tv);
        System.out.println("After removing TV:");
        System.out.println(cart.getContents());
        System.out.println("Total Price: R$" + cart.getTotalPrice());
    }
}

