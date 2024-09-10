package domain;

import interfaces.StringCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.DisplayUtil.displayInLine;

final public class Companies implements StringCreator {

    private List<Company> companyList;

    public Companies() {
        this.companyList = new ArrayList<>();
    }

    public Companies(List<Company> companyList) {
        this.companyList = companyList;
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

    public void displayCompanyList() {
        displayInLine("Company List");
        displayInLine(createString());
    }

    @Override
    public String createString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Company company : companyList) {
            var companyName = company.getCompanyName();
            var companyId = company.getId();
            var text = "Nr. " + companyId + ":\t" + companyName + "\n";
            stringBuilder.append(text);
        }
        return stringBuilder.toString();
    }

    public Map<String, Company> getCompanyAddressDataBase() {
        Map<String, Company> map = new HashMap<>();
        for (Company company : companyList) {
            var companyName = company.getCompanyName();
            map.put(companyName, company);
        }

        return map;
    }
}
