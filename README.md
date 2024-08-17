Overview

This project contains two Java applications developed using NetBeans. Each application serves a distinct purpose, and both are organized into separate packages: Question1 and Question2.

Project 1: Product Management System
Package: Question1
Purpose:
This application is designed to manage a collection of products. It allows users to capture, search, update, delete, and report on product information.

Main Classes:

Assignment

A model class representing a product with attributes such as productName, prodCat (product category), prodWarrnty (product warranty), ProdStock (product stock levels), productCode, productSupplier, productPrice, and prodnum (product number).
Includes getter and setter methods for each attribute.
The toString() method provides a formatted string representation of the product.
Products

Manages the product collection using an ArrayList<Assignment>.
Contains methods to capture, search, update, delete products, and display the main menu.
The mainThread() method initiates the application and displays a welcome message.
The DisplayMenu() method presents the main menu and handles user input for different actions.
CaptureProducts() captures and validates new product details, SearchProduct() allows searching by product code, UpdateProduct() updates product details, and DeleteProduct() removes a product from the collection.
Includes validation logic to ensure product codes are correctly formatted.
ReportData

Handles the reporting functionality.
Generates a report of all products, displaying details like product code, name, warranty, category, price, stock levels, and supplier.
Calculates and displays the total and average product value in the report.
RunProject

Contains the main() method, which serves as the entry point of the application.
Instantiates the Products class and calls mainThread() to start the application.

Project 2: Shoe Store
Package: Question2

How to Run
Open the project in NetBeans.
To run the the projects:
Navigate to the RunProject class in the Question1 package or Question 2 package.
Right-click on the class and select "Run File" or press Shift + F6.
