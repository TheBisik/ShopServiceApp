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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Metric> catalog = new ArrayList<>();


        Metric metric1 = new Metric(1L, "Mydło", soap, 20);
        Metric metric2 = new Metric(2L, "Mydło Biały Jeleń", soapJelen, 13);
        Metric metric3 = new Metric(3L, "Wizir", washingPowder, 5);
        Metric metric4 = new Metric(4L, "Ariel", washingPowderAriel, 4);
        Metric metric5 = new Metric(5L, "Gillete", razor, 8);

        Storage storage1 = new Storage(1L, "BigLogistic", "ul. Bydgoska 2, 86-300 Grudziadz", catalog);
        catalog.add(metric1);
        catalog.add(metric2);
        catalog.add(metric3);
        catalog.add(metric4);
        catalog.add(metric5);


        storage1.sizeCatalog();
        space();
        storage1.sizeOfItemInCatalog(metric1);
        Map<String, Storage> test = new HashMap<>();
        test.put("Storage1", storage1);
        test.put(null, storage1);
        var s = test.get("Storage1");

        Map<String,Address> addressDataBase = new HashMap<>();
        addressDataBase.put("FirmaA", new Address());
        addressDataBase.put("FirmaB", new Address());
        addressDataBase.put("FirmaC", new Address());
        addressDataBase.put("FirmaD", new Address());
        addressDataBase.put("FirmaF", new Address());

        class Company {
            //klasa reprezentująca firmę
            //CompanyAddress
            //StorageAddress
        }

        class Companies {
            //klasa reprezentująca zbiór firm
            //getAddressDataBase ->  Map<String,Address> addressDataBas
        }

    }
}