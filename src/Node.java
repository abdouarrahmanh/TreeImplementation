import java.util.List;

public interface Node {
    void addChild(Node n);
    void addParent(Node n);

    String getName();

    List<Node> getChildren();
    List<Node> getParents();
    void setNodeLevel(int nodeLevel);

    int getNodeLevel();
    boolean isLeaf();





}