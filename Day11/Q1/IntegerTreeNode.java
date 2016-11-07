public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int number) {
		value = number;
	}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		return checkMax(this).value;
	}
	
	public IntegerTreeNode checkMax(IntegerTreeNode node) {
		if(node.right == null) {
			return node;
		} else {
			return checkMax(node.right);
		}

	}
	
	public int getMin() {
		return checkMin(this).value;
	}
	
	public IntegerTreeNode checkMin(IntegerTreeNode node) {
		if(node.left == null) {
			return node;
		} else {
			return checkMin(node.left);
		}

	}
}	