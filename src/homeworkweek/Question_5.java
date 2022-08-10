package homeworkweek;

//Write a Java program to iterate through all elements in an array list using
//Iterator.

import java.util.ArrayList;
import java.util.List;

public class Question_5 {

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("java");
        list_Strings.add("python");
        list_Strings.add("c++");
        list_Strings.add("ruby");
        list_Strings.add("c#");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}
