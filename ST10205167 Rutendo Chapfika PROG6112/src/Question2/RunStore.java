/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import javax.swing.JOptionPane;

/**
 *
 * @author rutendo christian chapfika
 */
public class RunStore {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "RT'S TAKKIES \nWelcome to our store!");
        JOptionPane.showMessageDialog(null, "                                       GIVEAWAY!! \n"
                + "RT'S TAKKIES is doing a giveaway of 5 pairs of the following takkies \n");

        String[] shoes = {"Nike Dior Jordans", "Travis Scott Air Jordans 1", "Nike Ariforce 1", "Adidas Yeezy Boost 350", "Adidas Yeezy Powerphase <GREY>"};
        int[] stock = {1, 2, 2, 3, 1};

        for (int index = 0; index < shoes.length; index++) {
            JOptionPane.showMessageDialog(null, shoes[index]);
            JOptionPane.showMessageDialog(null, "Shoes left " + stock[index]);
        }

        String option = JOptionPane.showInputDialog(null, "To see if you qulify to enter (1) enter (2) to exit");
        int OPTION = Integer.parseInt(option);
        if (OPTION == 1) {
            MainThread();
        } else {
            JOptionPane.showMessageDialog(null, "RT'S TAKKIES \nGoodbye");
            System.exit(0);
        }
    }

    public static void MainThread() {
        Store store = new Store();
        GetShoes cnn = new GetShoes();
        JOptionPane.showMessageDialog(null, "Answer the following question to qualify!");

        String name = JOptionPane.showInputDialog(null, "Enter your name");
        store.setName(name);

        String age = JOptionPane.showInputDialog(null, "Enter your age");
        String bought;
        bought = JOptionPane.showInputDialog(null, "Have you bought shoes form us before. Yes or No");

        if (bought.equalsIgnoreCase("yes")) {
            cnn.DisplayCongradulations();

        } else {
            JOptionPane.showMessageDialog(null, "Sorry you dont qualify\nBuy something to enter");

        }

    }

}
