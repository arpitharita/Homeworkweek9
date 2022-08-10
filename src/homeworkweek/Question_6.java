package homeworkweek;

//Write a Java program to retrieve an element (at a specified index) from a given
//array list

import java.util.ArrayList;
import java.util.List;

public class Question_6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("Jun");
        System.out.println(list);
        String p = list.get(2);
        System.out.println("Retrieve an elements :" +p);
        String p1 = list.get(5);
        System.out.println("Retrieve an elements :" +p1);
    }
}
