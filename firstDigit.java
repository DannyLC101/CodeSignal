char firstDigit(String inputString) {
    int l = inputString.length();
    Boolean flag;
    char r='1';
    for(int i=0; i<l; i++){
        flag = Character.isDigit(inputString.charAt(i));
        if(flag){
            r = inputString.charAt(i);
            break;
        }
    }
    return r;
}
