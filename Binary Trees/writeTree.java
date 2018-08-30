public void writeTree() {
    writeTree(overallRoot);
}

private void writeTree(IntTreeNode node) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.println ("0 " + node.data);
        } else if (node.left != null && node.right == null) {
            System.out.println("1 " + node.data);
        } else if (node.left == null & node.right != null) {
            System.out.println("2 " + node.data);
        } else {
            System.out.println("3 " + node.data);
        }
        writeTree(node.left);
        writeTree(node.right);
    }
}
