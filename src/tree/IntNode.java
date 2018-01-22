package tree;

public class IntNode {
	
	private int value;
	private IntNode left;
	private IntNode right;
	
	public IntNode() {
		
	}

	public IntNode(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public IntNode getLeft() {
		return left;
	}

	public void setLeft(IntNode left) {
		this.left = left;
	}

	public IntNode getRight() {
		return right;
	}

	public void setRight(IntNode right) {
		this.right = right;
	}
	
}
