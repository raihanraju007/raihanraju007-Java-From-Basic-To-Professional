import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String [] args){

        //        Solution From Syed Mainul Bhi
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number > 0){
            System.out.print(number % 10);
            number /=10;
        }

//        int number,j, i = 0;
//        int binary[] = new int[100];
//        Scanner user_Input = new Scanner(System.in);
//        System.out.println("Enter decimal number : ");
//        number = user_Input.nextInt();
//        while (number !=0){
//            binary[i] = number % 2;
//            number = number/2;
//            i++;
//        }
//        System.out.println("Binary value is : ");
//        for (j = i - 1; j>=0; j--){
//            System.out.print(" "+binary[j]);
//        }
    }
}
