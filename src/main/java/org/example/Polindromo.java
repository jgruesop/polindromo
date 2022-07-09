package org.example;

public class Polindromo {
    public static void main(String[] args) {
        System.out.println(checkpan());
    }

    public static boolean checkpan(){
        String inputString = "sometemos";
        int i = inputString.length()-1;
        int j = 0;
        while(i != j && j < i){
            if (inputString.charAt(j++) == inputString.charAt(i--))
                return true;
        }
        return false;


    }


}
