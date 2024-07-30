package domain;


import java.util.ArrayList;
import java.util.List;

import static utils.DisplayUtil.displayInLine;
import static utils.DisplayUtil.space;

public class Magazine {
    private long idMagazine;
    private String nameMagazine;
    private String adressMagazine;
    private List<Item> catalog;



    public Magazine(long idMagazine, String nameMagazine, String adressMagazine, List<Item> catalog) {
        this.idMagazine = idMagazine;
        this.nameMagazine = nameMagazine;
        this.adressMagazine = adressMagazine;
        this.catalog = catalog;
    }

    public void addProduct(Item item) {
        catalog.add(item);
    }

    public void removeProduct(Item item) {
        catalog.remove(item);
    }

    public void sizeCatalog() {
        space();
        displayInLine("Ilość Przedmiotów w katalogu:\t" + catalog.size() + " pozycji.");
    }

    public void sizeOfItemInCatalog(Item item) {
        var name = item.getName();
        var count = item.getCount();
        displayInLine("Nazwa Produktu:\t" + name + "\nIlość Przemiotów: \t" + count + " sztuk");
    }

    /* public void setMagazine(long idMagazine, String nameMagazine, String adressMagazine) {
        var nameofcatalog = "catalog" + Long.toString(idMagazine);
        var nameofmagazin = "magazine" + Long.toString(idMagazine);
        List<Item> nameofcatalog = new ArrayList<>();
        Magazine nameofmagazin = new Magazine(idMagazine, nameMagazine, adressMagazine, nameofcatalog);
    } */
}


