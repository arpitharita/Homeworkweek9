package homeworkweek;

//Write a Java program to reverse an array of integer values.

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {

        int [] arr = new int[]{1245,2354,3526,698,1236,4569,3924};
        System.out.println("Original array :" + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++){
            int a = arr[i];
            arr[i]=arr[arr.length -i -1];
            arr[arr.length -i - 1]= a;
        }
        System.out.println("Reverse array :" +Arrays.toString(arr));
    }



}
