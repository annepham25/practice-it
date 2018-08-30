public int countLeftNodes() {
    int count = countLeftNodes(overallRoot);
    return count;
}

private int countLeftNodes(IntTreeNode node) {
    if (node == null) {
        return 0;
    } 
    int count = 0;
    if (node.left != null) {
        count += 1 + countLeftNodes(node.left);
    } 
    
    if (node.right != null) {
        count += countLeftNodes(node.right);
    }
    return count;
}
