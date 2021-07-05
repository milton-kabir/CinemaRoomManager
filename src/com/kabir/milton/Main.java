package com.kabir.milton;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] ar=new String[8];
        ar[0]="";
        for(int i=1;i<=8;i++){
            ar[0]+=" "+Integer.toString(i);
        }
        for(int i=1;i<=7;i++){
            ar[i]="";
            for(int j=0;j<=8;j++){
                if(j==0){
                    ar[i]+=Integer.toString(i)+" ";
                }
                else{
                    ar[i]+=" S";
                }
            }
        }
        System.out.println("Cinema:");
        for(int i=0;i<=7;i++){
            System.out.println(ar[i]);
        }
    }
}
