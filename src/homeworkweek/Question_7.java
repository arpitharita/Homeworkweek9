package homeworkweek;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class Question_7 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Etobicoke");
        arr.add("Brampton");
        arr.add("Missisauga");
        arr.add("bathrust");
        arr.add("keeke");

        System.out.println(arr);
        if (arr.isEmpty()){
            System.out.println("ArrayList is empty");
        }else {
            System.out.println("ArrayList is not empty");
        }
    }
}
