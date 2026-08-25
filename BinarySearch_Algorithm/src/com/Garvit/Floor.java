package com.Garvit;

public class Floor {
    public static void main(String[] args) {

        //Q. give the target or the
        // nearest to target but small and  greatest  of the rest small numbers
        int[] arr= {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Floor(arr,target);
        System.out.println(ans);
    }

    // return the index of greatest number <= target

    static int Floor(int[] arr , int target){


        int start =0;
        int end = arr.length -1 ;

        while(start<= end){
            //find the middle element
            //    int mid = (start+end)/2; // might be possible that (start + end)
            //    exceeds the range of int in java
            int mid = start +(end - start)/2;

            if(target< arr[mid]){
                end = mid-1;
            }else if (target >arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return end;
    }

}

