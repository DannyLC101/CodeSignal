int commonCharacterCount(String s1, String s2) {
    int l1 = s1.length();
    int l2 = s2.length();
    // int c = 0;
    int d = 0;
    for(int i=0; i<l1; i++){
        if(s2.contains(String.valueOf(s1.charAt(i)))){
            d++;
        }
        s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");        
    }
    return d;
}
