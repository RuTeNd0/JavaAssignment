/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author rutendo christian chapfika
 */
public class Store {

    String name;

    public Store() {
    }

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String DisplayCongradulations() {
        String message;
        message = "Congradulations on your win";
        return message;
    }
}
