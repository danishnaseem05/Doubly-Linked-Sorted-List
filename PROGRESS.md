SortedList Class:

- implemented the add method within the SortedList class
- implemented both remove methods within the SortedList class. The remove with the elem argument further calls the other remove by the passing in the node argument, hence making it a little bit more efficient and non-duplicated code.
- implemented the second constructor of the SortedList class.
- implemented the isEmpty method within the SortedList class.
- implemented the search method within the SortedList class.
- implemented the indexOf mehtod within the Sorted List class
- implemented the iterator method within of the SortedList class.
- created my own method of getCount (it return the private count instance variable) within the SortedList class for keeping track of the number of elements within the list, the count varible is private. It gets initialized to zero inside the default constructor, and gets set to the count of the argument list passed inside the second constructor. Later, count gets incremented inside the add method, decremented inside the remove method, and is used inside the equals method to compare the two object sizes. 
- implmented equals method within the SortedList class. (this was a challenge, but pretty much I utilized the iterator method within the SortedList class to compare the elements of each of the lists, using next method of the SortedListIterator class.  


Item Class:

- implemented the compareTo method within the Item class. 


SortedListIterator Class:

- implemented the construtor in the SortedListIterator class.
- implemented the next and hasNext methods in the SortedListIterator class.


Node Class:

- added getters and setters for the Node class. It would be efficient to change the Node class elem, next, prev variables to be private, but I left them public as we were told not to change anything above the commented line.


Main Class:

- added alot of tests within the main class
	- each with their own description provided, either by comments or inside the terminal using print statements.

- 