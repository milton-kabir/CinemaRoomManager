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
        String[] ar=new String[x+1];
        ar[0]=" ";
        for(int i=1;i<=y;i++){
            ar[0]+=+i;
        }
        for(int i=1;i<=x;i++){
            ar[i]="";
            for(int j=0;j<=y;j++){
                if(j==0){
                    ar[i]+=i;
                }
                else{
                    ar[i]+="S";
                }
            }
        }
        while(true){
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "0. Exit");
            int ck=sc.nextInt();
            if(ck==0){
                break;
            }
            else if(ck==1){
                System.out.println("Cinema:");
                for(int i=0;i<=x;i++){
                    for(int j=0;j<=y;j++){
                        System.out.print(ar[i].charAt(j)+" ");
                    }
                    System.out.println();
                }
            }
            else{
                int xx,yy;
                System.out.println("Enter a row number:");
                xx=sc.nextInt();
                System.out.println("Enter a seat number in that row:");
                yy=sc.nextInt();
                ar[xx]=ar[xx].substring(0,yy)+'B'+ar[xx].substring(yy+1);
                if(x*y<=60){
                    System.out.println("Ticket price: $10");
                }
                else{
                    int x1=x/2;
                    if(xx<=x1){
                        System.out.println("Ticket price: $10");
                    }
                    else{
                        System.out.println("Ticket price: $8");
                    }
                }
            }
        }
    }
}
