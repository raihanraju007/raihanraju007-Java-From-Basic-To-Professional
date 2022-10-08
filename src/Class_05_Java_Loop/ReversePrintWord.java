import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrintWord {
    public static void main(String [] args) {
        //        Solution From Syed Mainul Bhi
        String s = "name word. meow";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

       var arr = s.split(" ");
       var j = 0;

       while (j < arr.length){
           for (int i = arr[j].length() -1; i>=0; i--){
               System.out.print(arr[j].charAt(i));
           }
           System.out.println();
           j++;
       }
       for(var str:arr){
           for (int i =str.length() -1; i>=0; i--){
               System.out.print(str.charAt(i));
           }
           System.out.println();
       }

//        BufferedReader bfn = new BufferedReader(
//                new InputStreamReader(System.in));
//        String str = bfn.readLine();
//        System.out.println("Original Word " + str);
//        String nastr = "";
//        char ch;
//        for (int i = 0; i<str.length(); i++){
//            ch = str.charAt(i);
//            nastr = ch + nastr;
//        }
//        System.out.println("Reversed Word : " + nastr);
    }
}
