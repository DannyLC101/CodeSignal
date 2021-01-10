boolean evenDigitsOnly(int n) {
    String s = Integer.toString(n);
    int l = s.length();
    boolean flag = true;
    for(int i=0; i<l; i++){
        if(Integer.parseInt(s.substring(i, i+1))%2==0){
            flag = true;
        }else{
            flag=false;
            break;
        }
    }
    return flag;
}
