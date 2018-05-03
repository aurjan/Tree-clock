package tree;

public class Tree {
    Branch root;
    int max;

    public void populateTree() {
        //top
        root = new Branch(1);
        //first layer
        Branch b11 = new Branch(2);
        Branch b12 = new Branch(3);
        //second layer
        Branch b21 = new Branch(4);
        Branch b22 = new Branch(5);
        Branch b23 = new Branch(6);
        Branch b24 = new Branch(7);
        //third layer
        Branch b31 = new Branch(8);
        Branch b32 = new Branch(9);
        Branch b33 = new Branch(10);
        //fourth layer
        Branch b41 = new Branch(11);

        root.left = b11;
        root.right = b12;

        b11.left = b21;
        b12.left = b22;
        b12.middle = b23;
        b12.right = b24;

        b22.left = b31;
        b23.left = b32;
        b23.right = b33;

        b32.middle = b41;

    }

    public void printTree(Branch branch, int i) {
        //if root exist
        if (branch != null) {
            System.out.print(branch.value + " ");
            i++;
            if (max < i) {
                max = i;
            }
        } else {
            System.out.print("  null  ");
        }
        //if branches exist recursion occurs
        if (branch.left != null) {
            printTree(branch.left, i);
        }
        if (branch.middle != null) {
            printTree(branch.middle, i);
        }

        if (branch.right != null) {
            printTree(branch.right, i);
        }
    }

    public void run() {
        populateTree();
        System.out.println("Tree from left to right by lair");
        printTree(root, 0);
        System.out.println("\n max depth: " + max);
    }


}
