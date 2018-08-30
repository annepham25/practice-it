public int sum() {
    int count = sum(overallRoot);
    return count;
}

private int sum(IntTreeNode node) {
    if (node == null) {
        return 0;
    } 
    return node.data + sum(node.left) + sum(node.right);
}
