package domain;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Product {

    final long id;

    protected String name;

    protected BigDecimal price;

    protected String description;

    public Product(long id, String name, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void describe();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o; // rzutowanie typu
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return (Objects.hashCode(id) * Objects.hashCode(name) * Objects.hashCode(price) * Objects.hashCode(description));
    }
}
