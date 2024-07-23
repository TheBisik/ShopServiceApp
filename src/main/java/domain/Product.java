package domain;

import java.math.BigDecimal;

public abstract class Product {

    long id;

    protected String name; //TODO proszę poczytać o modyfikatorze dostępu protected

    protected BigDecimal price; // TODO: Proszę poczytać o tym typie, ma on zastosowanie w rozliczeniach walutowych

    protected String description;

    public Product(long id, String name, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public abstract void describe();
}
