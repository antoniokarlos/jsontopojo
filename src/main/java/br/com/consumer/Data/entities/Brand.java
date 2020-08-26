
package br.com.consumer.Data.entities;

import javax.persistence.*;
import java.util.List;

public class Brand {

    private String name;

    private List<Company> companies = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

}
