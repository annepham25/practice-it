public int countLeaves() {
    int count = countLeaves(overallRoot);
    return count;
}

private int countLeaves(IntTreeNode overallRoot) {
    if (overallRoot == null) {
        return 0;
    } else if (overallRoot.left == null && overallRoot.right == null) {
        return 1;
    } else {
        return countLeaves(overallRoot.right) + countLeaves(overallRoot.left);
    }
}
