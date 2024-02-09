
import java.util.*;
public class LinkedList {

    private static final int MAX_SIZE = 100; // Maximum size of the linked list

    private int[] elements; // Array to store elements
    private int[] nextIndex; // Array to store the next index for each element
    private int head; // Index of the head of the linked list
    private int size; // Number of elements in the linked list

    public LinkedList() {
        elements = new int[MAX_SIZE];
        nextIndex = new int[MAX_SIZE];
        head = -1; // Initialize head to -1 (empty list)
        size = 0;
    }

    public void addElement(int value) {
        if (size == MAX_SIZE) {
            System.out.println("Linked list is full. Cannot add more elements.");
            return;
        }

        elements[size] = value;
        nextIndex[size] = head;
        head = size;
        size++;
    }

    public void displayList() {
        int current = head;
        while (current != -1) {
            System.out.print(elements[current] + " ");
            current = nextIndex[current];
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Adding elements to the linked list
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(4);


        // Displaying the linked list
        System.out.println("Linked List: ");
        linkedList.displayList();
    }
}
