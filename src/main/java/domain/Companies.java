package main.java.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static utils.DisplayUtil.displayInLine;

final public class Companies {

    private List<Company> companyList;
    private HashMap<Company, domain.Address> addressMap;

    public Companies() {
        this.companyList = new ArrayList<>();
        this.addressMap = new HashMap<>();
    }

    public Companies(List<Company> companyList) {
        this.companyList = companyList;
        this.addressMap = new HashMap<>();
    }

    public void addCompany(Company company) {
        companyList.add(company);
        addressMap.put(company, company.getAddress());
    }
    public void removeCompany(Company company) {
        companyList.remove(company);
        addressMap.remove(company.getAddress());
    }
    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public void displayCompanyList() {
        displayInLine("Company List");
        for (Company company : companyList) {
            displayInLine(("Nr. " + companyList.size() + ":\t") + company.getCompanyName());
        }
    }


    public void findCompanyByAddress(String address) {
        for (Company company : companyList) {
            if (company.getAddress().equals(address)) {
                displayInLine(company.getCompanyName());
            }
        }
    }

    public void findCompanyByCompanyName(String companyName) {
        for (Company company : companyList) {
            if (company.getCompanyName().equals(companyName)) {
                displayInLine(company.getCompanyName());
            }
            else {
                displayInLine("Nie znaleziono");
            }
        }
    }

    public void findCompanyAddressByCompanyName(Company company) {
        addressMap.get(company).getAddress();
    }

}
