public void swapChildrenAtLevel(int n) {
    overallRoot = swapChildren(overallRoot, n, 1);
}

private IntTreeNode swapChildren(IntTreeNode root, int row, int currRow) {
    if (row <= 0) {
        throw new IllegalArgumentException();
    }
    if (root != null && currRow <= row) {
        if (row == currRow) {
            IntTreeNode tempLeft = root.left;
            root.left = root.right;
            root.right = tempLeft;
        } else {
            root.left = swapChildren(root.left, row, currRow + 1);
            root.right = swapChildren(root.right, row, currRow + 1);
        }
    }
    return root;
}
