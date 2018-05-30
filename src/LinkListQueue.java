public class LinkListQueue {
	private Node debut;
	private Node fin;
	private int currentSize; // number of items

	// class to define linked node
	private class Node {
		int data;
		Node next;
	}

	// Zero argument constructor
	public LinkListQueue() {
		debut = null;
		fin = null;
		currentSize = 0;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	// Remove item from the beginning of the list.
	public int dequeue() {
		int data = debut.data;
		debut = debut.next;
		if (isEmpty()) {
			fin = null;
		}
		currentSize--;
		System.out.println(data + " removed from the queue");
		return data;
	}

	// Add data to the end of the list.
	public void enqueue(int data) {
		Node oldfin = fin;
		fin = new Node();
		fin.data = data;
		fin.next = null;
		if (isEmpty()) {
			debut = fin;
		} else {
			oldfin.next = fin;
		}
		currentSize++;
		System.out.println(data + " added to the queue");
	}

}