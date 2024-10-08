package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import prv.bisik.enums.CountOfBlades;
import prv.bisik.interfaces.StringCreator;

import java.math.BigDecimal;

import static prv.bisik.utils.DisplayUtil.displayInLine;

@Entity
public class Razor extends Product implements StringCreator {

    @Nonnull
    private CountOfBlades countOfBlades;

    public Razor(long id, String name, BigDecimal price, String description, CountOfBlades countOfBlades) {
        super(id, name, price, description);
        this.countOfBlades = countOfBlades;
    }

    public Razor() {
        super();
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
    public void describe() {
        displayInLine(createString());
    }

    @Override
    public String createString() {
        return "ID: " + id + "\nCloths type for washing: " + countOfBlades.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln";
    }
}
