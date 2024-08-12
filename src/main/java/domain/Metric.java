package domain;

public class Metric {
    private long id; // id pozycji
    private String name; // nazwa pozycji
    private Product product;
    private int amount;

    public Metric(long id, Product product, int amount) {
        this.id = id;
        this.name = product.name;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
    //TODO gettery
}






