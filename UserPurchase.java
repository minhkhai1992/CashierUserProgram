import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * The program will help cashier in the store easy to check the items customer purchase and
 * give the charge money back to customer
 * In the program will split out many method so code viewer easy to check and understand the code 
 *
 * @author Khai Lim
 * @version 01/24/2018
 */

public class UserPurchase
{
   public static void main(String[] args)
   {      
      double a = runProgram();
      getCoinsVersion2(a);

   }//end main

   public static double runProgram()
   {
      double itemPrice = 0;
      double totalPrice = 0;
      int totalItemcount = 0;
      double changeMoney = 0;
      
      do 
      {
         itemPrice = getItemsPrice();
         
         if (itemPrice >= 0)
         {
               System.out.println("The item entered: " + itemPrice);
               totalPrice += itemPrice;
               totalItemcount += 1;
         }
      }
      while (itemPrice > -1);
      
      System.out.println("The program is done");
      System.out.println("The total Price: " + totalPrice);
      System.out.println("The total Item: " + totalItemcount);
      
      changeMoney = getUserReturnMoney(totalPrice);
      System.out.println("Your Return: " + changeMoney);
      
      return changeMoney;
   }
   

   public static double getItemsPrice()
   {
      double itemsPrice = 0;
      Scanner keyboard = new Scanner(System.in);

      do
      {
            System.out.println("Please enter the price items you purchase: ");
            itemsPrice = keyboard.nextDouble();
      
      }
      while (itemsPrice < -1);
      
      if (itemsPrice >= 0)
         System.out.println("The items you bought: " + itemsPrice);
      
      return itemsPrice;
     
   }
   
    /* 
   getUserReturnMoney : get the input from the user of how much they want to pay, and return the change money
   Input: price
   Output: returnChange
   
   */
   public static double getUserReturnMoney(double price)
   {
      double returnChange;
      double money1;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("How much you want to pay: ");
      double money = keyboard.nextDouble();
      returnChange = money-price;
      //System.out.println("You Still own us " + returnChange*(-1));
      while (returnChange <0 )
      {
         System.out.println("how much you want to pay for us more? " );
         money1 = keyboard.nextDouble();
         returnChange += money1;
      
      }
      
      System.out.println("You done for your payment");
      
      
      return returnChange;
   }
   
   
    public static void getCoinsVersion2(double money)
        {
            int number = (int)money; //590.99 502
            int cent = (int)((money - number) * 100);
            
            int hundreds = number / 100;
            number = number - hundreds * 100;

            int fifties = number / 50;
            number = number - fifties * 50;

            int twenties = number / 20;
            number = number - twenties * 20;

            int tens = number / 10;
            number = number - tens * 10;

            int fives = number / 5;
            number = number - fives * 5;

            int ones = number / 1;

            int quarters = cent/ 25;
            cent = cent - quarters * 25;

            int dimes = cent / 10;
            cent = cent - dimes * 10;

            int nickels = cent / 5;
            cent = cent - nickels * 5;

            int pennies = cent / 1;
            
            System.out.println("The Machine will give you back " + hundreds + " bills of $100");
           
            System.out.println("The Machine will give you back " + fifties + " bills of $50");

            System.out.println("The Machine will give you back " + twenties + " bills of $20");

            System.out.println("The Machine will give you back " + tens + " bills of $10");

            System.out.println("The Machine will give you back " + fives+ " bills of $5");
            
            System.out.println("The Machine will give you back " + ones + " bills of $1");

            System.out.println("The Machine will give you back " + quarters + " coins of 25 cents");

            System.out.println("The Machine will give you back " + dimes + " coins of 10 cents");

            System.out.println("The Machine will give you back " + nickels + " coins of 5 cents");
            
            System.out.println("The Machine will give you back " + pennies +" coins of 1 cents");
        }

        
        
   }// end class