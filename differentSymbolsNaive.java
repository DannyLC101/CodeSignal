int differentSymbolsNaive(String s) {
    int l = s.length();
    String r="";
    for(int i=0; i<l; i++){
        if(!r.contains(String.valueOf(s.charAt(i)))){
            r = r + String.valueOf(s.charAt(i));
        }
    }
    return r.length();
}
