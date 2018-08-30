public int sumLeaves() {
    return sumLeaves(overallRoot);
}

private int sumLeaves(IntTreeNode node) {
    int sum = 0;
    if (node != null) {
        if (node.left == null && node.right == null) {
            sum += node.data;
        }
        sum += sumLeaves(node.left);
        sum += sumLeaves(node.right);
    }
    return sum;
}
