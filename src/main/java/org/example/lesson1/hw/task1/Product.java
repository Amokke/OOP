package org.example.lesson1.hw.task1;

public class Product {
    private String name;
    private int price;
    private  int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + price + ", " + rating + "}";
    }
}
