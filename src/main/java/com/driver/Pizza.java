package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

//    public void setBill(String bill) {
//        this.bill = bill;
//    }

    private  static int VegPizzaBaseprice = 300;
    private static int NonVegPizzaBasePrice = 400;
    private static int ExtraCheesePrice = 80;
    private static int ExtraToppingsForVegPizza = 70;
    private static int ExtraToppingsForNonVegPizza = 120;
    private static int PaperBagPrice = 20;
    private boolean isExtraCheese;
    private boolean isTopping;
    private boolean takeAway;
    private int toppingPrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? VegPizzaBaseprice : NonVegPizzaBasePrice;
        this.bill = "Base price of the pizza" + this.price + "\n";
        takeAway = false;
        isTopping = false;
        isExtraCheese = false;
        toppingPrice = 0;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            price += ExtraCheesePrice;

            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        toppingPrice = isVeg ? ExtraToppingsForVegPizza: ExtraToppingsForNonVegPizza;
        if(!isTopping){
            toppingPrice = isVeg ? ExtraToppingsForVegPizza: ExtraToppingsForNonVegPizza;
            isTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            price += PaperBagPrice;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        int extracheese = isExtraCheese ? ExtraCheesePrice : 0;
        int extratoppings = isTopping ? toppingPrice : 0;
        int bagprice = takeAway ? PaperBagPrice : 0;

        bill += "extra cheese added " + extracheese + "\n";
        bill += "extra toppings added " + extratoppings + "\n";
        bill += "paperbag added " +  bagprice + "\n";
        bill += "Total price " + price + "\n";
        return this.bill;
    }
}
