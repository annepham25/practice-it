public void construct(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    }
    overallRoot = construct(0, n - 1);
}

private IntTreeNode construct(int low, int high) {
    if (low > high) {
        return null;
    } else {
        int mid = (low + high) / 2;
        return new IntTreeNode(mid, construct(low, mid - 1), construct(mid + 1, high));
    }
}
