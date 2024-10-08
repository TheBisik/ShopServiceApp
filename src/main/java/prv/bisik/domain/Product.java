package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;
import java.util.Objects;

@MappedSuperclass
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Nonnull
    protected String name;

    @Nonnull
    protected BigDecimal price;

    protected String description;

    public Product() {
    }

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
