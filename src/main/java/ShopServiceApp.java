import domain.*;

import domain.Product;
import domain.Razor;
import domain.Soap;
import domain.WashingPowder;
import enums.ClothsTypeForWashing;
import enums.CountOfBlades;
import enums.SoapType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static utils.DisplayUtil.*;

public class ShopServiceApp {
    public static void main(String[] args) {
        System.out.println("ShopServiceApp. Hello world!"); // Zamiast new BigDecimal(24.90) - BigDecimal.valueOf(24.90) | Stara wrsja powodowała błąd
        Soap soap = new Soap(1L, "Super Soap", BigDecimal.valueOf(24.90), "Mydło do higeny intymnej", SoapType.LIQUID);
        WashingPowder washingPowder = new WashingPowder(2L, "Wizir", BigDecimal.valueOf(16.20), "Podstawowy proszek do prania", ClothsTypeForWashing.COLOR);

        //TODO proszę utworzyć po jeszcze jednym produkcie typu mydło i typu proszek do prania

        WashingPowder washingPowderAriel = new WashingPowder(3L,"Ariel", BigDecimal.valueOf(22.30),"Proszek Ariel, Do białych ubrań", ClothsTypeForWashing.WHITE);
        Soap soapJelen = new Soap(4L, "Bialy Jelen", BigDecimal.valueOf(23.40),"Bardzo podstawowe mydlo",SoapType.LIQUID);
        Razor razor = new Razor(5L,"Gillet", BigDecimal.valueOf(12.30), "Maszynka do golenia", CountOfBlades.FOUR);
        List<Product> products = new ArrayList<>();

        //TODO proszę dodać te produkty powyżej do listy

        // Pytanie: Czemu InteliJ ni krzyczy, że coś jest nie tak w kodzie jesli jest dobrze?
        products.add(soap);
        products.add(washingPowder);
        products.add(washingPowderAriel);
        products.add(soapJelen);
        products.add(razor);

        for (Product product : products) {
            space();
            product.describe();
        }

        space();
        //sekcja magazynu
        List<Item> catalog = new ArrayList<>();


        Item item1 = new Item(1L, "Mydło", soap, 20);
        Item item2 = new Item(2L, "Mydło Biały Jeleń", soapJelen, 13);
        Item item3 = new Item(3L, "Wizir", washingPowder, 5);
        Item item4 = new Item(4L, "Ariel", washingPowderAriel, 4);
        Item item5 = new Item(5L, "Gillete", razor, 8);

        Magazine magazine1 = new Magazine(1L, "BigLogistic", "ul. Bydgoska 2, 86-300 Grudziadz", catalog);
        catalog.add(item1);
        catalog.add(item2);
        catalog.add(item3);
        catalog.add(item4);
        catalog.add(item5);


        magazine1.sizeCatalog();
        space();
        magazine1.sizeOfItemInCatalog(item1);


    }
}