package domain;

import enums.ClothsTypeForWashing;
import utils.DisplayUtil;

import java.math.BigDecimal;

public class WashingPowder extends Product {

    private ClothsTypeForWashing clothsTypeForWashing;

    public WashingPowder(long id, String name, BigDecimal price, String description, ClothsTypeForWashing clothsTypeForWashing) {
        super(id, name, price, description);
        this.clothsTypeForWashing = clothsTypeForWashing;
    }

    @Override
    public void describe() {
        DisplayUtil.displayInLine("ID: " + id + "\nCloths type for washing: " + clothsTypeForWashing + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln");
    }
}
