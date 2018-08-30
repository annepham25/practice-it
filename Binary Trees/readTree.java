public void readTree(Scanner input) {
    overallRoot = readTreeHelper(input);
}

private IntTreeNode readTreeHelper(Scanner input) {
    // Read input
    int type = input.nextInt();
    int data = input.nextInt();

    // Reconstruct node
    IntTreeNode current = new IntTreeNode(data);
    if (type == 1 || type == 3) {
        current.left = readTreeHelper(input);
    }
    if (type == 2 || type == 3) {
        current.right = readTreeHelper(input);
    }
    return current;
}
