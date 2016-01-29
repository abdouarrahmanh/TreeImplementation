import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyNode implements Node {
    int nodeLevel;
    String name;

    public List<Node> nodeParents = new ArrayList<>();
    public List<Node> nodeChildren = new ArrayList<>();

    public MyNode(String Name) {
        name = Name;
    }

    public MyNode(String Name, int Level) {
        name = Name;

        nodeLevel = Level;
    }

    public void setNodeLevel(int nodeLevel) {
        this.nodeLevel = nodeLevel;
    }



    public int getNodeLevel() {
        return nodeLevel;
    }

    public String getName() {
        return name;
    }





    public boolean isLeaf() {
        return this.getChildren().size() == 0;
    }

    public void addChild(Node n) {

        nodeChildren.add(n);
    }

    public void addParent(Node n){
        nodeParents.add(n);

    }

    public List<Node> getParents() {

        return nodeParents;
    }

    public List<Node> getChildren() {

        return nodeChildren;
    }

}
