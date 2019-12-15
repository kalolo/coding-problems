package problems;

class App {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(10);
        minStack.push(1);
        minStack.push(4);
        minStack.push(8);
        minStack.push(2);

        System.out.println("Current Top Value: " +minStack.top());
        System.out.println("Current Min Value: " +minStack.getMin());

        minStack.pop();

        minStack.print();
        
        System.out.println("Current Top Value: " +minStack.top());
        System.out.println("Current Min Value: " +minStack.getMin());

        minStack.print();
    }
}