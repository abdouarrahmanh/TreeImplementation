import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


class MyTree implements Tree {
    private Node root;


    public MyTree() {
        root = null;
    }

    public MyTree(Node name) {
        root = name;
    }


    public void setTree(String name, int level) {
        root = new MyNode(name, level);
    }

    public void traverseBFs(Node root) {
        MyNode cast = (MyNode) root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        TraverseOperation printOp = new nodePrint();
        while (!queue.isEmpty()) {

            Node temp = queue.poll();


            printOp.operate(temp);
            for (Node node : temp.getChildren()) {
                queue.offer(node);
            }

        }
    }

    public void traverseBFs_FAM(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        TraverseOperation printOp = new FamilyPrint();
        while (!queue.isEmpty()) {

            Node temp = queue.poll();

            printOp.operate(temp);
            for (Node node : temp.getParents()) {
                queue.offer(node);
            }

        }
    }

    public void preorderDfsTraverseRecursive(Node node, TraverseOperation op) {
        op.operate(node);
        for (Node child : node.getChildren()) {

            preorderDfsTraverseRecursive(child, op);
        }

    }

    public void preorderDfsTraverseRecursive() {
        if (root != null) {
            TraverseOperation printOp = new nodeTabPrint();
            CountOperation countOp = new CountOperation();
            printOp.operate(root);
            for (Node child : root.getChildren()) {
                preorderDfsTraverseRecursive(child, printOp);
            }
        }
    }

    public Double getBranchingFactor() {
        Double totalNodes = 0.0;
        int nonLeafNodes = 0;
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.offer(root);
        while (!myQueue.isEmpty()) {
            Node topNode = myQueue.poll();
            totalNodes = totalNodes + topNode.getChildren().size();
            if (!topNode.isLeaf()) {
                nonLeafNodes++;
            }

        }


        return totalNodes / nonLeafNodes;
    }


    public Boolean isBinaryTree() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            for (Node node : temp.getChildren()) {
                queue.offer(node);
                if (node.getChildren().size() >= 2) {
                    return false;
                }
            }


        }
        return true;
    }

    public void setTreeLevels(Node root, int level) {
        if (!root.getChildren().isEmpty()) {
            for (Node node : root.getChildren()) {
                node.setNodeLevel(level + 1);
                setTreeLevels(node, node.getNodeLevel());
            }
        } else {
            root.setNodeLevel(level);
        }

    }

    public void setGraphLevels(Node root, int level) {
        if (!root.getParents().isEmpty()) {

            for (Node node : root.getParents()) {

                node.setNodeLevel(level + 1);
                setGraphLevels(node, node.getNodeLevel());
            }
        } else {
            root.setNodeLevel(level);
        }

    }


    public Object getRootName(Node root) {
        return root.getName();
    }


    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            Queue<Node> myHeightQueue = new LinkedList<>();
            int height = 0;
            myHeightQueue.offer(root);
            while (!myHeightQueue.isEmpty()) {
                Node topNode = myHeightQueue.poll();
                if (topNode.getNodeLevel() > height) {
                    height = topNode.getNodeLevel();
                }

            }
            return height;
        }


    }

    @Override
    public boolean isEmpty() {
        if (root.getChildren().size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        root = null;
    }
}