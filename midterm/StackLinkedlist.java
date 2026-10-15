package midterm;

public class StackLinkedlist {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackLinkedlist() {
        top = null;
    }

    // Add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the top element
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    // Return the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return top.data;
    }

    // Display all elements from top to bottom
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        Node current = top;

        System.out.println("Stack elements:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        StackLinkedlist stack = new StackLinkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Top element: " + stack.peek());

        stack.display();
    }
}
