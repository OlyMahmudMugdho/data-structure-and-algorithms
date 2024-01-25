import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstValue {

    /*
     *           1
     *         /    \
     *        2      3
     *       / \      \
     *      4   5      6
     *
     * */

    public static void BFV(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.println(current.value);

            if ((current.left != null)) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }


        }
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

        BFV(root);
    }
}
