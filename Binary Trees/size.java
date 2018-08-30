public int size() {
    return size(overallRoot);
}

private int size(IntTreeNode overallRoot) {
    if (overallRoot == null) {
        return 0;
    }
    int count = 1;
    count += size(overallRoot.left);
    count += size(overallRoot.right);
    return count;
}
