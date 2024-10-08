package prv.bisik.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import prv.bisik.enums.ClothsTypeForWashing;
import prv.bisik.interfaces.StringCreator;
import java.math.BigDecimal;

@Entity
public class WashingPowder extends Product implements StringCreator {

    @Enumerated(value = EnumType.STRING)
    private ClothsTypeForWashing clothsTypeForWashing;

    public WashingPowder(long id, String name, BigDecimal price, String description, ClothsTypeForWashing clothsTypeForWashing) {
        super(id, name, price, description);
        this.clothsTypeForWashing = clothsTypeForWashing;
    }

    public WashingPowder() {

    }

    public String getDescription(){
        return description;
    }
    public ClothsTypeForWashing getEnum() {
        return clothsTypeForWashing;
    }

    @Override
    public void describe() {
        prv.bisik.utils.DisplayUtil.displayInLine(createString());

    }

    @Override
    public String createString() {
        return "ID: " + this.id +  "\nType of washing powder: " + this.clothsTypeForWashing + "\nName: " + this.name + "\nPrice: " + this.price + "\nDescription: " + this.description;


    }
}
