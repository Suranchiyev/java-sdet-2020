package day5;

public class Project {
    public static void main (String[] args) { 
       int amount = Integer.parseInt(args[0]); 
       int cents = amount;
      
       int quarters = amount / 25;
       amount = amount % 25;

       int dimes = amount / 10;
       amount = amount % 10;

       int nickels = amount / 5;
       amount = amount % 5;
       
       int pennies = amount;
       
       System.out.println(cents + " cents in coins:");
       System.out.println(quarters + " quarters");
       System.out.println(dimes + " dimes");
       System.out.println(nickels + " nickels");
       System.out.println(pennies + " pennies");
    }
}