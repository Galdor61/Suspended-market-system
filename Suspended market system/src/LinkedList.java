
public class LinkedList implements LinkedListTest {
	private int size;
	private Node head;
	private Node tail;

	public LinkedList() {
		clean();
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String isEmpyt() {
		if (size == 0)
			return "Your cart is empty.";
		else
			return "Your cart is full.";
	}

	@Override
	public void clean() {
		this.size = 0;
		head = null;
		tail = null;
	}

	@Override
	public void addFirst(int a) {
		Node newNode = new Node();
		newNode.data = a;
		
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	@Override
	public void addLast(int a) {
		Node newNode = new Node();
		newNode.data = a;
		
		if (size==0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;

	}

	@Override
	public void addIndex(int index, int a) {
		
		if (index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0) {
			addFirst(a);
		} if (index == size) {
			addLast(a);
		} else {
			Node newNode = new Node();
			newNode.data = a;
			
			Node onceki = head;
			Node sonraki = head;
			for (int i = 0; i < index - 1; i++) {
				onceki = onceki.next;
			}
			sonraki = onceki.next;
			
			onceki.next = newNode;
			newNode.next = sonraki;
			size++;
		}
		

	}
	public int printIndex(int index) {
		if (size==0) {
			System.out.println("Empty List.");
			return -1;
		}
		Node onceki = head;
		for (int i = 0; i < index - 1; i++) {
			onceki = onceki.next;
		}
		
		Node suanki = onceki.next;
		Node sonraki = suanki.next;
		
		onceki.next = sonraki;
		
		System.out.println(suanki.data);
		return suanki.data;
	}

	@Override
	public int removeFisrt() {
		if (size==0)
			throw new RuntimeException("Could not remove item from empty list");

		int a = head.data;

		if (size == 1) {
			clean();
			return a;
		}

		head = head.next;

		size--;

		return a;

	}

	@Override
	public int removeLast() {
		if (size==0)
			throw new RuntimeException("Could not remove item from empty list");
		int a = tail.data;

		if (size == 1) {
			clean();
			return a;
		} else {

			Node parentNode = head;
			while (parentNode.next != tail) {
				parentNode = parentNode.next;
			}
			tail = parentNode;
			tail.next = null;

			size--;

			return a;
		}
	}

	@Override
	public int removeIndex(int index) {
		if (size==0)
			throw new RuntimeException("Could not remove item from empty list");
		
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0) {
			return removeFisrt();
		}
		
		if (index == size  - 1) {
			return removeLast();
		}
		
		Node onceki = head;
		for (int i = 0; i < index - 1; i++) {
			onceki = onceki.next;
		}
		
		Node suanki = onceki.next;
		Node sonraki = suanki.next;
		
		onceki.next = sonraki;
		
		size--;

		return suanki.data;
	}

	@Override
	public boolean containts(int a) {
		if (size==0)
			return false;

		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == a) {
				return true;
			}
			currentNode = currentNode.next;

		}

		return false;
	}
	
	@Override
	public void printList() {
		if (size==0) {
			System.out.println("Empty List.");
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
			
		}		 
		System.out.println();
	}

	static class Node {

		int data;

		Node next;

	}

}
