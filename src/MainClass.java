public class MainClass {
    public static void main(String[] args) {
        Node root = new MyNode("Conspiracy theory");
        Node levelOneChild1 =  new MyNode("Conspiracy theories by subject");
        Node levelOneChild3 =  new MyNode("Conspiracy theorists");
        Node levelOneChild2 =  new MyNode("Works about conspiracy theories");
        Node levelTwoChild_1a =  new MyNode("9/11 conspiracy theories");
        Node levelTwoChild_1b =  new MyNode("Conspiracy theories involving Muslims");
        Node levelTwoChild_3a =  new MyNode("Japanese war crime deniers");
        Node levelThreeChild_1a =  new MyNode("Eurabia");
        Node levelThreeChild_3a =  new MyNode("Members of Nippon Kaigi");
        Node levelThreeChild3_3b =  new MyNode("Nanking Massacre deniers");
        root.addChild(levelOneChild1);
        root.addChild(levelOneChild2);
        root.addChild(levelOneChild3);
        levelOneChild1.addChild(levelTwoChild_1a);
        levelOneChild1.addChild(levelTwoChild_1b);
        levelOneChild3.addChild(levelTwoChild_3a);
        levelTwoChild_1b.addChild(levelThreeChild_1a);
        levelTwoChild_3a.addChild(levelThreeChild3_3b);
        levelTwoChild_3a.addChild(levelThreeChild_3a);
        MyTree Wikipedia_Conspiracies = new MyTree(root);
        Wikipedia_Conspiracies.setTreeLevels(root, 0);
        Wikipedia_Conspiracies.preorderDfsTraverseRecursive();
        System.out.println("--------------------------------------------------------------");
        Wikipedia_Conspiracies.traverseBFs(root);
        System.out.println("--------------------------------------------------------------");
        System.out.println(Wikipedia_Conspiracies.getBranchingFactor());
        System.out.println("--------------------------------------------------------------");
        System.out.println(Wikipedia_Conspiracies.isBinaryTree());
        System.out.println("--------------------------------------------------------------");
        Node root2a = new MyNode("Abdou");
        Node parent1a = new MyNode("Mustapha");
        Node parent2a = new MyNode("Hassna");
        Node grandParent1a = new MyNode("Ahmed");
        Node grandParent2a = new MyNode("Souad");
        Node grandParent3a = new MyNode("Aziz");
        Node grandParent4a = new MyNode("Khadija");
        Node root2b = new MyNode("Benji");
        Node parent1b = new MyNode("Joey");
        Node parent2b = new MyNode("Sharon");
        Node grandParent1b = new MyNode("Butch");
        Node grandParent2b = new MyNode("Liz");
        Node grandParent3b = new MyNode("Chuck");
        Node grandParent4b = new MyNode("Lois");
        root2a.addParent(parent1a);
        root2a.addParent(parent2a);
        parent1a.addParent(grandParent3a);
        parent1a.addParent(grandParent4a);
        parent2a.addParent(grandParent1a);
        parent2a.addParent(grandParent2a);
        root2b.addParent(parent1b);
        root2b.addParent(parent2b);
        parent1b.addParent(grandParent1b);
        parent1b.addParent(grandParent2b);
        parent2b.addParent(grandParent3b);
        parent2b.addParent(grandParent4b);
        parent1a.addChild(root2a);
        parent2a.addChild(root2a);
        grandParent3a.addChild(parent1a);
        grandParent4a.addChild(parent1a);
        grandParent1a.addChild(parent2a);
        grandParent2a.addChild(parent2a);
        parent1b.addChild(root2b);
        parent2b.addChild(root2b);
        grandParent1b.addChild(parent1b);
        grandParent2b.addChild(parent1b);
        grandParent3b.addChild(parent2b);
        grandParent4b.addChild(parent2b);

        MyTree FischmanFamilyTree = new MyTree(root2b);
        MyTree Abdou_Fam_Tree = new MyTree(root2a);
FischmanFamilyTree.traverseBFs_FAM(root2b);
        System.out.println("--------------------------------------------------------------");
        Abdou_Fam_Tree.traverseBFs_FAM(root2a);




    }
}
