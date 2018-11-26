package main;


public class ArrayIndexOutOfBounds2 {

    public static void main(String[] args){

        int a[] = new int[4];


            a[4] = 1;                 //bis c=3 ein unkritisches Statement

        System.out.println(a[4]);
    }
}









