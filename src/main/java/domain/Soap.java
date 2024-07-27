package domain;

import enums.SoapType;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;


import java.math.BigDecimal;

public class Soap extends Product {

    private SoapType soapType;

    public Soap(long id, String name, BigDecimal price, String description, SoapType soapType) {
        super(id, name, price, description);
        this.soapType = soapType;
    }

    public Long getId() {
        return id;
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
        utils.DisplayUtil.describeThis(this.getId(), this.getEnum(), this.getName(), this.getDescription(), this.getPrice());
    }
}
