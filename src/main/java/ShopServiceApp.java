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



        Metric metric1 = new Metric(1L, "Mydło", soap, 20);
        Metric metric2 = new Metric(2L, "Mydło Biały Jeleń", soapJelen, 13);
        Metric metric3 = new Metric(3L, "Wizir", washingPowder, 5);
        Metric metric4 = new Metric(4L, "Ariel", washingPowderAriel, 4);
        Metric metric5 = new Metric(5L, "Gillete", razor, 8);



        List<Metric> catalog = new ArrayList<>();
        CompanyStorage bigLogisticStorage1;
        bigLogisticStorage1 = new CompanyStorage(1L, "Magazyn 1", new Address("ul. Wlodka","2","86-300","Grudziadz", "Kujawsko-Pomorskie","Poland"), catalog);
        catalog.add(metric1);
        catalog.add(metric2);
        catalog.add(metric3);
        catalog.add(metric4);
        catalog.add(metric5);

        List<CompanyStorage> companyBigLogisticsStoragesList = new ArrayList<>();
        companyBigLogisticsStoragesList.add(bigLogisticStorage1);

        Company bigLogistics;
        bigLogistics = new Company(1L,"BigLogistics", new Address("Bydgoska", "25/6c", "86-300", "Grudziadz", "Kujawsko-Pomorskie","Poland"), companyBigLogisticsStoragesList);




        /* Przykład Listy indeksowanej
        Map<String, CompanyStorage> test = new HashMap<>();
        test.put("Storage1", bigLogisticStorage1);
        test.put(null, bigLogisticStorage1);
        var s = test.get("Storage1");
        */

        Map<String,Address> addressDataBase = new HashMap<>();
        addressDataBase.put("FirmaA", new Address("ul. Janka", "22/6", "86-542", "Testowo", "Pomorskie","Poland"));
        addressDataBase.put("FirmaB", new Address("ul. Torunska", "26", "41-323", "Adamowo", "Wielkopolskie","Poland"));
        addressDataBase.put("FirmaC", new Address("Matawy", "23", "86-170", "Nowe", "Pomorskie","Poland"));
        addressDataBase.put("FirmaD", new Address("Tryl", "2", "86-170", "Nowe", "Kujawsko-Pomorskie","Poland"));
        addressDataBase.put("FirmaF", new Address("Tryl", "3", "86-170", "Nowe", "Kujawsko-Pomorskie","Poland"));

        class Company {
            //klasa reprezentująca firmę
            //CompanyAddress
            //StorageAddress
        }

        class Companies {
            //klasa reprezentująca zbiór firm
            //getAddressDataBase ->  Map<String,Address> addressDataBas
        }



        bigLogistics.getStorageAmount();

        bigLogisticStorage1.sizeCatalog();

        space();
        bigLogisticStorage1.sizeOfItemInCatalog(metric1);

    }

}




