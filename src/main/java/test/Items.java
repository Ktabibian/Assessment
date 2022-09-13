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

//Question 2:
//        ```Create an Array to store each character letter of the alphabet from A - Z.
//        Print out the character letter Y from your array.
//        Modify the array properly by replacing the character letter A with a  $ sign
//        Now attempt to print out the character letter Y from your array again with the same exact line of code you used before.
//        If a different character letter is printing out then your way of retrieving the character letter the first time was wrong.
//        Use a for loop to loop through and print every letter in the array except the letter 'Y'

//Question 3
// Create a while loop that attempts to print every double digit number starting from 20 down to 0 but stops printing numbers once it gets to a single digit number;

public class Items {

//    static double orderTotal(){
//
//    }

    public static void main(String[] args) {

        //Q2 done
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println(alphabet[24]);
        alphabet[0] = '$';
        System.out.println(alphabet[24]);
        for(int i = 0; i < alphabet.length; i++){
            if (i == 24) {
                System.out.print("");
            } else {
                System.out.println(alphabet[i]);
            }
        }
        System.out.println("");

        //Q3 done
        int max = 0;
        int min = 20;
        while( min >= max){
            if(min <= 9){
                System.out.print("");
            }else if(min >= 10){
                System.out.println(min);
            }
            min--;
        }
    }
    /*
    References
    https://www.w3schools.com/java/java_arrays.asp
    https://www.w3schools.com/java/java_for_loop.asp
    https://www.w3schools.com/java/java_while_loop.asp
    https://coderanch.com/t/416655/java/skip-element-array
     */
}
