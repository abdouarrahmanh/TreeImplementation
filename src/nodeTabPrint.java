
public class nodeTabPrint implements TraverseOperation {

    public void operate(Node node) {
        String output="";
                for(int i = 0; i<node.getNodeLevel();i++){
                    output= output +"\t";
                }
        output = output+ node.getName();
        System.out.println(output);
    }
}
