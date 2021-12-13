package Mathexercises;

public class MathMax {

    public static void main(String[] args) {

     findMax(23,15,48);

    }


    public static void findMax(int a, int b, int c){
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Max is: " + max);
    }



}
