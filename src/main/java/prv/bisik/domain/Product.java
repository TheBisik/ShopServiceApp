package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    private String description;

    public Product() {

    }

    public Product(@Nonnull String name, @Nonnull BigDecimal price, @Nonnull String category, @Nonnull String description) {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o; // rzutowanie typu
        return getId() == product.getId() && Objects.equals(getName(), product.getName()) && Objects.equals(getPrice(), product.getPrice()) && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(getCategory(), product.getCategory());
    }

    @Override
    public int hashCode() {
        return (Objects.hashCode(getId()) * Objects.hashCode(getName()) * Objects.hashCode(getPrice()) * Objects.hashCode(getDescription()));
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
