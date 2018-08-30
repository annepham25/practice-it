public void completeToLevel(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } 
    overallRoot = completeToLevel(overallRoot, n);
}

private IntTreeNode completeToLevel(IntTreeNode node, int level) {
    if (node == null) {
        node = new IntTreeNode(-1);
    }
    
    if (level == 1) {
        return node;
    }
    
    node.left = completeToLevel(node.left, level - 1);
    node.right = completeToLevel(node.right, level - 1);
    return node;
}
