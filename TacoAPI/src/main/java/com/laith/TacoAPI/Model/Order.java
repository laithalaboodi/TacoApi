package com.laith.TacoAPI.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    //variables
    private final double VEGGIE = 2.5;
    private final double CHICKEN = 3.0;
    private final double BEEF = 3.0;
    private final double CHORIZO = 3.5;

    //variable to store the order 
    @JsonProperty
    private int veggie;
    @JsonProperty
    private int chicken;
    @JsonProperty
    private int beef;
    @JsonProperty
    private int chorizo;

    //getter methods
    public int getVeggieTaco() {
        return veggie;
    }

    public int getChickenTaco() {
        return chicken;
    }

    public int getBeefTaco() {
        return beef;
    }

    public int getChorizoTaco() {
        return chorizo;
    }

 
    public double getOrderTotal() {
        //gets sum 
        int totalOrderedTacos = veggie + chicken + beef + chorizo;
        //sets discount price
        double discount = 0;
        
        //if true, it sets the discount variable to 20%
        if (totalOrderedTacos >= 4) {
            discount = 20.0 / 100;
        }

        //calculates 
        double totalVeggie = veggie * VEGGIE;
   
        double totalChicken = chicken * CHICKEN;
       
        double totalBeef = beef * BEEF;
        
        double totalChorizo = chorizo * CHORIZO;

        double sumTotal = totalVeggie + totalChicken + totalBeef + totalChorizo;
        
        //discount
        double discounted_price = sumTotal - (discount * sumTotal);
        
        return discounted_price;
    }
    //to string to print
    @Override
    public String toString() {
        return "Order: " + "Veggie Taco:$ " + veggie + ", Chicken Taco:$ " + chicken + ", Beef Taco:$ " + beef + ", Chorizo Taco:$ " + chorizo;
    }
    
    

}
