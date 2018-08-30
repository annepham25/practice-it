public void printLeaves() {
    if (overallRoot == null) {
        System.out.println("no leaves");
    } else {
        System.out.print("leaves:");
        printLeaves(overallRoot);
    }
}

private void printLeaves(IntTreeNode node) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.print(" " +node.data);
        }
        printLeaves(node.right);
        printLeaves(node.left);
    }
}
