Elaine Philip(emp49872@uga.edu):

Contribution - Created DoublyLinkedList class with constructor, length(), insertItem(), search(), print(), reverseList(), and printReverse(). Created DoublyLinkedListDriver class with prompting user, opening file, and initilizing file values. Implemented code in the Driver class for all functions I created in the DoublyLinkedList class.

reverseList: First I checked that the list wasn't empty. Then I created a node called tempa nd assigned the currentPos as head. Next I created  a loop that will iterate through the entire list, and for each node swap the back and next until it reaches the last element. Then I assiged head to the last node. The complexity of this operation is O(n).


How to Compile: javac -cp bin/ -d bin/ src/datastr/a2/NodeType.java
                javac -cp bin/ -d bin/ src/datastr/a2/DoublyLinkedList.java
                javac -cp bin/ -d bin/ src/datastr/a2/DoublyLinkedListDriver.java
How to Run:     java -cp bin/ src/datastr/a2/DoublyLinkedListDriver.java [add input file at end] (ex: int-input.txt)
