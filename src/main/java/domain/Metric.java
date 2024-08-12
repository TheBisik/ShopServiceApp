package domain;

import java.math.BigDecimal;

public class Metric {
    private long id; // id pozycji
    private String name; // nazwa pozycji
    private Product product;
    private int amount;

    public Metric(long id, String name, Product product, int amount) {
        this.id = id;
        this.name = product.name;
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }



}






