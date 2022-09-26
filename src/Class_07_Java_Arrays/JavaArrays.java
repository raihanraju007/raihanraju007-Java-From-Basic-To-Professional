package Class_07_Java_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){
        int [] numbers = {5, 0, 8, 0, 10};
        System.out.println(numbers);

//        for (int i = 0; i <= numbers.length; i++){
//            System.out.println(numbers[i] + " ");
//        }

        double [] numbers1 = new double[4];
        numbers1[0] = 1.9;
        numbers1[1] = 2.9;
        numbers1[2] = 3.4;
        numbers1[3] = 3.5;

//        Sorting Array
        System.out.println("-----------------Array Sorting-----------------------");
        int[] numbersSort = {5, 2, 3, -1, 0, 4, 1};
        Arrays.sort(numbersSort);

        for (int i =0; i <= numbersSort.length; i++){
            System.out.println(numbersSort[i] + " ");
        }


    }
}
