package org.example.lesson1.hw.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Хлеб", 30, 1);
        Product product2 = new Product("Мука", 50, 4);
        Product product3 = new Product("Яйцо", 9, 2);
        Product product4 = new Product("Макароны", 70, 3);
        Product product5 = new Product("Ручка", 30, 4);
        Product product6 = new Product("Тетрадь", 40, 1);
        Product product7 = new Product("Карандаш", 35, 2);
        Product product8 = new Product("Обложка", 20, 7);

        ArrayList<Product> products1 = new ArrayList<>();
        ArrayList<Product> products2 = new ArrayList<>();

        Category category1 = new Category("Продукты", products1);
        Category category2 = new Category("Хозтовары", products2);

        category1.addProduct(product1);
        category1.addProduct(product2);
        category1.addProduct(product3);
        category1.addProduct(product4);

        category2.addProduct(product5);
        category2.addProduct(product6);
        category2.addProduct(product7);
        category2.addProduct(product8);

        System.out.println("Список товаров: ");
        System.out.println(category1.toString());
        System.out.println(category2.toString());

        ArrayList<Product> basketprod1 = new ArrayList<>();
        ArrayList<Product> basketprod2 = new ArrayList<>();

        Basket basket1 = new Basket(basketprod1);
        Basket basket2 = new Basket(basketprod2);

        basket1.addProduct(product1);
        category1.removeProduct(product1);
        basket1.addProduct(product4);
        category1.removeProduct(product4);
        basket2.addProduct(product2);
        category1.removeProduct(product1);
        basket2.addProduct(product8);
        category2.removeProduct(product8);

        User user1 = new User(basket1.getProducts(), "Ivanov", "123");
        User user2 = new User(basket2.getProducts(), "Petrov", "12334");

        System.out.println("Корзины пользователей:");
        System.out.println(user1.toString() + basket1.toString());
        System.out.println(user2.toString() + basket2.toString());
        System.out.println("Остаток товаров:");
        System.out.println(category1.toString());
        System.out.println(category2.toString());

    }

}
