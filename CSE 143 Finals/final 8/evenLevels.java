public void evenLevels() {
    overallRoot = evenLevels(overallRoot, 1);
}

private IntTreeNode evenLevels(IntTreeNode root, int row) {
    if (root != null) {
        if ((root.left == null && root.right == null) && (row % 2 != 0)) {
            return null;
        } 
        root.left = evenLevels(root.left, row + 1);
        root.right = evenLevels(root.right, row + 1);
    }
    return root;
}
