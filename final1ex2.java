import java.io.IOException;

class Node {
	public int num;
	public Node leftChild;
	public Node rightChild;
}

class Tree {
	Node root;
	public Tree() {
		root = null;
	}
	public void insert(int num, Node root) {
		Node newNode = new Node();
		newNode.num = num;
		if(root == null) {
			root = newNode;
		}
		else {
			Node current = root;
			Node parent = root;
			while(true) {
				if(num <= root.num) {
					current = current.leftChild;
					if(root.leftChild != null) {
						insert(num, root.leftChild);
					}
					else {
						parent.leftChild = newNode;
						return;
					}
				}
				else {
					current = current.rightChild;
					if(root.rightChild != null) {
						insert(num, root.rightChild);
					}
					else {
						parent.rightChild = newNode;
					}
				}
			}
		}	
	}
	public void inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.num + " ");
			inOrder(localRoot.rightChild);
		}
	}
}

public class final1ex2 {
	public static void main(String[] args) throws IOException {
		int[] arr = {3, 12, 44, 23, 6, 1, 90};
		Tree theTree = new Tree();

		for(int i = 0; i < arr.length; i++) {
			theTree.insert(i, theTree.root);
		}
		theTree.inOrder(theTree.root);
	}
}