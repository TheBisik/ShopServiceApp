package main.java.domain;

import domain.Address;

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

    public long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CompanyStorage> getCompanyStorageList() {
        return companyStorageList;
    }

    public void setCompanyStorageList(List<CompanyStorage> companyStorageList) {
        this.companyStorageList = companyStorageList;
    }

    public void sizeOfItemInCatalog() {
        displayInLine("Ilość Przedmiotów w katalogu:\t" + this.companyStorageList.size() + " pozycji.");
    }

}
