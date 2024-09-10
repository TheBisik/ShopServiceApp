package domain;

import java.util.List;

import static utils.DisplayUtil.displayInLine;
import static utils.DisplayUtil.space;

public class CompanyStorage {
    final private long id;
    private String storageName;
    private List<Metric> metricList;
    final private Address storageAddress;


    public CompanyStorage(long id, String storageName, Address storageAddress, List<Metric> metricList) {
        this.id = id;
        this.storageName = storageName;
        this.storageAddress = storageAddress;
        this.metricList = metricList;
    }

    public void addMetric(Metric metric) {
        metricList.add(metric);
    }

    public void removeMetric(Metric metric) {
        metricList.remove(metric);
    }

    public void getCompanyStorage() {
        displayInLine("ID: " + id + "\nName: " + storageName + "\nAddress: " + storageAddress);
    }



    public void metricListSize() {
        space();
        displayInLine("Ilość Przedmiotów w katalogu:\t" + metricList.size() + " pozycji.");
    }

    public void metricList() {
        space();
        displayInLine("Ilość Przedmiotów w katalogu:\t" + metricList.size() + " pozycji.");
        for (int i = 0; i < metricList.size(); i++) {
            productAmountInMetric(metricList.get(i));
        }
    }

    public void productAmountInMetric(Metric metricList) {
        var name = metricList.getName();
        var count = metricList.getAmount();
        var id = metricList.getId();
        space();
        displayInLine("ID: "+ id + "\nNazwa Produktu:\t" + name + "\nIlość Przemiotów: \t" + count + " sztuk");
    }


}


