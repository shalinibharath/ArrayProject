package com.array;

import static java.lang.Float.min;

public class Method {
    static void main(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
            System.out.println(min);
    }

    public  static  void main(String args[]){

        int a[]={33,3,4,5};

        min(a);
    }

    private static void min(int[] a) {
    }


}




