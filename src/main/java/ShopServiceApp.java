import Exceptions.MySpecException;
import domain.*;

import enums.ClothsTypeForWashing;
import enums.CountOfBlades;
import enums.SoapType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static utils.DisplayUtil.*;

public class ShopServiceApp {
    public static void main(String[] args) {
        System.out.println("ShopServiceApp. Hello world!");
        //tworzenie produktów z cenami(jako cecha produktu)
        Soap soap = new Soap(1L, "Super Soap", BigDecimal.valueOf(24.90), "Mydło do higeny intymnej", SoapType.LIQUID);
        WashingPowder washingPowder = new WashingPowder(2L, "Wizir", BigDecimal.valueOf(16.20), "Podstawowy proszek do prania", ClothsTypeForWashing.COLOR);
        WashingPowder washingPowderAriel = new WashingPowder(3L, "Ariel", BigDecimal.valueOf(22.30), "Proszek Ariel, Do białych ubrań", ClothsTypeForWashing.WHITE);
        Soap soapJelen = new Soap(4L, "Bialy Jelen", BigDecimal.valueOf(23.40), "Bardzo podstawowe mydlo", SoapType.LIQUID);
        Razor razor = new Razor(5L, "Gillet", BigDecimal.valueOf(12.30), "Maszynka do golenia", CountOfBlades.FOUR);

        // Tworzenie listy produktów i dodawanie
        List<Product> products = new ArrayList<>();
        products.add(soap);
        products.add(washingPowder);
        products.add(washingPowderAriel);
        products.add(soapJelen);
        products.add(razor);

        //listowanie automatyczne produktów
        for (Product product : products) {
            space();
            product.describe();
        }

        space();
        //tworzenie metryki produktów (nazwa,typ,ilość)
        Metric metric1 = new Metric(1L, "Mydło", soap, 20);
        Metric metric2 = new Metric(2L, "Mydło Biały Jeleń", soapJelen, 13);
        Metric metric3 = new Metric(3L, "Wizir", washingPowder, 5);
        Metric metric4 = new Metric(4L, "Ariel", washingPowderAriel, 4);
        Metric metric5 = new Metric(5L, "Gillete", razor, 8);


        //tworzenie katalogu magazynu
        List<Metric> catalogMagazine1 = new ArrayList<>();

        //dodawnie metryki produktu do magazynu
        catalogMagazine1.add(metric1);
        catalogMagazine1.add(metric2);
        catalogMagazine1.add(metric3);
        catalogMagazine1.add(metric4);
        catalogMagazine1.add(metric5);

        //tworzenie instancji magazynu pod firme
        CompanyStorage bigLogisticStorage1;

        //tworzenie magazynu z instancją
        bigLogisticStorage1 = new CompanyStorage(1L, "Magazyn 1", new Address("ul. Wlodka", "2", "86-300", "Grudziadz", "Kujawsko-Pomorskie", "Poland"), catalogMagazine1);

        //tworzenie listy magazynów dla firmy
        List<CompanyStorage> companyBigLogisticsStoragesList = new ArrayList<>();

        //dodawanie magazynu do listy firmy
        companyBigLogisticsStoragesList.add(bigLogisticStorage1);

        //tworzenie instancji firmy
        Company bigLogistics;
        //dodawnie danych do instancji wraz z listą magazynów
        bigLogistics = new Company(1L, "BigLogistics", new Address("Bydgoska", "25/6c", "86-300", "Grudziadz", "Kujawsko-Pomorskie", "Poland"), companyBigLogisticsStoragesList);

        selector();
        //Sprawdzanie ilości elementów w metryce magazynu bigLogisticStorage1
        bigLogisticStorage1.metricListSize();
        space();
        selector();

        //Sprawdzanie ilości i listowanie elementów w metryce magazynu bigLogisticStorage1
        bigLogisticStorage1.metricList();
        space();
        selector();

        //sprawdzanie ilości dla jednego elementu
        bigLogisticStorage1.productAmountInMetric(metric1);
        space();
        selector();


        //tworzenie bazy danych adresów firm
        Companies companiesList;
        companiesList = new Companies();

        //dodawnie firmy do bazy danych
        companiesList.addCompany(bigLogistics);

        //testowanie listy
        String test = companiesList.getCompanyList().get(0).getCompanyName();
        displayInLine(test);
        space();
        //usuawnie z listy
        //companyAddressDataBase.removeCompany(bigLogistics);
        Map<String, Company> companyAddressDataBase = companiesList.getCompanyAddressDataBase();
        companiesList.displayCompanyList();

        space();
        //hash code dla proszku do prania
        displayInLine(Integer.toString(washingPowder.hashCode()));

        space();
        User firstUser = new Customer(1, "love12", "", "Jan", "Kowalski", "+48123456789", new Date(1998, 8, 12));

        try {
            firstUser.setEmail("jacek@wp.pl");
        } catch (MySpecException e) {
            displayInLine(e.getMessage());
        }
    }
}



