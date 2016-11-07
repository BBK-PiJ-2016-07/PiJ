public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		IntegerTreeNode myNode = new IntegerTreeNode(1);
		int[] numbers = new int[] {1,2,3,4,5,1,5,2,5,3,61,5,25,32534,5235,646,46,46,464,64,623,66,2};
		
		for(int number: numbers) {
			myNode.add(number);
		}
		
		/* 
		myNode.add(3);
		myNode.add(5);
		myNode.add(6);
		myNode.add(9);
		myNode.add(8);
		myNode.add(11);
		myNode.add(21);
		myNode.add(41);
		myNode.add(15);
		myNode.add(7);
		myNode.add(20); */
		System.out.println(myNode.getMax());
		System.out.println(myNode.getMin());
	}
	

}