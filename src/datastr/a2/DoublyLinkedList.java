package datastr.a2;

public class DoublyLinkedList<T extends Comparable<T>> {
    private NodeType<T> head;
    private int length;
    private NodeType<T> currentPos;

    public DoublyLinkedList() {
        head = null;
        length = 0;
    } // constructor


    public int length() {
        int length = 1;
        if (head == null) {
            length = 0;
        } else {
            NodeType<T> tempCount = new NodeType<T>();
            tempCount = head;
            // temp node to search through list

            while (tempCount.next != null) {
                tempCount = tempCount.next;
                length++;
            } // while
            // finds length
        } // if
        return length;
    } // getLength

    public void insertItem(T item) {
        NodeType<T> node = new NodeType<T>();
        node.info = item;

        if (head != null && search(item) > 0) {
            System.out.println("Item already exists");
        } else if (head == null || item.compareTo(head.info) < 0) { // empty list or add to front
            node.next = head;
            if (head != null) {
                head.back = node;
            } // if
            // when adding to front
            node.back = null;
            head = node;
        } else { // general case
            currentPos = head;
            while (currentPos.next != null && (node.info.compareTo(currentPos.next.info) > 0)) {
                currentPos = currentPos.next;
            } // while
            // finds where to insert new node

            if (currentPos.next != null) {
                currentPos.next.back = node;
            } // if
            // when adding to middle
            node.next = currentPos.next;
            currentPos.next = node;
            node.back = currentPos;
            // inserts the new node
        } // if
    } // insertItem
    // ADD EMPTY CHECK AFTER DELETE IS MADE


/**

    public void deleteItem(T item){
        currentPos = head;
        if (head == null) { // empty check
            System.out.println("You cannot delete from an empty list");
            return;
        }
        if (this.length() == 1) { // one item check
            if (currentPos.info.compareTo(item) == 0) {
                head = null;
            } // if
            // makes list empty
        } else if (this.search(item) <= 0) {
            System.out.println("The item is not present in the list");
            return;
        } else if (currentPos.info.compareTo(item) == 0) { // first item check
            head = currentPos.next;
            if(head != null) {
                head.back = null;
            }
        }
        //   while (currentPos != null && currentPos.next.info.compareTo(item) == 0) {
        //  currentPos = currentPos.next;
        // }

        if ((this.length() > 1) && currentPos.next == null ) { //last item check
            currentPos = null;
            //currentPos.back.next = null;
        }
        else { // general case
            while (currentPos.next != null) {
// && currentPos.next.info.compareTo(item) == -1
                if (currentPos.next.info.compareTo(item) == 0) {
                    currentPos.next = currentPos.next.next;

//                    currentPos.back.next = currentPos.next;
//                    currentPos.next.back = currentPos.back;
                    break;
                } else {
                    currentPos = currentPos.next;
                } // if
            } // while
        } // if
        length--;
    } // deleteItem
*/

    public void deleteItem(T item) {
        currentPos = head;
        if (head == null) { // empty check
            System.out.println("You cannot delete from an empty list");
            return;
        }

        if (currentPos.info.compareTo(item) == 0) { // first item check
            head = currentPos.next;
            if (head != null) {
                head.back = null;
            }
            length--;
            return;
        }
        currentPos = head.next;
        while (currentPos != null && !currentPos.info.equals(item)) {
            currentPos = currentPos.next;
        }
        if (currentPos == null) { // item not found check
            System.out.println("The item is not present in the list");
            return;
        }
        currentPos.back.next = currentPos.next;
        if (currentPos.next != null) {
            currentPos.next.back = currentPos.back;
        }
        length--;
    }

/**
    public void deleteItem(T item) {
        currentPos = head;

        if (head == null) { //empty check
            System.out.println("You cannot delete from an empty list");
            //return;
        }

        while (currentPos != null && currentPos.next.info.compareTo(item) == 0) {
            currentPos = currentPos.next;
        }

        if (this.search(item) <= 0) {
            System.out.println("The item is not present in the list");
//            return;
        }

        if (currentPos.back == null) { // Deleting the head node
            head = currentPos.next;
            if (head != null) {
                head.back = null;
            }
        } else if (currentPos.next == null) { // Deleting the tail node
            currentPos.back.next = null;
        } else { // Deleting a node in between
            currentPos.back.next = currentPos.next;
            currentPos.next.back = currentPos.back;
        }

        length--;
    }
*/


        public int search(T item) {
        if (this.head == null) { // empty check
            return 0;
        } else {
            int index = 1;
            NodeType<T> temp = new NodeType<T>();
            temp = head;
            while (temp.next != null) {
                if (temp.info.compareTo(item) == 0) {
                    break;
                } else {
                    temp = temp.next;
                    index++;
                } // if
            } // while
            // finds index of item

            if (index == this.length()) { // if at end or not present
                if (temp.info.compareTo(item) ==  0) { // at end
                    return index;
                } else { // not present
                    return -1;
                } // if
            } else { // if present
                return index;
            } // if
        } // if
        // returns index of item if present
    } // search

    public void print() {
        NodeType<T> temp = new NodeType<T>();
        temp = head;
        if (head == null) { // empty
            System.out.println("");
        } else {
            while (temp.next != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            } // while
            System.out.println(temp.info  + " ");
        } // if
        currentPos = head;
    } // print

    public void reverseList() {
        if (head != null) { // empty list check
            NodeType<T> temp = new NodeType<T>();
            currentPos = head;

            while (temp != null) {
                temp = currentPos.next;
                currentPos.next = currentPos.back;
                currentPos.back = temp;
                if (temp != null) {
                    currentPos = temp;
                } // if
            } // while
            // swaps back and next for each node in list
            head = currentPos; // assigns new node for head
        } // if
    } // reverse

    public void printReverse() {
        NodeType<T> temp = new NodeType<T>();
        temp = head;
        if (head == null) { // empty
            System.out.println("");
        } else { // general case
            while (temp.next != null) {
                temp = temp.next;
            } // while
            // traverses to end of list

            System.out.print("The reverse list is: ");
            while (temp.back != null) {
                System.out.print(temp.info  + " ");
                temp = temp.back;
            } // while
            System.out.println(temp.info  + " ");
        } // if
        currentPos = head;
    } // printReverse



} // SortedLinkedList
