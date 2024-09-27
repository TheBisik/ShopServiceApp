package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import prv.bisik.enums.SoapType;
import prv.bisik.interfaces.StringCreator;

import java.math.BigDecimal;

@Entity
public class Soap extends Product implements StringCreator {

    @Enumerated(value = EnumType.STRING)
    @Nonnull
    private SoapType soapType;

    public Soap() {
        super();
    }

    public Soap(long id, String name, BigDecimal price, String description, SoapType soapType) {
        super(id, name, price, description);
        this.soapType = soapType;
    }

    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public SoapType getEnum() {
        return soapType;
    }

    @Override
    public void describe() {
        prv.bisik.utils.DisplayUtil.displayInLine(createString());
    }

    @Override
    public String createString() {
        return "ID: " + this.id + "\nType of soap: " + this.soapType + "\nName: " + this.name + "\nPrice: " + this.price + "\nDescription: " + this.description;

    }
}
