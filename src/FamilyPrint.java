
public class FamilyPrint implements TraverseOperation {

    public void operate(Node node) {
        String outPut = "";
        if (!node.getParents().isEmpty()) {
            outPut = node.getName() + " is the child of " + node.getParents().get(0).getName() + " and " +
                    node.getParents().get(1).getName() + " and has the following children: ";
        } else {
            outPut = node.getName() + " is a grandParent, and his/her parents have been lost to history... RIP. " + "  But, they had these kids! ";

        }

        if (node.getChildren().isEmpty()) {
            outPut = outPut + "(" + node.getName() + " has no children)";
        } else {
            for (Node child : node.getChildren()) {
                outPut = outPut + " " + child.getName() + ",";
            }

        }
        System.out.println(outPut);
    }

}


