public void tighten() {
    overallRoot = tighten(overallRoot);
}

private IntTreeNode tighten(IntTreeNode node) {
    if (node == null) {
        return null;
    } else {
        if (node.left == null && node.right != null) {
            return tighten(node.right);
        } else if (node.left != null && node.right == null) {
            return tighten(node.left);
        }
        node.left = tighten(node.left);
        node.right = tighten(node.right);
        return node;
    }
}
