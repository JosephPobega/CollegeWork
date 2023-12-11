package apps;

import adts.*;

public class AlphaBravoCharlie {

    public static void main(String[] args) {

        BinarySearchTree<String> abcTree =
                new BinarySearchTree<String>();

        // Add elements to the tree
        abcTree.add("November");
        abcTree.add("Bravo");
        abcTree.add("Sierra");
        abcTree.add("Alpha");
        abcTree.add("Echo");
        abcTree.add("Romeo");
        abcTree.add("Tango");
        abcTree.add("India");
        abcTree.add("Yankee");

        // Set traversal type to REVORDER
        abcTree.setTraversalType("rev");

        // Use iterator to traverse the tree in reverse order
        for (String element : abcTree) {
            System.out.println(element);
        }

        // Set traversal type to PREORDER for demonstration
        System.out.println("PREORDER: ");
        abcTree.setTraversalType("pre");

        // Use iterator to traverse the tree in the specified order
        for (String element : abcTree) {
            System.out.println(element);
        }
    }
}
