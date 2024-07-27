package domain;

import enums.ClothsTypeForWashing;


import java.math.BigDecimal;



public class WashingPowder extends Product {

    private ClothsTypeForWashing clothsTypeForWashing;

    public WashingPowder(long id, String name, BigDecimal price, String description, ClothsTypeForWashing clothsTypeForWashing) {
        super(id, name, price, description);
        this.clothsTypeForWashing = clothsTypeForWashing;
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
    public ClothsTypeForWashing getEnum() {
        return clothsTypeForWashing;
    }

    @Override
    public void describe() {
        utils.DisplayUtil.describeThis(this.getId(), this.getEnum(), this.getName(), this.getDescription(), this.getPrice());
    }
}
