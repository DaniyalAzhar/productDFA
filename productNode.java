
public class productNode {

	private int firstComp;
	private int secondComp;
	private productNode one;
	private productNode zero;
	private int finalState=0;
	private int startState=0;
	static int flag=0;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public productNode getOne() {
		return one;
	}
	public void setOne(productNode one) {
		this.one = one;
	}
	public productNode getZero() {
		return zero;
	}
	public void setZero(productNode zero) {
		this.zero = zero;
	}
	public int getFinalState() {
		return finalState;
	}
	public void setFinalState(int finalState) {
		this.finalState = finalState;
	}
	public int getStartState() {
		return startState;
	}
	public void setStartState(int startState) {
		if(flag==0)
			this.startState = startState;
		else
			System.out.println("There cannot be two starting states.");
	}
	public static int getFlag() {
		return flag;
	}
	public static void setFlag(int flag) {
		productNode.flag = flag;
	}
	public productNode(){}
	public productNode(int a, int b){
		setFirstComp(a);
		setSecondComp(b);
	}
	public int getFirstComp() {
		return firstComp;
	}
	public void setFirstComp(int firstComp) {
		this.firstComp = firstComp;
	}
	public int getSecondComp() {
		return secondComp;
	}
	public void setSecondComp(int secondComp) {
		this.secondComp = secondComp;
	}
}