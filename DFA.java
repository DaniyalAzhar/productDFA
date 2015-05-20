import java.util.Scanner;

public class DFA {

	private int numberOfNodes=0;
	Node[] nodes=new Node[2];
	public Node[] getNodes() {
		return nodes;
	}

	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}

	public DFA(){
		System.out.println("Enter the amount of nodes that you want in this DFA.");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		setNumberOfNodes(n);
		Node[] myNodes=new Node[2];
		for(int z=0;z<numberOfNodes;z++){
			myNodes[z]=new Node();
		}
		setNodes(myNodes);
		for(int i=0;i<numberOfNodes;i++){
			System.out.println("where should it go when given zero?");
			Scanner in2 = new Scanner(System.in);
			int n2 = in2.nextInt();
			nodes[i].setZero(nodes[n2-1]);
			System.out.println("where should it go when given one?");
			Scanner in3 = new Scanner(System.in);
			int n3 = in3.nextInt();
			nodes[i].setOne(nodes[n3-1]);
		}
	}
	
	public int getNumberOfNodes() {
		return numberOfNodes;
	}

	public void setNumberOfNodes(int numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
	}

	public void printDFA(){
		for(int i=0;i<numberOfNodes;i++){
			System.out.println(nodes[i].getZero()+"<--|"+i+"|-->"+nodes[i].getOne());
		}
	}
}