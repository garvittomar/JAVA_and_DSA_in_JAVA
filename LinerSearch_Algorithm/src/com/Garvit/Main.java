package com.Garvit;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target =823;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr , int target) {
        if (arr.length == 0) {
            return false;
        }
        //run a for loop:
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;

            }

        }
        // this line will be executed if none of the above return statement have executed
        //hence the target not found
        return false;
    }



        static int linearSearch2(int[] arr , int target) {
            if (arr.length == 0) {
                return -1;
            }
            //run a for loop:
            for (int element : arr) {
                if (element == target) {
                    return element;
                }

            }
            // this line will be executed if none of the above return statement have executed
            //hence the target not found
            return Integer.MAX_VALUE;

        }

    //Search in the Array: return the index if etem found
    //otherwise if item not found return -1
           static int linearSearch (int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop:
                for (int index = 0; index < arr.length; index++) {
                    //check for element at every index if it is = target
                    int element = arr[index];
                    if (element == target) {
                        return index;
                    }

            }
          // this line will be executed if none of the above return statement have executed
        //hence the target not found
    return -1;

    }

}
