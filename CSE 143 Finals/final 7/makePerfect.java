public void makePerfect() {
    int treeHeight = height();
    overallRoot = makePerfect(overallRoot, treeHeight, 1);
}

private IntTreeNode makePerfect(IntTreeNode root, int height, int row) {
    if (root != null) {
        if (row < height) {
            if ((root.left == null && root.right != null) || 
                   (root.left == null && root.right == null)) {
                root.left = new IntTreeNode(0);
            } 
            if ((root.left != null && root.right == null) ||
                   (root.left == null && root.right == null)) {
                root.right = new IntTreeNode(0);
            }
        }
        root.left = makePerfect(root.left, height, row + 1);
        root.right = makePerfect(root.right, height, row + 1);
    }
    return root;
}



// LEAVE THESE METHODS HERE, TO USE AS HELPERS
public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else {
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
