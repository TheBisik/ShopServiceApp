package main.java.domain;

import java.util.ArrayList;
import java.util.List;
import static utils.DisplayUtil.displayInLine;

final public class Companies {

    private List<Company> companyList = new ArrayList<>();

    public Companies() {
        displayInLine("INITIALIZED COMPANIES");
    }
    public void addCompany(Company company) {
        companyList.add(company);
    }
    public void removeCompany(Company company) {
        companyList.remove(company);
    }
    public List<Company> getCompanyList() {
        return companyList;
    }


}
