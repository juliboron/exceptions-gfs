package main;


public class ArrayIndexOutOfBounds {

    public static void main(String[] args){

        int a[] = new int[4];

        for (int c = 0; c <=4 ; c++) {
            a[c] = c+1;                 //bis c=3 ein unkritisches Statement
        }

        for (int value : a) {
            System.out.println(value);
        }

    }
}








