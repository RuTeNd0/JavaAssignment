/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

/**
 *
 * @author Rutendo Chapfika
 */
public class Assignment {

    private String productName, prodCat, prodWarrnty, ProdStock, productCode, productSupplier;
    private int productPrice, prodnum;

    public Assignment() {

    }

    public Assignment(String productCode, String productName, String prodWarrnty, String prodCat, int productPrice, String ProdStock, String productSupplier, int prodnum) {
        this.productName = productName;
        this.prodCat = prodCat;
        this.prodWarrnty = prodWarrnty;
        this.ProdStock = ProdStock;
        this.productCode = productCode;
        this.productSupplier = productSupplier;
        this.productPrice = productPrice;
        this.prodnum = prodnum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdCat() {
        return prodCat;
    }

    public void setProdCat(String prodCat) {
        this.prodCat = prodCat;
    }

    public String getProdWarrnty() {
        return prodWarrnty;
    }

    public void setProdWarrnty(String prodWarrnty) {
        this.prodWarrnty = prodWarrnty;
    }

    public String getProdStock() {
        return ProdStock;
    }

    public void setProdStock(String ProdStock) {
        this.ProdStock = ProdStock;
    }

    public int getProdnum() {
        return prodnum;
    }

    public void setProdnum(int prodnum) {
        this.prodnum = prodnum;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    @Override
    public String toString() {
        String message;
        message  = "PRODUCT CODE: A56"
                + "\nPRODUCT NAME: EliteBook"
                + "\nPRODUCT WARRANTY: 6 months"
                + "\nPRODUCT CATEGORY: Laptop"
                + "\nPRODUCT PRICE: 2400"
                + "\nPRODUCT STOCK LEVELS: Stock is low"
                + "\nPRODUCT SUPPLIER: IT_4_Africa";
return message;
    }
}
