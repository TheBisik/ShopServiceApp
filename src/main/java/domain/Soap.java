package domain;

import enums.SoapType;

import static utils.DisplayUtil.displayInLine;

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
        displayInLine("ID:\t" + id + "\nName:\t" + name + "\nType of Soap:\t" + soapType + "\nDescription:\t" + description + "\nPrice:\t" + price + "pln");
    }
}
