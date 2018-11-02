package Four;

public class Main {
    public static void main(String[] args) {

        Tree theTree = new Tree();

        theTree.insertNode(50);
        theTree.insertNode(32);
        theTree.insertNode(13);
        theTree.insertNode(65);
        theTree.insertNode(34);
        theTree.insertNode(22);
        theTree.insertNode(3);
        theTree.insertNode(76);
        theTree.insertNode(90);

        theTree.preOrder(theTree.getRoot());

    }
}
