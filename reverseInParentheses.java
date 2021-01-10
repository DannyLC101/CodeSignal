String reverseInParentheses(String inputString) {
    int l = inputString.length();
    int start=0, end=0;
    StringBuilder sb = new StringBuilder(inputString);
    
    if(l>0 || l>=2){
        while(sb.indexOf("(")!=-1)
        {
            start = sb.lastIndexOf("(");
            end = sb.indexOf(")", start);
            sb.replace(start, end+1, new StringBuilder(sb.substring(start+1, end)).reverse().toString());
        }
    }
    return sb.toString();
}
