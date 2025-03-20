import java.util.Stack;

/*
 *           5
 *         /    \
 *        4      6
 *       / \    /  \
 *      2   8  1    7
 *
 * */


public class DepthFirstValue {
    public static void dfv(Node root) {
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            Node current = nodeStack.pop();
            System.out.println(current.value);
            if(current.right != null) nodeStack.push(current.right);
            if (current.left != null) nodeStack.push(current.left);
        }
    }
    public static void main(String[] args) {

        Node root = new Node(5);
        Node two = new Node(2);
        Node six = new Node(6);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node one = new Node(1);
        Node eight = new Node(8);

        root.left = four;
        root.right = six;

        four.left = two;
        four.right = eight;
        
        six.left = one;
        six.right = seven;
        
        dfv(root);
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int val) {
        this.value = val;
    }

    Node(int val, Node r, Node l) {
        this.value = val;
        this.right = r;
        this.left = l;
    }
}
