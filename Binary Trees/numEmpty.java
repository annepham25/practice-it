public int numEmpty() {
    return numEmpty(overallRoot);
}

public int numEmpty(IntTreeNode root) {
    if (root == null) {
        return 1;
    } else {
        return numEmpty(root.left) + numEmpty(root.right);
    }
}
