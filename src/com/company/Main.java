package com.company;

class X{
    int dp1(int a){
        return a;
    }

    int dp1(int a, int b){
        return a+b;
    }

    int dp1(int a,int b,int c){
        return a+b+c;
    }
}

public class Main {

    public static void main(String[] args) {
        X x=new X();
        int a=x.dp1(10);
        int b=x.dp1(10,20);
        int c=x.dp1(10,20,30);
        System.out.println(a+" "+ b +" "+c);
    }
}
