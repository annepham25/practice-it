public int depthSum() {
    int sum = depthSum(overallRoot, 1);
    return sum;
}

private int depthSum(IntTreeNode node, int row) {
    if (node == null) {
        return 0;
    }
    return row * node.data + depthSum(node.left, row + 1) + depthSum(node.right, row + 1);
}
