package resortedlistfilesjava;

public class Item implements Comparable<Item> {

	private Integer val;

	public Item(int val) {
		this.val = val;
	}

	
	public Item(Item it) {
		this.val = it.val;
	}

	@Override
	public String toString() {
		return val.toString();
	}

	/*
	 * Override compare to provide comparison results.
	 */
	@Override
	public int compareTo(Item arg0) {
		// TODO
		if(this.val < arg0.val) return -1;
		else if(this.val == arg0.val) return 0;
		else return 1;
	}

}