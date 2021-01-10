boolean chessBoardCellColor(String cell1, String cell2) {
    boolean x1,y1,x2,y2;
    int c1,c2;
    c1 = (Integer.valueOf(cell1.charAt(0)) - Integer.valueOf(cell1.charAt(1)));
    c2 = (Integer.valueOf(cell2.charAt(0)) - Integer.valueOf(cell2.charAt(1)));
    return (c1%2==0 && c2%2==0 || c1%2!=0 && c2%2!=0);
}
