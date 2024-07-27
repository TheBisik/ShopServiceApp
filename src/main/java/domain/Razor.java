package domain;

import enums.CountOfBlades;
import utils.DisplayUtil;

import java.math.BigDecimal;

public class Razor extends Product {

    private CountOfBlades countOfBlades;

    public Razor(long id, String name, BigDecimal price, String description, CountOfBlades countOfBlades) {
        super(id, name, price, description);
        this.countOfBlades = countOfBlades;
    }

    public Long getId() {
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

    public CountOfBlades getEnum() {
        return countOfBlades;
    }

    @Override
    public void describe() {
        utils.DisplayUtil.describeThis(this.getId(), this.getEnum(), this.getName(), this.getDescription(), this.getPrice());
    }
}
