
package br.com.consumer.Data.entities;

import javax.persistence.*;
import java.util.List;

public class InterestRate {

    private String rate;
    private String referencialRate;
    private String indexer;
    private String prePostTax;
    private String occurrence;
    private String incomeRateInfo;
    private List<Application> application = null;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getReferencialRate() {
        return referencialRate;
    }

    public void setReferencialRate(String referencialRate) {
        this.referencialRate = referencialRate;
    }

    public String getIndexer() {
        return indexer;
    }

    public void setIndexer(String indexer) {
        this.indexer = indexer;
    }

    public String getPrePostTax() {
        return prePostTax;
    }

    public void setPrePostTax(String prePostTax) {
        this.prePostTax = prePostTax;
    }

    public String getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(String occurrence) {
        this.occurrence = occurrence;
    }

    public String getIncomeRateInfo() {
        return incomeRateInfo;
    }

    public void setIncomeRateInfo(String incomeRateInfo) {
        this.incomeRateInfo = incomeRateInfo;
    }

    public List<Application> getApplication() {
        return application;
    }

    public void setApplication(List<Application> application) {
        this.application = application;
    }

}
