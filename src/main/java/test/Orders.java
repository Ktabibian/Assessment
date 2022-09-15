package test;

/*

    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     Distance 	   = Fee
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     0 -  4 miles  = $2
	     5 - 15 miles  = $5
	    16 - 25 miles  = $10
	    26 - 50	miles  = $15
	More than 50 miles = $20


     Given the data below. Your should should return the value below
         ________________________________________________

Invoke the method twice with the sample data below

Product:Rice
Qty:20
Price $5.0
Miles:10
===============
Total: $105.0

Product:Beans
Qty:10
Price $2.0
Miles:30
===============
Total: $35.0
 */

public class Orders {

    public static double deliveryFee(int miles){
        while(miles > 50){
        }if(miles <= 50 && miles >= 26){
            return 15.00;
        }else if(miles <= 25 && miles >= 16){
            return 10.00;
        }else if(miles <= 15 && miles >= 5){
            return 5.00;
        }else if(miles <= 4){
            return 2.00;
        }
        return 20.00;
    }
    public static double itemCharge(double Product, int Qty){
        double itemCharge = Product * Qty;
        return itemCharge;
    }

    public static void receipt(double price, int quantity, String name, int miles){
        System.out.println("Product:" + name);
        System.out.println("Qty:" + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Miles:" + miles);
        System.out.println("===============");
        System.out.println("Total: $" + (itemCharge(price, quantity) + deliveryFee(miles)) + "\n");
    }


}
