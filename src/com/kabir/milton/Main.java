package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x=sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int y= sc.nextInt();
        System.out.println("Total income:");
        if(x*y<=60){
            System.out.println("$"+x*y*10);
        }
        else{
            int x1=x/2;
            int x2=x-x1;
            System.out.println("$"+(x1*10+x2*8)*y);
        }
    }
}
