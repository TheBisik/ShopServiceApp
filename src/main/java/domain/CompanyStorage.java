package domain;

import java.util.List;

import static utils.DisplayUtil.displayInLine;
import static utils.DisplayUtil.space;

public class CompanyStorage {
    final private long id;
    private String storageName;
    private List<Metric> catalog;
    final private Address storageAddress;


    public CompanyStorage(long id, String storageName, Address storageAddress, List<Metric> catalog) {
        this.id = id;
        this.storageName = storageName;
        this.storageAddress = storageAddress;
        this.catalog = catalog;
    }

    public void addMetric(Metric metric) {
        catalog.add(metric);
    }

    public void removeMetric(Metric metric) {
        catalog.remove(metric);
    }

    public void sizeCatalog() {
        space();
        displayInLine("Ilość Przedmiotów w katalogu:\t" + catalog.size() + " pozycji.");
    }

    public void  sizeOfItemInCatalog(Metric metric) {
        var name = metric.getName();
        var count = metric.getAmount();
        displayInLine("Nazwa Produktu:\t" + name + "\nIlość Przemiotów: \t" + count + " sztuk");
    }


}


