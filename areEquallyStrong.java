boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int[] you = new int[2];
    int[] frn = new int[2];
    you[0] = yourLeft;
    you[1] = yourRight;
    frn[0] = friendsLeft;
    frn[1] = friendsRight;
    Arrays.sort(you);
    Arrays.sort(frn);
    Boolean temp = false;
    return (you[0]==frn[0] && you[1]==frn[1]);
}
