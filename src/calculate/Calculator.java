package calculate;

public class Calculator {

    public void addition(int a , int b){

        System.out.println("Result Addition :" +(a+b));
    }

    public void subtraction(int a , int b){

        System.out.println("Result Addition :" +(a-b));
    }
    public void multiplication(int a , int b){
        System.out.println("Result Addition :" +(a*b));

    }
    public void Division(int a, int b){

        System.out.println("Result Addition :" +(a/b));
    }
    public void calculateResult(int a, int b ,char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if (symbol == '/') {
            Division(a, b);
        }
    }
}
