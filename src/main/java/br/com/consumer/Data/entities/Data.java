
package br.com.consumer.Data.entities;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {

    private List<Brand> brand;

    public List<Brand> getBrand() {
        return brand;
    }

    public void setBrand(List<Brand> brand) {
        this.brand = brand;
    }

}
