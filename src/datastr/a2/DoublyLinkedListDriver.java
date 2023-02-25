package datastr.a2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {

        try {

            System.out.print("Enter list type (i - int, d - double, s - string): ");
            Scanner scanType = new Scanner(System.in);
            String listType = scanType.next();

            boolean isInt = false;
            boolean isDouble = false;
            boolean isString = false;


            if (listType.equals("i")) {
                isInt = true;
            } else if (listType.equals("d")) {
                isDouble = true;
            } else if (listType.equals("s")) {
                isString = true;
            } // if
            // finds list type from user

            File fileName = new File(args[0]);
            Scanner scan = new Scanner(fileName);

            DoublyLinkedList<Integer> listI = new DoublyLinkedList<Integer>();
            DoublyLinkedList<Double> listD = new DoublyLinkedList<Double>();
            DoublyLinkedList<String> listS = new DoublyLinkedList<String>();

            DoublyLinkedList<Integer> listICopy = new DoublyLinkedList<Integer>();
            DoublyLinkedList<Double> listDCopy = new DoublyLinkedList<Double>();
            DoublyLinkedList<String> listSCopy = new DoublyLinkedList<String>();

            if (isInt) {
                while(scan.hasNextInt()) {
                    int itemInt = scan.nextInt();
                    listI.insertItem(itemInt);
                    listICopy.insertItem(itemInt);
                } // while
            } else if (isDouble) {
                while(scan.hasNextDouble()) {
                    double itemDouble = scan.nextDouble();
                    listD.insertItem(itemDouble);
                    listDCopy.insertItem(itemDouble);
                } // while
            } else if (isString) {
                while(scan.hasNext()) {
                    String itemString = scan.next();
                    listS.insertItem(itemString);
                    listSCopy.insertItem(itemString);
                } // while
            } // if
            // adds values from input file to list

/**
            if (isInt) {

            } else if (isDouble) {

            } else if (isString) {

            } // if

*/

            String command = "";
            System.out.print("Enter a command: ");

            while (!command.equals("q")) {
                boolean invalid = false;
                Scanner scanCom  = new Scanner(System.in);
                command = scanCom.next();
                // user input

                if (command.equals("p")) {
                    System.out.print("The list is: ");
                    if (isInt) {
                        listI.print();
                    } else if (isDouble) {
                        listD.print();
                    } else if (isString) {
                        listS.print();
                    } // if
                    // prints list
                } else if (command.equals("l")) {
                    System.out.print("The length of the list is ");
                    if (isInt) {
                        System.out.println(listI.length());
                    } else if (isDouble) {
                        System.out.println(listD.length());
                    } else if (isString) {
                        System.out.println(listS.length());
                    } // if
                } else if (command.equals("i")) {
                    System.out.print("The list is : ");

                    if (isInt) {
                        listI.print();
                        System.out.print("Enter a number to insert: ");
                        scanCom = new Scanner(System.in);
                        int val = scanCom.nextInt();
                        listI.insertItem(val);
                        System.out.print("The list is : ");
                        listI.print();
                        listI.printReverse();
                    } else if (isDouble) {
                        listI.print();
                        System.out.print("Enter a number to insert: ");
                        scanCom = new Scanner(System.in);
                        double val = scanCom.nextDouble();
                        listD.insertItem(val);
                        System.out.print("The list is : ");
                        listD.print();
                        listD.printReverse();
                    } else if (isString) {
                        listS.print();
                        System.out.print("Enter a number to insert: ");
                        scanCom = new Scanner(System.in);
                        String val = scanCom.next();
                        listS.insertItem(val);
                        System.out.print("The list is : ");
                        listS.print();
                        listS.printReverse();
                     } // if
                    // prints original list, inserts item, and prints new list
                } else if (command.equals("d")) {
                    System.out.print("The list is : ");

                    if (isInt) {
                        listI.print();
                        System.out.print("Enter a number to delete: ");
                        scanCom = new Scanner(System.in);
                        int val = scanCom.nextInt();
                        listI.deleteItem(val);
                        System.out.print("The list is : ");
                        listI.print();
                        listI.printReverse();
                    } else if (isDouble) {
                        listI.print();
                        System.out.print("Enter a number to delete: ");
                        scanCom = new Scanner(System.in);
                        double val = scanCom.nextDouble();
                        listD.deleteItem(val);
                        System.out.print("The list is : ");
                        listD.print();
                        listD.printReverse();
                    } else if (isString) {
                        listS.print();
                        System.out.print("Enter a number to delete: ");
                        scanCom = new Scanner(System.in);
                        String val = scanCom.next();
                        listS.deleteItem(val);
                        System.out.print("The list is : ");
                        listS.print();
                        listS.printReverse();
                     } // if
                    // prints original list, deletes item, and prints new list
                } else if (command.equals("b")) {
                    System.out.print("The list is : ");

                    if (isInt) {
                        listI.print();
                        System.out.print("Enter the lower bound: ");
                        scanCom = new Scanner(System.in);
                        int lower = scanCom.nextInt();
                        System.out.print("Enter the upper bound: ");
                        scanCom = new Scanner(System.in);
                        int upper = scanCom.nextInt();
                        System.out.print("The original list: ");
                        if(listI.length() == 0) {
                            listI.print();
                        } else {
                            listICopy.print();
                        }

                        listI.deleteSubsection(lower, upper);
                        System.out.print("The modified list: ");
                        listI.print();
                        listI.printReverse();
                    } else if (isDouble) {
                        listI.print();
                        System.out.print("Enter the lower bound: ");
                        scanCom = new Scanner(System.in);
                        double lower = scanCom.nextDouble();
                        System.out.print("Enter the upper bound: ");
                        scanCom = new Scanner(System.in);
                        double upper = scanCom.nextDouble();
                        System.out.print("The original list: ");
                        if(listD.length() == 0) {
                            listD.print();
                        } else {
                            listDCopy.print();
                        }
                        listD.deleteSubsection(lower, upper);
                        System.out.print("The modified list: ");
                        listD.print();
                        listD.printReverse();
                    } else if (isString) {
                        listI.print();
                        System.out.print("Enter the lower bound: ");
                        scanCom = new Scanner(System.in);
                        String lower = scanCom.next();
                        System.out.print("Enter the upper bound: ");
                        scanCom = new Scanner(System.in);
                        String  upper = scanCom.next();
                        System.out.print("The original list: ");
                        if(listS.length() == 0) {
                            listS.print();
                        } else {
                            listSCopy.print();
                        }
                        listS.deleteSubsection(lower, upper);
                        System.out.print("The modified list: ");
                        listS.print();
                        listS.printReverse();
                     } // if
                    // prints original list, deletes subsection, and prints new list
                } else if (command.equals("r")) {
                    System.out.print("The original list: ");
                    if (isInt) {
                        listI.print();
                        System.out.print("The reversed list: ");
                        listI.reverseList();
                        listI.print();
                    } else if (isDouble) {
                        listD.print();
                        System.out.print("The reversed list: ");
                        listD.reverseList();
                        listD.print();
                    } else if (isString) {
                        listS.print();
                        System.out.print("The reversed list: ");
                        listS.reverseList();
                        listS.print();
                    } // if
                } else if (command.equals("t")) {

                    if (isInt) {
                        listI.printReverse();
                    } else if (isDouble) {
                        listD.printReverse();
                    } else if (isString) {
                        listS.printReverse();
                    } // if

                } else if (command.equals("q")) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                } else {
                    invalid = true;
                } // if
                // all command cases

                if (invalid) {
                    System.out.print("Invalid command, try again: ");
                } else if (!command.equals("q")){
                    System.out.print("Enter a command: ");
                } // if
                //prompting user

            } // while
            // loop to prompt user

        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        } // try
    } // main
} // LinkedListDriver





/**

   } else if (command.equals("s")) {

                } else if (command.equals("d")) {
                    System.out.print("Enter a number to delete: ");
                    scanCom = new Scanner(System.in);
                    ItemType deleteVal = new ItemType();
                    deleteVal.initialize(scanCom.nextInt());
                    // asks and stores search value

                    System.out.print("Original list : ");
                    list.print();
                    // prints original list

                    list.deleteItem(deleteVal); // inserts insert Val
                    System.out.print("New list : ");
                    list.print();
                    // prints new list
                } else if (command.equals("n")) {
                    list.getNextItem();
                } else if (command.equals("r")) {
                    list.resetList();
                } else if (command.equals("a")) {
                    System.out.print("Original list : ");
                    list.print();
                    // prints original list

                    list.deleteAlt();
                    System.out.print("New list : ");
                    list.print();
                    // prints new list
                } else if (command.equals("m")) {
                    //Merge a list to the original list
                    System.out.print("Enter the length of the new list: ");
                    scanCom = new Scanner(System.in);
                    int num = scanCom.nextInt();
                    int count = 0;
                    int [] values= new int[num];
                    System.out.print("Enter the numbers ");
                    while(scanCom.hasNext()) {
                        values[count] = scanCom.nextInt();
                        count++;
                        if (count == num) break;
                    }
                    SortedLinkedList list2 = new SortedLinkedList();
                    for (int i = 0; i < values.length; i++) {
                        ItemType item = new ItemType();
                        item.initialize(values[i]);
                        list2.insertItem(item);
                    } // for

                    NodeType head = list.getHead();
                    System.out.print("list 1: ");
                    list.print();
                    System.out.print("list 2: ");
                    list2.print();
                    head = SortedLinkedList.sortedMergeNoDupe(list.getHead(), list2.getHead());
                    System.out.print("Merged list: ");
                    list.print();

                } else if (command.equals("t")) {
                    System.out.print("Enter the length of the new list: ");
                    scanCom = new Scanner(System.in);
                    int num = scanCom.nextInt();
                    int count = 0;
                    int [] values= new int[num];
                    System.out.print("Enter the numbers: ");
                    while(scanCom.hasNext()) {
                        values[count] = scanCom.nextInt();
                        count++;
                        if (count == num) break;
                    }
                    SortedLinkedList list2 = new SortedLinkedList();
                    for (int i = 0; i < values.length; i++) {
                        ItemType item = new ItemType();
                        item.initialize(values[i]);
                        list2.insertItem(item);
                    }
                    System.out.print("list 1: ");
                    list.print();
                    System.out.print("list 2: ");
                    list2.print();
                    System.out.println("Intersection of lists: " + list.intersectionList(list2));
*/
