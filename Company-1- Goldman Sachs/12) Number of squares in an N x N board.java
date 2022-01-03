package com.kunal;

import java.util.Scanner;

public class noOfSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ans=(n*(n+1)*(2*n+1))/6;
        System.out.println(ans);
    }
}
