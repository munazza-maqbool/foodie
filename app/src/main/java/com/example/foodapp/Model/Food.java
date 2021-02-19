package com.example.foodapp.Model;

public class Food {
    private String name, image, description, price, discount, menuId;

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount, String menuId) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getMenuId() {
        return menuId;
    }
}