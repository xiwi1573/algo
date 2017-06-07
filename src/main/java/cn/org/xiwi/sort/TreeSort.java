package cn.org.xiwi.sort;

import java.util.Arrays;

public class TreeSort {
	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
		}
	}

	// Stores inoder traversal of the BST
	// in arr[]
	static void storeSorted(Node root, int arr[], int i) {
		if (root != null) {
			System.out.println("storeSorted i="+i+",root="+root);
			storeSorted(root.left, arr, i);
			arr[i++] = root.value;
			storeSorted(root.right, arr, i);
		}
	}

	/*
	 * A utility function to insert a new Node with given key in BST
	 */
	static Node insert(Node node, int key) {
		/* If the tree is empty, return a new Node */
		if (node == null)
			return new Node(key);

		/* Otherwise, recur down the tree */
		if (key < node.value) {
			node.left = insert(node.left, key);
		} else if (key > node.value) {
			node.right = insert(node.right, key);
		}

		/* return the (unchanged) Node pointer */
		return node;
	}

	// This function sorts arr[0..n-1] using Tree Sort
	public static void treeSort(int arr[], int n) {
		Node root = null;

		// Con the BST
		root = insert(root, arr[0]);
		for (int i = 1; i < n; i++) {
			insert(root, arr[i]);
		}
		// Store inoder traversal of the BST
		// in arr[]
		int i = 0;
		storeSorted(root, arr, i);
	}

	//TODO 还未写完，有bug
	public static void main(String[] args) {
		// create input array
		int arr[] = { 5, 4, 7, 2, 11 };
		int n = arr.length;
		System.out.println("origin array = " + Arrays.toString(arr));
		treeSort(arr, n);
		System.out.println("sorted array = " + Arrays.toString(arr));
	}
}
