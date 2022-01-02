package com.kunal;

import java.util.Scanner;

public class distributingItems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        distribute(n,m,k);
    }

    private static void distribute(int n, int m, int k) {
        if(m<=n-k+1) System.out.println(k+m-1);
        else{
            m-=(n-k+1);
            if(m%n==0) System.out.println(n);
            else System.out.println(m%n);
        }
    }
}
