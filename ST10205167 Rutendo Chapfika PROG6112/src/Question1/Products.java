/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rutendo chapfika
 */
public class Products {

//GLOBAL DECLARATIONS
    Scanner keyboard = new Scanner(System.in);
    int select = 0;
    final static int PRODUCTCODE = 3;
    //Assignment con = new Assignment();
    //Declaring Array
   //Assignment[] Products = new Assignment[10];
    ArrayList<Assignment> Products = new ArrayList<>();

    ReportData data = new ReportData();

//========================APPLICATIONS MAINTHREAD===============================
    public void mainThread() {
        int option;
        JOptionPane.showMessageDialog(null, "                       WELCOME TO\nBRIGHT  FUTURE  TECHNOLOGIES  APPLICATION");
        System.out.println("Enter (1) to launch menu or any other key to exit.");
        option = keyboard.nextInt();

        if (option == 1) {
            DisplayMenu(Products);
        } else {
            System.exit(0);
        }
    }
//========================APPLICATIONS MAINTHREAD===============================

//------------------------------DisplayMenu-------------------------------------
    public void DisplayMenu(ArrayList<Assignment> Products) {

        int menuSelected;
        do {
            System.out.println("Please select one of the following menu items: \n"
                    + "(1) Capture a new product.\n"
                    + "(2) Search for a product.\n"
                    + "(3) Update a product.\n"
                    + "(4) Delete a product.\n"
                    + "(5) Print report\n"
                    + "(6) Exit Application.");
            menuSelected = keyboard.nextInt();

            switch (menuSelected) {
                case 1:
                    CaptureProducts();
                    break;
                case 2:
                    SearchProduct(Products);
                    break;
                case 3:
                    UpdateProduct(Products);
                    break;
                case 4:
                    DeleteProduct(Products);
                    break;
                case 5:
                    //  data.ReportProduct(Products);
                    break;
                case 6:
                    ExitApplication();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Incorrect choice Try again\n");
                    break;
            }
        } while (menuSelected > 6);
    }
//------------------------------DisplayMenu-------------------------------------

//------------------------Begin CaptureProducts Method--------------------------
    public ArrayList<Assignment> CaptureProducts() {

//        for (int j = 0; j < 5; j++) {
        int prodnum = 0;
        boolean flag = false;

        Assignment store = new Assignment();

        JOptionPane.showMessageDialog(null, "CAPTURE  A  NEW  PRODUCT");
        do {
            System.out.println("Enter the product code: ");
            String productCode = keyboard.next();

            if (Validate(productCode) == true) {
                JOptionPane.showMessageDialog(null, "Product code is captured");
                flag = true;

            } else {
                JOptionPane.showMessageDialog(null, "Incorrectly formatted code\nProduct code should be 3 charecters long.");
            }
            store.setProductCode(productCode);
            prodnum = prodnum++;
            store.setProdnum(prodnum);
        } while (!flag);

        System.out.println("Enter the product name: ");
        String productName = keyboard.next();
        store.setProductName(productName);

        System.out.println("Select the product category: ");

        System.out.println("Desktop Computer - 1\nLaptop - 2\nTablet - 3\nPrinter - 4\nGaming Console - 5");
        int productCategory = keyboard.nextInt();
        String prodCat = " ";

        if (productCategory == 1) {
            prodCat = "Desktop Computer";
        } else if (productCategory == 2) {
            prodCat = "Laptop";
        } else if (productCategory == 3) {
            prodCat = "Tablet";
        } else if (productCategory == 4) {
            prodCat = "Printer";
        } else if (productCategory == 5) {
            prodCat = "Gaming Console";
        } else if (productCategory > 5) {

            JOptionPane.showMessageDialog(null, "Incorrect product category selection\nTry again");
            do {
                System.out.println("Select the product category: ");

                System.out.println("Desktop Computer - 1\nLaptop - 2\nTablet - 3\nPrinter - 4\nGaming Console - 5");

                productCategory = keyboard.nextInt();

                if (productCategory == 1) {
                    prodCat = "Desktop Computer";
                } else if (productCategory == 2) {
                    prodCat = "Laptop";
                } else if (productCategory == 3) {
                    prodCat = "Tablet";
                } else if (productCategory == 4) {
                    prodCat = "Printer";
                } else if (productCategory == 5) {
                    prodCat = "Gaming Console";
                } else if (productCategory > 5) {
                    JOptionPane.showMessageDialog(null, "Incorrect product category selection\nTry again");
                }
            } while (productCategory > 5);
        }

        store.setProdCat(prodCat);
        JOptionPane.showMessageDialog(null, "Product Category is " + store.getProdCat());
        int productWarranty = 0;
        String prodWarrnty = " ";
        System.out.println("Indicate the product warranty. \nEnter (1) for 6 months (2) for 2 years>> ");
        productWarranty = keyboard.nextInt();
        switch (productWarranty) {
            case 1:
                prodWarrnty = "6 months";
                break;
            case 2:
                prodWarrnty = "2 years";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorrect selction");
                do {
                    System.out.println("Indicate the product warranty. \nEnter (1) for 6 months (2) for 2 years>> ");
                    productWarranty = keyboard.nextInt();

                    switch (productWarranty) {
                        case 1:
                            prodWarrnty = "6 months";
                            break; 
                        case 2:
                            prodWarrnty = "2 years";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Incorrect selction");
                            break;
                    }
                } while (productWarranty > 2);
        }
        store.setProdWarrnty(prodWarrnty);

        System.out.println("Enter the price for " + store.getProductName());
        int productPrice = keyboard.nextInt();
        store.setProductPrice(productPrice);

        System.out.println("Enter the stock level for " + store.getProductName()
                + "\n Levels: \n(1) - Stock is sufficent\n(2) - Stock is Low\n(3) - Stock is insufficient ");
        int productStocklevel = keyboard.nextInt();
        String ProdStock = " ";
        switch (productStocklevel) {
            case 1:
                ProdStock = "Stock is sufficent";
                break;
            case 2:
                ProdStock = "Stock is Low";
                break;
            case 3:
                ProdStock = "Stock is insufficient";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorrect selction");
                do {
                    System.out.println("Enter the stock level for " + store.getProductName()
                            + "\n Levels: \n(1) - Stock is sufficent\n(2) - Stock is Low\n(3) - Stock is insufficient ");
                    productStocklevel = keyboard.nextInt();

                    switch (productStocklevel) {
                        case 1:
                            ProdStock = "Stock is sufficent";
                            break;
                        case 2:
                            ProdStock = "Stock is Low";
                            break;
                        case 3:
                            ProdStock = "Stock is insufficient";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Incorrect selction");
                            break;
                    }
                } while (productStocklevel >= 4);
        }
        store.setProdStock(ProdStock);

        System.out.println("Enter the supplier for " + store.getProductName());
        String productSupplier = keyboard.next();
        store.setProductSupplier(productSupplier);

        Products.add(store);

        JOptionPane.showMessageDialog(null, "Product details has been saved successfully!!!");
        System.out.println("Enter (1) to luanch menu or any other key to exit");
        select = keyboard.nextInt();
        if (select == 1) {
            DisplayMenu(Products);
        } else {
            ExitApplication();
        }
        //  }
        return Products;
    }
//--------------------------End CaptureProducts Method--------------------------

//------------------------Begin SearchProduct Method----------------------------
    public void SearchProduct(ArrayList<Assignment> Products) {

        System.out.println("Enter the product code to be searched: ");
        String ProdSearch = keyboard.next();

        for (Assignment Product : Products) {

            int index = Products.indexOf(ProdSearch);
            if (index == -1) {

                System.out.println("*************************************\n"
                        + "Product Search Results\n"
                        + "*************************************");

                System.out.println("PRODUCT CODE: " + Product.getProdCat()
                        + "\nPRODUCT NAME: " + Product.getProductName()
                        + "\nPRODUCT WARRANTY: " + Product.getProdWarrnty()
                        + "\nPRODUCT CATEGORY: " + Product.getProdCat()
                        + "\nPRODUCT PRICE: " + Product.getProductPrice()
                        + "\nPRODUCT STOCK LEVELS: " + Product.getProdStock()
                        + "\nPRODUCT SUPPLIER: " + Product.getProductSupplier());
                System.out.println("*************************************");

                System.out.println("Enter (1) to luanch menu or any other key to exit");
                select = keyboard.nextInt();
                if (select == 1) {
                    DisplayMenu(Products);
                } else {
                    ExitApplication();
                }
            } else {

                JOptionPane.showMessageDialog(null, "The product cannot be located.\nInvalid Product");
                System.out.println("Enter (1) to luanch menu or any other key to exit");
                select = keyboard.nextInt();
                if (select == 1) {
                    DisplayMenu(Products);
                } else {
                    ExitApplication();
                }
            }
        }

    }
//--------------------------End SearchProduct Method----------------------------

//------------------------Begin UpdateProduct Method----------------------------
    public void UpdateProduct(ArrayList<Assignment> Products) {

        String prodWarrnty = " ";
        int productWarranty = 0;

        String prc;
        int price;

        String level;
        int stock;
        System.out.println("Please enter the product code to update: ");
        String toUpdate = keyboard.next();

        for (Assignment Product : Products) {
            int index = Products.indexOf(toUpdate);

            if (index == -1) {

                System.out.println("Update the warranty? (Y) Yes, (N) No ");
                String warranty = keyboard.next();

                if (warranty.equalsIgnoreCase("y")) {
                    System.out.println("Enter the new Product Warranty\n"
                            + "Enter (1) for 6 months (2) for 2 years>> ");
                    productWarranty = keyboard.nextInt();
                    switch (productWarranty) {
                        case 1:
                            prodWarrnty = "6 months";
                            break;
                        case 2:
                            prodWarrnty = "2 years";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Incorrect selction");
                            break;
                    }
                    Product.setProdWarrnty(prodWarrnty);

                }
                System.out.println("Update the product price? (Y) Yes, (N) No ");
                prc = keyboard.next();

                if (prc.equalsIgnoreCase("y")) {
                    System.out.println("Enter the new price for " + Product.getProductName());
                    price = keyboard.nextInt();
                    Product.setProductPrice(price);

                }
                System.out.println("Update the stock level? (Y) Yes, (N) No ");
                level = keyboard.next();
                if (level.equalsIgnoreCase("Y")) {

                    System.out.println("Enter the new stock level for " + Product.getProductName()
                            + " Levels: \n(1) - Stock is sufficent\n(2) - Stock is Low\n(3) - Stock is insufficient ");
                    stock = keyboard.nextInt();
                    switch (stock) {
                        case 1:
                            level = "Stock is sufficent";
                            break;
                        case 2:
                            level = "Stock is Low";
                            break;
                        case 3:
                            level = "Stock is insufficient";
                        default:
                            JOptionPane.showMessageDialog(null, "Incorrect selction");
                            break;
                    }
                    Product.setProdStock(level);
                } else {
                    System.out.println("Enter (1) to luanch menu or any other key to exit");
                    select = keyboard.nextInt();
                    if (select == 1) {
                        DisplayMenu(Products);
                    } else {
                        ExitApplication();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Product could not be located");
                System.out.println("Enter (1) to luanch menu or any other key to exit");
                select = keyboard.nextInt();
                if (select == 1) {
                    DisplayMenu(Products);
                } else {
                    ExitApplication();
                }
            }
        }

    }
//--------------------------End UpdateProduct Method----------------------------

//------------------------Begin DeleteProduct Method----------------------------
    public void DeleteProduct(ArrayList<Assignment> Products) {

        String ProdSearch;
        int option;
        boolean flag = false;
        System.out.println("Enter the product code to be deleted: ");
        ProdSearch = keyboard.next();

        for (Assignment Product : Products) {
            if (ProdSearch.equals(Product.getProductCode())) {
                System.out.println("*************************************");
                System.out.println("PRODUCT CODE: " + Product.getProdCat()
                        + "\nPRODUCT NAME: " + Product.getProductName()
                        + "\nPRODUCT WARRANTY: " + Product.getProdWarrnty()
                        + "\nPRODUCT CATEGORY: " + Product.getProdCat()
                        + "\nPRODUCT PRICE: " + Product.getProductPrice()
                        + "\nPRODUCT STOCK LEVELS: " + Product.getProdStock()
                        + "\nPRODUCT SUPPLIER: " + Product.getProductSupplier());
                System.out.println("*************************************\n"
                        + "Enter (1) to delete and (2) to keep\n"
                        + "*************************************");
                option = keyboard.nextInt();

                switch (option) {
                    case 1:
                        if (option == 1) {
                            flag = true;
                        }
                        if (flag) {
                            for (int i = 0; i < Products.size(); i++) {
                                Product = null;
                            }
                            {
                                JOptionPane.showMessageDialog(null, "Product has been deleted");
                            }
                        }
                        break;
                    case 2:
                        if (option == 2) {
                            flag = false;
                        }
                        if (flag) {
                            JOptionPane.showMessageDialog(null, "The product cannot be located.\nInvalid Product");
                        }
                        break;

                }

            }
            System.out.println("Enter (1) to luanch menu or any other key to exit");
            select = keyboard.nextInt();
            if (select == 1) {
                DisplayMenu(Products);
            } else {
                ExitApplication();
            }

        }
    }
//--------------------------End DeleteProduct Method----------------------------

//----------------------Begin ExitApplication Method----------------------------
    public void ExitApplication() {

        System.exit(0);

    }
//------------------------End ExitApplication Method----------------------------

//----------------------------Begin Validate Method-----------------------------
    public boolean Validate(String productCode) {

        boolean flag = false;
        if (productCode.length() == PRODUCTCODE) {
            flag = true;
        }
        return flag;
    }
//-----------------------------End Validate Method------------------------------

}
