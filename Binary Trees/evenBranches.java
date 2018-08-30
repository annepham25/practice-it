public int evenBranches() {
    return evenBranches(overallRoot);
}

private int evenBranches(IntTreeNode node) {
    if (node == null) {
        return 0;
    } else if (node.left == null && node.right == null) {
        return 0;
    } else if (node.data % 2 == 0) {
        return 1 + evenBranches(node.left) + evenBranches(node.right);
    } else {
        return evenBranches(node.left) + evenBranches(node.right);
    }
        
        
}
