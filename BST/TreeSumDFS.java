import java.util.Stack;

public class TreeSumDFS {


    /*
     *           1
     *         /    \
     *        2      3
     *       / \      \
     *      4   5      6
     *
     * */

    public static int sum(Node root) {
        int sum = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);


        while (!stack.isEmpty()) {
            Node current = stack.pop();
            sum += current.value;

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.right = six;

        System.out.println(sum(root));
    }
}


public class Node {
    int value;
    Node left;
    Node right;

    Node() {};

    Node(int val) {
        this.value = val;
    }

    Node(int val, Node r, Node l) {
        this.value = val;
        this.right = r;
        this.left = l;
    }

}
