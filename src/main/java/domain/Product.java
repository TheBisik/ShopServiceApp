package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    final long id;

    protected String name; //TODO proszę poczytać o modyfikatorze dostępu protected // x

    protected BigDecimal price; // TODO: Proszę poczytać o tym typie, ma on zastosowanie w rozliczeniach walutowych

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
}
