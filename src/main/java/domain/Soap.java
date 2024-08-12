package domain;

import enums.SoapType;
import interfaces.StringCreator;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;


import java.io.Serializable;
import java.math.BigDecimal;

public class Soap extends Product implements StringCreator {

    private SoapType soapType;

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
        utils.DisplayUtil.displayInLine(createString());
    }

    @Override
    public String createString() {
        return "ID: " + this.id + ", Type of soap: " + this.soapType + ", Name: " + this.name + ", Price: " + this.price + ", Description: " + this.description;

    }
}
