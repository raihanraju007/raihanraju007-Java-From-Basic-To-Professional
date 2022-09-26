package Class_07_Java_Arrays.HomeWorkProblem;

public class Leetcode_Arrays101 {
    public static void main(String[] args){
       int[] array = new int[6];
       int length = 0;

       for (int i =0; i<3; i++){
           array[i] = i * i;
           length++;
       }
        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The array has a length " + length);
    }
}
