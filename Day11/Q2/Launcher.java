public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		IntegerTreeNode myNode = new IntegerTreeNode(6);

		myNode.add(5);
		myNode.add(9);
		myNode.add(3);
		myNode.add(8);
		myNode.add(11);
		myNode.add(12);

		System.out.println(myNode.toString2());
	}
	

}