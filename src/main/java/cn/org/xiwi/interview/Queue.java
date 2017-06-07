package cn.org.xiwi.interview;

public class Queue {
	Node first;
	Node last;
	public void enqueue(Node node){
		if (first == null) {
			first = node;
			last = first;
		}else {
			last.next = node;
			last = node;
		}
	}
	
	public Node dequeue(){
		if (first == null) {
			return null;
		}else {
			Node temp = new Node();
			temp.value = first.value;
			first = first.next;
			return temp;
		}
	}
}
