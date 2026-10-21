/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

/**
 *
 * @author admin
 */
public class queueArray {
     private String[] queue = new String[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(String value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }

        String value = queue[front];
        front++;
        size--;

        return value;
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();

        q.enqueue("Maria");
        q.enqueue("John");
        q.enqueue("Peter");
        q.enqueue("Anna");
        q.enqueue("Mark");

        q.enqueue("Sofia"); // Queue is full!

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.dequeue()); // Queue is empty!
    }
}

