package homeworkweek;

//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

public class Question_9 {

    public static void main(String[] args) {

        HashMap<String,Integer> name = new HashMap<>();
        name.put("jhon",18);
        name.put("Pitter",25);
        name.put("Selve",20);
        name.put("Roger",22);

        System.out.println("Output :");

        for (String i :name.keySet()){
            System.out.println(i+" " +name.get(i));
        }
    }
}
