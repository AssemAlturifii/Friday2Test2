package Four;

public class Tree {
    private Node root;

    public void insertNode(int node){
        Node newNode=new Node(node);

        if(root==null){
            root=newNode;
        }
        else{
            Node current=root;
            Node parent;

            while(true){
                parent=current;
                if(node<current.data){
                    current=current.left;
                    if(current==null){
                        parent.left=newNode;
                        return;
                    }
                }
                else{
                    current=current.right;
                    if(current==null){
                        parent.right=newNode;
                        return;
                    }
                }

            }
        }

    }
    public void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public Node getRoot() {
        return root;
    }
}
