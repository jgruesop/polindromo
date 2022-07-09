package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct());
    }

    public static int adjacentElementsProduct(){
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int count = 0;
        int product = 0;
        int larguest = Integer.MIN_VALUE;
        while(count < inputArray.length - 1) {
            product = inputArray[count] * inputArray[count+1];
            count++;
            if(product >larguest){
                larguest = product;
            }

        }

        return larguest;
    }
}