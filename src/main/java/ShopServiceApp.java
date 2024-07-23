import domain.Product;
import domain.Soap;
import domain.WashingPowder;
import enums.ClothsTypeForWashing;
import enums.SoapType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopServiceApp {
    public static void main(String[] args) {
        System.out.println("ShopServiceApp. Hello world!");
        Soap soap = new Soap(1L, "Super Soap", new BigDecimal(24.90), "Mydło do higeny intymnej", SoapType.LIQUID);
        WashingPowder washingPowder = new WashingPowder(2L, "Wizir", BigDecimal.valueOf(16.20), "Podstawowy proszek do prania", ClothsTypeForWashing.COLOR);
        //TODO proszę utworzyć po jeszcze jednym produkcie typu mydło i typu proszek do prania
        List<Product> products = new ArrayList<>();

        //TODO proszę dodać te produkty powyżej do listy

        for (Product product : products) {
            //TODO proszę zaimplementować wyświetlanie info o produkcie można skorzystać z metody describe
        }

    }
}