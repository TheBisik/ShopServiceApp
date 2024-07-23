package main.java.domain;

import main.java.utils.DisplayUtil;


public class ShopItem {
    private int id, price;
    private String name, description;

    public ShopItem(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {return id;}
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getPrice() { return price; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(int price) { this.price = price; }

    public void getInfo() {
        DisplayUtil.displayInLine("ID: " + id + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln");
    }
}
