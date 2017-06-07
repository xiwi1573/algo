package cn.org.xiwi.interview;

public class GraphNode {
	public int val;

	public GraphNode next;

	public GraphNode[] neighbors;

	public boolean visited;

	public GraphNode(int x) {
		val = x;
	}

	public GraphNode(int x, GraphNode[] n) {
		val = x;
		neighbors = n;
	}
}
