//created by Vadim Peregud
package by.academy.homework5;

import java.util.Scanner;

public class Solution {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }

    }

    public static void printDoublyLinkedMy(DoublyLinkedList list) {
        DoublyLinkedListNode current = list.head;
        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }
        System.out.println();
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }

    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode tail) {
        if (tail == null) return null;
        DoublyLinkedListNode currentNode = tail;

        while (currentNode != null) {
            DoublyLinkedListNode prev = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = prev;
            currentNode = currentNode.next;
        }

        return tail;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        DoublyLinkedList llist = new DoublyLinkedList();
        System.out.println("input quantity of items");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("input the items separated by a space");
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        System.out.println("original list");
        printDoublyLinkedMy(llist);
        DoublyLinkedListNode llist1 = reverse(llist.tail);
        System.out.println("reverse list");
        printDoublyLinkedList(llist1, " ");

        scanner.close();
    }
}



