package HW8;

public class BinaryTree
{
   
    Node root;

    BinaryTree()
    {
        root = null;
    }


    //Breath First Traversal

    //postorder traversal
    void postOrder(Node node)
    {
        if (node == null)
            return;

        // recursion on left subtree
        postOrder(node.left);

        // recursion right subtree
        postOrder(node.right);

        // print the node
        System.out.print(node.key + " ");
    }

    //InOrder traversal
    void inOrder(Node node)
    {
        if (node == null)
            return;

        // recursion on left subtree
        inOrder(node.left);

        // print the node
        System.out.print(node.key + " ");

        // recursion right subtree
        inOrder(node.right);
    }

    //Preorder traversal
    void preOrder(Node node)
    {
        if (node == null)
            return;

        // print the node
        System.out.print(node.key + " ");

        // recursion on left subtree
        preOrder(node.left);

        // recursion right subtree
        preOrder(node.right);
    }

    //use recursive function in this function to printh the traversals
    void postOrder()  {
        postOrder(root);
    }
    void inOrder()    {
        inOrder(root);
    }
    void preOrder()   {
        preOrder(root);
    }


    //Depth First Traversal

    /* function to print level order traversal of tree*/
    void depthFirst()
    {
        int h = height(root);
        int i;
        //each level is passed and printed each node at given level
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
    }

    //find height of the tree
    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            int left = height(root.left);
            int right= height(root.right);

            //use the largest height
            if (left > right)
                return(left+1);
            else return(right+1);
        }
    }

    //print nodes at each level
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal");
        tree.preOrder();

        System.out.println("\nInorder traversal");
        tree.inOrder();

        System.out.println("\nPostorder traversal");
        tree.postOrder();

        System.out.println("\nBreathFirst traversal");
        tree.depthFirst();

    }
}
