package com.coding;

import com.coding.minstack.MinStackArray;

public class MainCoding {
    public static void main(String[] args) {

        System.out.println("[+] Testing Min Stack ");

        MinStackArray minStack = new MinStackArray();

        minStack.push(10);
        minStack.push(1);
        minStack.push(4);
        minStack.push(8);
        minStack.push(2);

        System.out.println("Current Top Value: " +minStack.top());
        System.out.println("Current Min Value: " +minStack.getMin());

        minStack.pop();
        minStack.push(-300);
        minStack.push(-123);
        minStack.pop();
        minStack.push(700);
        minStack.push(321);


        minStack.print();
        
        System.out.println("Current Top Value: " +minStack.top());
        System.out.println("Current Min Value: " +minStack.getMin());

        minStack.print();
    }
}