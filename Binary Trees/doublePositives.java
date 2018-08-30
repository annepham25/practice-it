public void doublePositives() {
    overallRoot = doublePositives(overallRoot);
}

public IntTreeNode doublePositives(IntTreeNode node) {
    IntTreeNode root = node;
    if (root != null) {
        if (root.data > 0) {
            root.data *= 2;
        }
        doublePositives(root.left);
        doublePositives(root.right);
    }
    return root;
}
