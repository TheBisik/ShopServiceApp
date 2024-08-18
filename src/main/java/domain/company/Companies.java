package domain.company;
import java.util.HashMap;
import java.util.Map;

import static utils.DisplayUtil.displayInLine;


final public class Companies {

    final private Map<String, Company> companyAddressDataBase = new HashMap<>();

    public Companies() {
        displayInLine("companyAddressDataBase Initialize");
    }

    public Map<String, Company> getCompanyAddressDataBase() {
        return companyAddressDataBase;
    }

    public void addCompany(String companyName, Company company) {
        companyAddressDataBase.put(companyName, company);
    }
    public Company getCompany(String companyName) {
        return companyAddressDataBase.get(companyName);
    }

    public void removeCompany(String companyName) {
        companyAddressDataBase.remove(companyName);
    }

}
