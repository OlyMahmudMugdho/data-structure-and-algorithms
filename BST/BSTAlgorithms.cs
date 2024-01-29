public class BSTAlgorithms
{
    public static void DepthFirstValue(Node root)
    {
        Stack<Node> stack = new Stack<Node>();
        stack.Push(root);

        while (stack.Count != 0)
        {
            Node current = stack.Pop();
            
            Console.Write(current.value + " ");

            if (current.right != null)
            {
                stack.Push(current.right);
            }

            if (current.left != null)
            {
                stack.Push(current.left);
            }
        }
    }
    
    public static void DepthFirstValueRecursive(Node root)
    {
        if (root == null)
        {
            return;
        }
        
        Console.Write(root.value + " ");
        DepthFirstValueRecursive(root.left);
        DepthFirstValueRecursive(root.right);
    }
    
    public static void BreadthFirstValue(Node root)
    {
        Queue<Node> queue = new Queue<Node>();
        
        queue.Enqueue(root);

        while (queue.Count != 0)
        {
            Node current = queue.Dequeue();
            Console.Write(current.value + " ");
            if (current.left != null)
            {
                queue.Enqueue(current.left);
            }

            if (current.right != null)
            {
                queue.Enqueue(current.right);
            }
        }
    }

    public static void PreOrderTraversal(Node root)
    {
        if (root == null)
        {
            return;
        }
        
        Console.Write(root.value + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public static void PostOrderTraversal(Node root)
    {
        if (root == null)
        {
            return;
        }
        
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        Console.Write(root.value + " ");
    }
    public static Node insert(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }

        else if (value < root.value)
        {
            root.left = insert(root.left, value);
        }
        else if (value > root.value)
        {
            root.right = insert(root.right, value);
        }

        return root;
    }
    
    
    /*
     *            7
     *         /     \
     *        5      10
     *      /  \    /  \
     *     1    6  8   12
     * 
     *
     */
    public static void Main(string[] args)
    {
        
        /*
           Node root = new Node(7);
           Node five = new Node(5);
           Node ten = new Node(10);
           Node one = new Node(1);
           Node six = new Node(6);
           Node eight = new Node(8);
           Node twelve = new Node(12);

        root.left = five;
        root.right = ten;
        five.left = one;
        five.right = six;
        ten.left = eight;
        ten.right = twelve;
        */
        
        // DepthFirstValue(root);
        // Console.WriteLine();
        // DepthFirstValueRecursive(root);

        Node root = new Node(7);

        insert(root, 5);
        insert(root, 10);
        insert(root, 1);
        insert(root, 6);
        insert(root, 8);
        insert(root, 12);
        
        /*
         * BreadthFirstValue(root);
           Console.WriteLine();
         */
        // PreOrderTraversal(root);
        // 7 5 10 1 6 8 12 
        PostOrderTraversal(root);
    }
}

public class Node
{
    public int value;
    public Node left;
    public Node right;

    public Node()
    {
    }

    public Node(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}