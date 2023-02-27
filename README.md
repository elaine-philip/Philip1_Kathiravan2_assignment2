Elaine Philip(emp49872@uga.edu):

Contribution - Created DoublyLinkedList class with constructor, length(), insertItem(), search(), print(), reverseList(), and printReverse(). Created DoublyLinkedListDriver class with prompting user, opening file, and initilizing file values. Implemented code in the Driver class for all functions I created in the DoublyLinkedList class.

reverseList: First I checked that the list wasn't empty. Then I created a node called temp and assigned the currentPos as head. Next I created a loop that will iterate through the entire list, and for each node swap the back and next until it reaches the last element. Then I assiged head to the last node. The complexity of this operation is O(n).

Kavya Kathiravan(krk08454@uga.edu):

Contribution - Created and implemented deleteSubsection, swapAlternate, and delete functions in DoublyLinkedList and DoublyLinkedListDriver.

deleteSubsection: The deleteSubsection method takes in two bounds as input and deletes all the nodes in a doubly linked list whose values fall within that range. It traverses the linked list and checks if each node's value is within the specified range. If it is, then the node is deleted from the linked list. The method has a time complexity of O(n), where n is the number of nodes in the linked list. In the worst case, if all nodes in the list fall within the range to be deleted, the method would need to traverse the entire list and delete all nodes, resulting in a time complexity of O(n), where n is the length of the list. However, if only a few nodes need to be deleted, the time complexity would be less than O(n).

swapAlternate: The swapAlternate() method swaps the positions of every two adjacent nodes in a linked list. It does this by traversing the list and swapping each pair of adjacent nodes, and updating the necessary pointers. The swapAlternate method swaps adjacent pairs of nodes in a linked list. It does so by iterating through the list, swapping each pair of nodes, and updating the links between them and their surrounding nodes. Specifically, for each pair of adjacent nodes, it swaps their next and back pointers, sets the next pointer of the previous node to the second node, and sets the back pointer of the second node to the previous node. Finally, it updates the head pointer of the list if the first pair of nodes was swapped, and resets the back pointer of the head node to null. The time complexity of this method is O(n), where n is the number of nodes in the linked list.


How to Compile: javac -cp bin/ -d bin/ src/datastr/a2/NodeType.java
                javac -cp bin/ -d bin/ src/datastr/a2/DoublyLinkedList.java
                javac -cp bin/ -d bin/ src/datastr/a2/DoublyLinkedListDriver.java

How to Run:     java -cp bin/ src/datastr/a2/DoublyLinkedListDriver.java [add input file at end] (ex: int-input.txt)
