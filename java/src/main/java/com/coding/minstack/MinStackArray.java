
package com.coding.minstack;

public class MinStackArray {
    
    private int min;
    private int current;
    
    private int stack[];
    private int maxSize = 100;

    /** initialize your data structure here. */
    public MinStackArray() {
        stack = new int[maxSize];
        current = -1;
        min = -1;
    }
    
    public void push(int x) {                
        resize();
        stack[current] = x;
        if (min == -1 || x <= stack[min]) min = current;
    }
    
    public void pop() {
        if (current > -1 ) current--;        
        
        if (min > current) {
            min = current;
            calculateMin();
        }
    }
    
    public int top() {
        if (current >= 0) return stack[current];
        return 0;
    }
    
    public int getMin() {        
        if (min <= current) return stack[min];
        return 0;
    }
    
    private void calculateMin() {
        int z = current;
        while (z >= 0) {
            if (stack[z] <= stack[min]) {
                min = z;
            }
            z--;
        }
    }

    private void resize() {
        current++;
        // check if max size has reach and create a new array and copy
    }

    public void print() {
        System.out.println("+-------------STACK---------------");
        for(int x = 0; x < current; x++) {
            System.out.println("| "+x+" - " + stack[x]);
        }
        System.out.println("+--------------------------------");
    }
}