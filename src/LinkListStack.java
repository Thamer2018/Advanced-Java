public class LinkListStack {
	public static void main(String[] args) {

		StackList stack = new StackList();
		System.out.println("--Pushing--");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.display();
		System.out.println("--Popping--");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();

	}
}

class Node {
	private int element;
	private Node suivant;

	// constructeurs
	public Node(int e) {
		element = e;
		suivant = null;
	}

	public int getData() {
		return element;
	}

	public void setData(int data) {
		this.element = data;
	}

	public Node getNext() {
		return suivant;
	}

	public void setNext(Node next) {
		this.suivant = next;
	}

}

class StackList {
	private Node sommet;
	private int nbrelement;

	public StackList() {
		nbrelement = 0;
		sommet = null;
	}

	public void push(int data) {
		Node temp = new Node(data);
		if (sommet == null) {
			sommet = temp;
		} else {
			temp.setNext(sommet);
			sommet = temp;
		}
		nbrelement++;
	}

	public int pop() {
		Node temp = sommet;
		int data = sommet.getData();
		sommet = sommet.getNext();
		temp = null;
		nbrelement--;
		return data;
	}

	public void display() {
		Node temp = sommet;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			while (temp != null) {
				System.out.print(temp.getData() + "=>");
				temp = temp.getNext();
			}
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return (sommet == null);
	}

}