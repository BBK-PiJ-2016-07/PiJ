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
		if(right == null) {
			return value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		if(left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}

	public String toString() {
		String composedString = "[" + value;

		composedString += " L";
		if(left != null) {
			//composedString += " [";
			composedString += left.toString() ;
			//composedString += "]" ;
		} else {
			composedString += "[]" ;
		}

		composedString += " R";
		if(right != null) {
			// composedString += "[";
			composedString += right.toString();
			// composedString += "]" ;
		} else {
			composedString += "[]";
		}
		
		composedString += "]";
		return composedString;
		
	}
	
	public String toString2() {
		String composedString = "[" + value;

		if(left != null) {
			//composedString += " [";
			composedString += left.toString2() ;
			
			//composedString += "]" ;
		}

		
		if(right != null) {
			// composedString += "[";
			composedString += right.toString2();
			// composedString += "]" ;
		}
		
		composedString += "]";
		return composedString;
		
	}
}	