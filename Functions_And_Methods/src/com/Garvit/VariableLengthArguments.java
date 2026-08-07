package com.Garvit;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
     //   fun(2,3,4,5,54,45,4,54,45);
     //   multiple(2,3,"Garvit","Tomar","Here");
     // demo(); // empty will not run because how it will decide which one to run
        demo(3,3,4,67);



    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

  static void multiple(int a, int b, String ...v){

  }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
