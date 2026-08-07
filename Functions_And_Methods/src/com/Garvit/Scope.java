package com.Garvit;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
         String name ="Garvit";
        {
//              int a = 78;  // already initialized outside the
                          //block in the same method, you cannot initialized again
            a=100;// can reassign the origin ref variable to some other value
      name="Garvit Tomar"; //same with Strings
            System.out.println(name);
            int c = 99;
             //values initialized in this will remain in this block.
        }
        int c=900;
        System.out.println(a);
        System.out.println(name);

//          System.out.println(c);   //cannot use outside the block

      //Scoping in for loops :-
        for(int i=0; i<4; i++){
       //     System.out.println(i);
            int num = 98;
          a = 10000 ;
        }
         System.out.println(a);


    }



    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);

    }



}

