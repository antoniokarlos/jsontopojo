
package br.com.consumer.Data.entities;

import javax.persistence.*;
import java.util.List;

public class Fee {

    private String serviceName;
    private String serviceCode;
    private String chargingTriggerInfo;
    private List<Price> price = null;
    private String additionalInfo;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getChargingTriggerInfo() {
        return chargingTriggerInfo;
    }

    public void setChargingTriggerInfo(String chargingTriggerInfo) {
        this.chargingTriggerInfo = chargingTriggerInfo;
    }

    public List<Price> getPrice() {
        return price;
    }

    public void setPrice(List<Price> price) {
        this.price = price;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}
