package com.Garvit;

public class Maximum_item {
    public static void main(String[] args) {

        // Q. MAximum value of an array:

        int[] arr = {1,3,2,9,18};
        System.out.print("Here is the maximum value :- ");
        System.out.println(max(arr)); //overall max value
        System.out.print(maxRange(arr,3,4));

    }

// Q. Find the max value in range like in between index 1 to 3 or any other
    //also work on edge cases here , like array being null

    static int maxRange(int[] arr , int start , int end) {

        if(end>start){
            return -1;
        }

        if(arr==null){
            return -1;
        }


        int maxVal =arr[start];
        for (int i = 0; i < end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }



    static int max(int[] arr) {

        if(arr.length == 0){
        return -1;
         }

        int maxVal =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

}

