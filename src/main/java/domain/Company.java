package domain;

import java.util.List;

import static utils.DisplayUtil.displayInLine;

public class Company {
    final private long id;
    private String companyName;
    private Address address;
    private List<CompanyStorage> companyStorageList;

    public Company(long id, String companyName, Address address, List<CompanyStorage> companyStorageList) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.companyStorageList = companyStorageList;
    }
    // Przykład Firmy bez magazynu
    /*public Company(long id, String companyName, Address address) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
    }*/

    public void getStorageAmount() {
        displayInLine("Ilość Przedmiotów w katalogu:\t" + this.companyStorageList.size() + " pozycji.");
    }

}
