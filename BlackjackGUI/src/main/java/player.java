/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antranik Medina
 */
public class player{
    private String name;
    private double amount;

    public player(){
        this.name = "User";
        this.amount = 100;
    }

    public player(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}