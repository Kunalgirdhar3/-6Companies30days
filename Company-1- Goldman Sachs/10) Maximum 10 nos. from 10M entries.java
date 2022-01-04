package com.kunal;

import java.util.PriorityQueue;
import java.util.Scanner;

public class maxNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<10;i++) q.add(in.nextInt());
        for(int i=10;i<10000000;i++){
            int n = in.nextInt();
            if(n>q.peek()){
                q.poll();
                q.add(n);
            }
        }
        while (!q.isEmpty()) System.out.println(q.poll());
    }
}