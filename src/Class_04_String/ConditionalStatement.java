package Class_04_String;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
        int _50k = 50000;
        int _100K = 100000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name ");
        String customerName = sc.nextLine();

        System.out.println("Are You A Member ? ");
        boolean isMember = sc.nextBoolean();

        System.out.println("How Much Did You Purchase in Last Month ?");
        double amountPurchased = sc.nextDouble();

        boolean condition = isMember || amountPurchased >= _50k;

        System.out.println(condition);

//        If the customer is a member
//        And purchased power 50k
        var greeting = "Congratulations";

        if (isMember){
            if (amountPurchased >= _50k && amountPurchased < _100K){
                System.out.println(greeting);
                System.out.println("You have received 20% discount on your next month purchase");
            }
            if (amountPurchased >= _100K ){
                System.out.println(greeting);
                System.out.println("You have received 40% discount next month purchase");
            }else {
                System.out.println("Sorry, we couldn't give a discount one next month purchase !!");
            }
        }
    }
}
