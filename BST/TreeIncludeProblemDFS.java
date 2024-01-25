import java.util.Stack;

public class TreeIncludeProblemDFS {

    public static boolean search(Node root, int query) {
        Stack<Node> stack = new Stack<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.value == query) {
                return true;
            }

            if (current.right != null) {
                stack.add(current.right);
            }

            if ((current.left != null)) {
                stack.add(current.left);
            }
        }

        return false;
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

        System.out.println(search(root,3));
    }
}



class Node {
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
