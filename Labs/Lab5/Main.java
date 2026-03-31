class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST<Integer> binaryTree = new BST<>();
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    binaryTree.insert(13);
    binaryTree.insert(22);
    binaryTree.insert(36);
    binaryTree.insert(5); 
    binaryTree.insert(48);
    binaryTree.insert(17);
    binaryTree.insert(39);
    binaryTree.insert(2);
    binaryTree.insert(26);
    binaryTree.insert(40);
    binaryTree.insert(29);
    binaryTree.insert(34);
    binaryTree.insert(10);
    // Step 3 - Delete the value 17
    binaryTree.delete(17);
    // Step 4 - Traverse and output the values using inorder (sorted)
    binaryTree.inorder();
    System.out.println();
    // Step 5 - Traverse and output the values using postorder
    binaryTree.postorder();
    System.out.println();
    // Step 6 - Traverse and output the values using preorder
    binaryTree.preorder();
    System.out.println();
    // Step 7 - Display the result of a search for the value 36
    System.out.println("Search for 36: " + binaryTree.search(36));
    // Step 8 - Display the result of a search for the value 37
    System.out.println("Search for 37: " + binaryTree.search(37));
    // Step 9 - Using the path() method, display the path from the root to 2
    System.out.println("Path to 2: " + binaryTree.path(2));
    // Step 10 - Display the path from the root to 34
    System.out.println("Path to 34: " + binaryTree.path(34));

  }
}