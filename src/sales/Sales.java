package sales;

import java.util.Scanner;

public class Sales
{
 
    public static void main(String[] args)
 
    {
 
        final int SALESPEOPLE;
 
        int[] sales;
 
        String [] id;
 
        int sum;
 
        Scanner scan = new Scanner(System.in);
 

        int averageSales;
 
        int highestSales=0;
        String highestSalesPerson=null;
 
        int lowestSales=2147483647;
        String lowestSalesPerson=null;
        
        int comparison=0;
        int totalExceeded=0;
        
        System.out.println("Please enter the number of sales people in the team: ");
        SALESPEOPLE=scan.nextInt();
        
        sales=new int[SALESPEOPLE];
        id=new String[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
 
        {
            System.out.print("Enter id for salesperson " + (i+1) + ": "); 
    
            id[i]=scan.next();
            
            
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
    
            sales[i] = scan.nextInt();
        }
 
        System.out.println("\nSalesperson Sales");
 
        System.out.println("--------------------");
 
        sum = 0;
 
        for (int i=0; i<sales.length; i++)

        {
 
            System.out.println(" " + (i+1) + " " + sales[i]);
 
            sum += sales[i];
 
        }
 
        System.out.println("\nTotal sales: " + sum);
 
 
 
        averageSales=sum/SALESPEOPLE;
 
        System.out.println("\nAverage sales: "+averageSales);
 
 
        for(int x=0;x<sales.length;x++)
 
        {
     
            if(sales[x]>highestSales)
     
            {
         
                highestSales=sales[x];
                highestSalesPerson=id[x];
            }
 
        }
 
        System.out.println("\nHighest sales: "+highestSalesPerson+" with "+highestSales+" sales.");
 

        for(int x=0;x<sales.length;x++)
 
        {
     
    
            if(sales[x]<lowestSales)
     
            {
         
                lowestSales=sales[x];
                lowestSalesPerson=id[x];
            }
 
        }
 
        System.out.println("\nLowest sales: "+lowestSalesPerson+" with "+lowestSales+" sales.");
 
        System.out.println("Please enter a sales figure to filter sales people by: ");
        comparison=scan.nextInt();
        
        for(int x=0;x<sales.length;x++)
        {
            if(sales[x]>comparison)
            {
                System.out.println(id[x]+" with "+sales[x]+" sales.");
                totalExceeded++;
            }
        }
        System.out.println("Are the sales person(s) with sales greater than "+comparison+" sales.");
        System.out.println(totalExceeded+" sales person(s) exceeded "+comparison+" sales.");
    }
    
    
    

    
 

}

