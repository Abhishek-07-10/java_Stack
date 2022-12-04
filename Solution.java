// import java.io.*;
import java.util.*;

class Influencers{
    private String name, actor, actress;
    private int rating, money, profit;
    
    Influencers(int rating, int money){
       this.rating = rating;
       this.money = money;
       System.out.println("Stored rating and money");
    }
    Influencers(int rating, int money, int profit){
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        System.out.println("Stored rating, money, profit are given.");
    }
    Influencers(int rating, int money, int profit, String actor){
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.actor = actor;
        System.out.println("Stored rating, money, profit, lead actors are given.");
     }
}

public class Solution {

    public static void main(String[] args) {
        
        
        Influencers in1 = new Influencers(8, 900000);
        Influencers in2 = new Influencers(8, 900000, 8000);
        Influencers in3 = new Influencers(8, 900000, 8000, "Ranveer Singh");
    }
}