public int numberNodes() {
        return numberNodes(overallRoot, 0);
    }

    /** Helper function */
    private static int numberNodes(IntTreeNode node, int n) {
        if (node != null) {
            node.data = ++n; // preorder means we assign to node first
            n = numberNodes(node.left, n);
            n = numberNodes(node.right, n);
        }
        return n;
    }
//
//public int numberNodes() {
//    return numberNodes(overallRoot, 1);
//}
//
//private int numberNodes(IntTreeNode node, int count) {
//    if (node == null) {
//        return 0;
//    } else {
//        node.data = count;
//        int leftCount = numberNodes(node.left, count + 1);
//        int rightCount = numberNodes(node.right, count + leftCount + 1);
//        return 1 + leftCount + rightCount;
//        
//    }
//}
