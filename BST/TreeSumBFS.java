import java.util.LinkedList;
import java.util.Queue;

public class TreeSumBFS {

    public static int sum(Node root) {
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            sum += current.value;

            if (current.right != null) {
                queue.add(current.right);
            }

            if (current.left != null) {
                queue.add(current.left);
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
