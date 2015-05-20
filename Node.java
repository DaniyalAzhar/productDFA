
public class Node {

	private Node one;
	private Node zero;
	private int finalState=0;
	static int startState=0;
	private int id=0;
	private static int flag=0;
	
	public int getId() {
		return id;
	}
	public void setId() {
		id=flag+1;
		flag++;
	}
	public Node(){
		setId();
	}
	public int getFinalState() {
		return finalState;
	}
	public void setFinalState(int finalState) {
		this.finalState = finalState;
	}
	public static int getStartState() {
		return startState;
	}
	public static void setStartState(int ss) {
		if(startState==0)
			Node.startState = ss;
		else
			System.out.println("There cannot be two starting states.");
	}
	public Node getOne() {
		return one;
	}
	public void setOne(Node one) {
		this.one = one;
	}
	public Node getZero() {
		return zero;
	}
	public void setZero(Node zero) {
		this.zero = zero;
	}
}