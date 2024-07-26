package domain;

import enums.CountOfBlades;

import java.math.BigDecimal;

public class Razor extends Product {

    private CountOfBlades countOfBlades;
        //todo przetestować czy zadziała bez zmiennych w konstruktorze tylko z pomocą super
    public Razor(long id, String name, BigDecimal price, String description, CountOfBlades countOfBlades) {
        super(id,name,price, description);
        this.countOfBlades = countOfBlades;
    }
    @Override
    public void describe() { // todo the bisik: napisać metode override
    }
}
