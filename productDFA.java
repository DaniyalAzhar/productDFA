public class productDFA {
	
	private int numberOfNodes=0;
	productNode[] pNodes=new productNode[numberOfNodes];

	public int getNumberOfNodes() {
		return numberOfNodes;
	}
	public void setNumberOfNodes(DFA a,DFA b) {
		this.numberOfNodes = a.getNumberOfNodes()*b.getNumberOfNodes();
	}
	public productNode[] getpNodes() {
		return pNodes;
	}
	public void setpNodes(productNode[] pNodes) {
		this.pNodes = pNodes;
	}
	public productDFA(){
		DFA a=new DFA();
		DFA b=new DFA();
		setNumberOfNodes(a,b);
		productNode[] pN=new productNode[numberOfNodes];
		for(int z=0;z<numberOfNodes;z++){
			pN[z]=new productNode();
		}
		setpNodes(pN);
		makeProductNodes(a,b);
		assignReferences(a,b);
		//printProductDFA();
	}
	public void makeProductNodes(DFA a,DFA b){
		int k=0;
		for(int i=0;i<a.getNumberOfNodes();i++){
			for(int j=0;j<b.getNumberOfNodes();j++){
			pNodes[k].setFirstComp(a.nodes[i].getId());
			pNodes[k].setSecondComp(b.nodes[j].getId());
			k++;
			}
		}
	}
	
	public void assignReferences(DFA a,DFA b){
		int k=0;
		int x,y,d,e;
		for(int i=0;i<a.getNumberOfNodes();i++){
			for(int j=0;j<b.getNumberOfNodes();j++){
				productNode tempNode=new productNode();
				productNode tempNode2=new productNode();
				//getZeros
				x=a.nodes[i].getZero().getId();
				y=b.nodes[j].getZero().getId();
				//getOnes
				d=a.nodes[i].getOne().getId();
				e=b.nodes[j].getOne().getId();
				//setZero & setOne
				tempNode.setFirstComp(x);
				tempNode.setSecondComp(y);
				tempNode2.setFirstComp(d);
				tempNode2.setSecondComp(e);
				pNodes[k].setZero(tempNode);
				pNodes[k].setOne(tempNode2);
				k++;
			}
		}
		for(int i=0;i<numberOfNodes;i++){
			System.out.println("|"+pNodes[i].getZero().getFirstComp()+","+pNodes[i].getZero().getSecondComp()+"|<---|"+pNodes[i].getFirstComp()+","+pNodes[i].getSecondComp()+"|---->|"+pNodes[i].getOne().getFirstComp()+","+pNodes[i].getOne().getSecondComp()+"|");
		}
	}
	public void printProductDFA(){
		for(int i=0;i<numberOfNodes;i++){
			System.out.println("|"+pNodes[i].getZero().getFirstComp()+","+pNodes[i].getZero().getSecondComp()+"|<---|"+pNodes[i].getFirstComp()+","+pNodes[i].getSecondComp()+"|---->|"+pNodes[i].getOne().getFirstComp()+","+pNodes[i].getOne().getSecondComp()+"|");
		}
	}
	public static void main(String[] args) {
		productDFA a=new productDFA();
	}
}