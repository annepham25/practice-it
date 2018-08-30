public void printLevel(int n) {
    printLevel(overallRoot, n, 1);
}

private void printLevel(IntTreeNode node, int level, int row) {
    if (level < 1) {
        throw new IllegalArgumentException();
    }
    if (node != null) {
        if (level == row) {
            System.out.println(node.data);
        }
        if (level > row) {
            printLevel(node.left, level, row + 1);
            printLevel(node.right, level, row + 1);
        }
    }

}
