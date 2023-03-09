package com.company;

public class IntSqrt {
    public static void main(String[] args) {
        System.out.println(intSqrt(40000));
        System.out.println(intSqrt(55));
    }

    static int intSqrt(int n){
        int m = n/2;
        return recursiveSqrt(n,m);
    }

    static int recursiveSqrt(int n, int m){
        if((m*m <= n) && ((m+1)*(m+1) > n)) return m;
        if(n > m*m) return recursiveSqrt(n,m+1);
        if(n < m*m) return recursiveSqrt(n,m/2);
        return -1;
    }
}
