package se.lexicon.Encapsulation;

// Exercise 14
public class Product {
    private String productName;
    private String productCode;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage/100);
            //100 -= 100 * (20/100)
            //100 -= 100 * 0.2
            //100 -= 20
            //80
        }
//        if(discount > 0 && discount < 1 ) {
//            price *= discount;
//        }
//        else {
//            discount /= 100;
//            price *= discount;
//        }
    }
}
