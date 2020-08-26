
package br.com.consumer.Data.entities;

import javax.persistence.*;
import java.util.List;

public class Company {

    private String name;
    private String cnpjNumber;
    private List<PersonalLoan> personalLoans = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpjNumber() {
        return cnpjNumber;
    }

    public void setCnpjNumber(String cnpjNumber) {
        this.cnpjNumber = cnpjNumber;
    }

    public List<PersonalLoan> getPersonalLoans() {
        return personalLoans;
    }

    public void setPersonalLoans(List<PersonalLoan> personalLoans) {
        this.personalLoans = personalLoans;
    }

}
