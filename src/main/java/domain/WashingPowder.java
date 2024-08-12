package domain;

import enums.ClothsTypeForWashing;
import interfaces.StringCreator;


import java.math.BigDecimal;



public class WashingPowder extends Product implements StringCreator {

    private ClothsTypeForWashing clothsTypeForWashing;

    public WashingPowder(long id, String name, BigDecimal price, String description, ClothsTypeForWashing clothsTypeForWashing) {
        super(id, name, price, description);
        this.clothsTypeForWashing = clothsTypeForWashing;
    }

    public String getDescription(){
        return description;
    }
    public ClothsTypeForWashing getEnum() {//TODO do poprawy nazwa
        return clothsTypeForWashing;
    }

    @Override
    public void describe() {
        utils.DisplayUtil.displayInLine(createString());

    }

    @Override
    public String createString() {
        return "ID: " + this.id +  ", Type of washing powder: " + this.clothsTypeForWashing + ", Name: " + this.name + ", Price: " + this.price + ", Description: " + this.description;


    }
}
