String[] addBorder(String[] picture) {
    int h = picture.length;
    int w = picture[0].length();
    String s = "";
    String[] result = new String[h+2];
    for(int i=0; i<w+2; i++){
        s = s + "*";
    }
    result[0] = s;
    result[h+1] = s;
    for(int j =1; j<=h; j++){
        result[j] = "*"+picture[j-1]+"*";
    }
    return result;
}
