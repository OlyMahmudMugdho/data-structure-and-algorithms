
public class Hanoi {

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxilaryRod ) {
        if(n == 0) {
            return;
        }

        towerOfHanoi(n - 1, fromRod, auxilaryRod, toRod);

        System.out.println("Moving disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        towerOfHanoi(n - 1, auxilaryRod, toRod, fromRod);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
}
