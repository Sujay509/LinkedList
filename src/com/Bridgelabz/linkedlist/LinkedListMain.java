package com.Bridgelabz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 System.out.println("Welcome to linked list problem");
	        Scanner sc = new Scanner(System.in);

	        int ch;
	        do{
	            System.out.println("\n0.Exit \n1.Add node at start \n2.Add node at end \n");
	            ch = sc.nextInt();
	            switch (ch){
	                case 0:
	                    System.exit(0);
	                    break;
	                case 1:
	                    LinkedList linkedList = new LinkedList();
	                    linkedList.addNodeAtStart(70);
	                    linkedList.addNodeAtStart(30);
	                    linkedList.addNodeAtStart(56);
	                    linkedList.displayLinkedList();
	                    break;
	                case 2:
	                    LinkedList linkedList1 = new LinkedList();
	                    linkedList1.addNodeAtEnd(56);
	                    linkedList1.addNodeAtEnd(30);
	                    linkedList1.addNodeAtEnd(70);
	                    linkedList1.displayLinkedList();
	                    break;
	                default:
	                    System.out.println("Invalid input!");

	            }

	        }while (ch != 0);

	    }
}
