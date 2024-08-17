/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rutendo christian chapfika
 */
public class ReportData {
        Scanner in = new Scanner(System.in);

    int counter = 0;

    public void ReportProduct(Assignment[] Products) {
        System.out.println("===============================================");
        System.out.println("PRODUCT REPORT");
        System.out.println("===============================================");
        int prodNum = 1;

        for (int i = 0; i < Products.length; i++) {
            System.out.println("Product: " + prodNum++
                    + "\n_______________________________________________"
                    + "\nPRODUCT CODE: " + Products[i].getProductCode()
                    + "\nPRODUCT NAME: " + Products[i].getProductName()
                    + "\nPRODUCT WARRANTY: " + Products[i].getProdWarrnty()
                    + "\nPRODUCT CATEGORY: " + Products[i].getProdCat()
                    + "\nPRODUCT PRICE: " + Products[i].getProductPrice()
                    + "\nPRODUCT STOCK LEVELS: " + Products[i].getProdStock()
                    + "\nPRODUCT SUPPLIER: " + Products[i].getProductSupplier()
                    + "\n_______________________________________________");

        }
        System.out.println("===============================================");
        System.out.println("TOTAL PRODUCT VALUE: R" + ProductPrice(Products));
        System.out.println("AVERAGE PRODUCT VALUE: R" + AverageProductValue(Products));
        System.out.println("===============================================");
 
        System.out.println("Enter (1) to launch menu or any other key to exit.");
        counter = in.nextInt();
        if (counter == 1) {
        } else {
            System.exit(0);
        
    }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int ProductPrice(Assignment[] Products) {
        int totalProductPrice = 0;
        for (int i = 0; i < Products.length; i++) {
            totalProductPrice = Products[i].getProductPrice() + totalProductPrice;
        }
        return totalProductPrice;
    }

    public double AverageProductValue(Assignment[] Products) {
        int ProductValue = 0;
        int sum = Products.length;
        double average;
        for (int i = 0; i < Products.length; i++) {
            ProductValue = Products[i].getProductPrice() + ProductValue;
        }
        average = ProductValue / sum;
        return average;
    }

}
