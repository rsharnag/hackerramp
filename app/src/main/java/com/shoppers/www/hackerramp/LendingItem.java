package com.shoppers.www.hackerramp;

/**
 * Created by rahul on 4/25/2015.
 */
public class LendingItem {
    String productName="Shoe";
    String lendPrice = "231";
    public LendingItem(String productName,String lendPrice) {
        this.productName = productName;
        this.lendPrice = lendPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLendPrice() {
        return lendPrice;
    }

    public void setLendPrice(String lendPrice) {
        this.lendPrice = lendPrice;
    }
}
