package domain;

import enums.SoapType;

import java.math.BigDecimal;

public class Soap extends Product {

    private SoapType soapType;

    public Soap(long id, String name, BigDecimal price, String description, SoapType soapType) {
        super(id, name, price, description);
        this.soapType = soapType;
    }

    @Override
    public void describe() {
        //TODO prosze napisać własną implementację tej metody
    }
}
