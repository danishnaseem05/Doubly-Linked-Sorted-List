package resortedlistfilesjava;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		/*
		 * The test here is very simple one. You need to 
		 * design your tests to test each and every functionality on 
		 * its own, then in interaction with other functionalities
		 * in the class to be confident of the correctness of your work.
		 */
		//TODO

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //

        System.out.println("\nSORTED LIST 'L' of type <Item>");

        Item _5 = new Item(5);
        Item _1 = new Item(1);
        Item _66 = new Item(66);
        Item _4 = new Item(4);
        Item _3 = new Item(3);
        Item _7 = new Item(7);
        Item _9 = new Item(9);

		SortedList<Item> L = new SortedList<>();
		System.out.println("\nIs 'L' Empty? " + L.isEmpty());

		L.add(_5);
		L.add(_1);
		L.add(_66);
		L.add(_4);
		L.add(_3);
		L.add(_7);
		L.add(_9);
		System.out.println("\nAfter adding items to 'L'. Is it Empty? " + L.isEmpty());
		System.out.println("\nprinting 'L' ...");
		L.printList();

		Iterator L_itt = L.iterator();
		System.out.println("\n'L' iterator testing ...");

		System.out.println(L_itt.hasNext());
		System.out.println(L_itt.next());
		System.out.println(L_itt.next());
		System.out.println(L_itt.next());
		System.out.println(L_itt.next());
		System.out.println(L_itt.hasNext());
		System.out.println(L_itt.next());
		System.out.println(L_itt.next());
		System.out.println(L_itt.hasNext());
		System.out.println(L_itt.next());
		System.out.println(L_itt.hasNext());

		L.remove(_5);
		System.out.println("\nremoved 5 from 'L'. now printing ...");
		L.printList();


		// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //


        System.out.println("\nSORTED LIST 'J' of type <Integer>");

		SortedList<Integer> J = new SortedList<>();
		J.add(50);
		J.add(5);
		J.add(3);
		J.add(6);
		J.add(1);
		J.add(2);
		J.add(50);

		System.out.println("\nprinting 'J' ...");
		J.printList();

        System.out.println("\nIndex of int 6 is: " + J.indexOf(6));
        System.out.println("Index of int 50 is: " + J.indexOf(50));
        System.out.println("Index of int 1 is: " + J.indexOf(1));
        System.out.println("Index of int 2 is: " + J.indexOf(2));
        System.out.println("Index of int 3 is: " + J.indexOf(3));
        System.out.println("Index of int 5 is: " + J.indexOf(5));

		J.remove(3);
		System.out.println("\nremoved 3 from 'J'. now printing ...");
		J.printList();


        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //


		System.out.println("\nSORTED LIST 'B' of type <Item> initialized by passing list 'L' as an argument");

		SortedList<Item> B = new SortedList<>(L);
		System.out.println("\nprinting 'B' ...");
		B.printList();

		System.out.println("\nIs 'B' Empty: " + B.isEmpty());

		Item _300 = new Item(300);
        Item _400 = new Item(400);
        Item _104 = new Item(104);
        Item _206 = new Item(206);
        Item _400_2 = new Item(400);
        Item _301 = new Item(301);

		B.add(_300);
        B.add(_400);
        B.add(_104);
        B.add(_206);
        B.add(_400_2); // added after _400, but since they are their vals are equal. _400_2 should be placed before _400
                       // this will be shown by looking at their indexes
        B.add(_301);

        // Item _500 not added in 'B'
        Item _500 = new Item(500);

		System.out.println("\nAfter adding items to 'B'");
		System.out.println("\nprinting 'B' ... ");
		B.printList();

		System.out.println("\nIndexes of items in 'B' ...");
		System.out.println("Index of item _300: "  + B.indexOf(_300));
        System.out.println("Index of item _400: "  + B.indexOf(_400));
        System.out.println("Index of item _400_2: "  + B.indexOf(_400_2));
        System.out.println("Index of item _104: "  + B.indexOf(_104));
        System.out.println("Index of item _206: "  + B.indexOf(_206));
        System.out.println("Index of item _301: "  + B.indexOf(_301));

        System.out.println("Index of item _500: "  + B.indexOf(_500)); // should return -1


        System.out.println("\nSearching elements in 'B' ... ");
		System.out.println("Item: _104: " + B.search(_104));
        System.out.println("Item: _400_2: " + B.search(_400_2));
        System.out.println("Item: _400: " + B.search(_400));
        System.out.println("Item: _301: " + B.search(_301));
        System.out.println("Item: _300: " + B.search(_300));

        System.out.println("Item: _500: " + B.search(_500)); // should return null


        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //


        System.out.println("\nTESTING New SORTED LISTS 'l1' and 'l2' of type <Item> for equality");

        SortedList<Item> l1 = new SortedList<>();
        SortedList<Item> l2 = new SortedList<>();

        Item _3000 = new Item(3000);
        Item _4000 = new Item(4000);
        Item _1004 = new Item(1004);
        Item _2060 = new Item(2060);
        Item _4002 = new Item(4002);
        Item _3010 = new Item(3010);

        System.out.println("\nIs 'l1' Empty? " + l1.isEmpty());
        System.out.println("Is 'l2' Empty? " + l2.isEmpty());

        System.out.println("\n'l1' Equals 'l2'? " + l1.equals(l2));
        System.out.println("'l2' Equals 'l1'? " + l2.equals(l1));
        System.out.println("\n'l1' Equals 'l1'? " + l1.equals(l1));
        System.out.println("'l2' Equals 'l2'? " + l2.equals(l2));

        l1.add(_3000);
        l1.add(_4000);
        l1.add(_1004);
        l1.add(_2060);
        l1.add(_4002);
        l1.add(_3010);

        l2.add(_3000);
        l2.add(_4000);
        l2.add(_1004);
        l2.add(_2060);
        l2.add(_4002);
        l2.add(_3010);

        System.out.println("\nAfter adding same items to both 'l1' and 'l2' ... ");

        System.out.println("\nIs 'l1' Empty? " + l1.isEmpty());
        System.out.println("Is 'l2' Empty? " + l2.isEmpty());

        System.out.println("\n'l1' Equals 'l2'? " + l1.equals(l2));
        System.out.println("'l2' Equals 'l1'? " + l2.equals(l1));
        System.out.println("\n'l1' Equals 'l1'? " + l1.equals(l1));
        System.out.println("'l2' Equals 'l2'? " + l2.equals(l2));

        System.out.println("\nprinting items of 'l1' ... ");
        l1.printList();
        System.out.println("\nprinting items of 'l2' ... ");
        l2.printList();

        System.out.println("\nAdding _40 to 'l1' ... ");
        Item _40 = new Item(40);
        l1.add(_40);
        System.out.println("\nNumber of items in 'l1': " + l1.getCount());
        System.out.println("Number of items in 'l2': " + l2.getCount());

        System.out.println("\n'l1' Equals 'l2'? " + l1.equals(l2));
        System.out.println("'l2' Equals 'l1'? " + l2.equals(l1));

        System.out.println("\nRemoved _4000 from 'l1' ... ");
        l1.remove(_4000);
        System.out.println("\n'l1' Equals 'l2'? " + l1.equals(l2));
        System.out.println("'l2' Equals 'l1'? " + l2.equals(l1));
        System.out.println("\nNumber of items in 'l1': " + l1.getCount());
        System.out.println("Number of items in 'l2': " + l2.getCount());

        System.out.println("\nprinting items of 'l1' ... ");
        l1.printList();
        System.out.println("\nprinting items of 'l2' ... ");
        l2.printList();

        System.out.println("\nRemoved _4000 from 'l2' ... ");
        l2.remove(_4000);
        System.out.println("Added _40 to 'l2'");
        l2.add(_40);

        System.out.println("\nprinting items of 'l1' ... ");
        l1.printList();
        System.out.println("\nprinting items of 'l2' ... ");
        l2.printList();

        System.out.println("\n'l1' Equals 'l2'? " + l1.equals(l2));
        System.out.println("'l2' Equals 'l1'? " + l2.equals(l1));

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //

	}
}
