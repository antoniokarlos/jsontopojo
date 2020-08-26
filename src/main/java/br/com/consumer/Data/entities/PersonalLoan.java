
package br.com.consumer.Data.entities;

import javax.persistence.*;
import java.util.List;

public class PersonalLoan {

    private String types;
    private List<Fee> fees = null;
    private List<InterestRate> interestRates = null;
    private List<String> requiredWarranties = null;
    private String termsConditions;

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public List<InterestRate> getInterestRates() {
        return interestRates;
    }

    public void setInterestRates(List<InterestRate> interestRates) {
        this.interestRates = interestRates;
    }

    public List<String> getRequiredWarranties() {
        return requiredWarranties;
    }

    public void setRequiredWarranties(List<String> requiredWarranties) {
        this.requiredWarranties = requiredWarranties;
    }

    public String getTermsConditions() {
        return termsConditions;
    }

    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions;
    }

}
