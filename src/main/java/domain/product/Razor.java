package domain.product;

import enums.CountOfBlades;
import interfaces.StringCreator;

import java.math.BigDecimal;

import static utils.DisplayUtil.displayInLine;

public class Razor extends Product implements StringCreator {

    private CountOfBlades countOfBlades;

    public Razor(long id, String name, BigDecimal price, String description, CountOfBlades countOfBlades) {
        super(id, name, price, description);
        this.countOfBlades = countOfBlades;
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

    public CountOfBlades getCountOfBlades() {
        return countOfBlades;
    }

    @Override
    public void describe() { displayInLine(createString());
    }

    @Override
    public String createString() {
        return "ID: " + id + "\nCloths type for washing: " + countOfBlades.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln";
    }
}
