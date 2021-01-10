boolean isIPv4Address(String inputString) {
    String[] str = inputString.split("[.]", 0);
    String regex = "^[a-zA-Z]*$";
    Pattern pattern = Pattern.compile(regex);
    boolean r =true;
    if(str.length<=3 || str.length>4){
        r = false;
    }
    try{
        for(int i=0; i<str.length; i++){
            Matcher matcher = pattern.matcher(str[i]);
            if(str[i].length()>3 || str[i].isEmpty() || str[i].contains("a") || (Integer.parseInt(str[i])>255) || (str[i].length()==2 && str[i].charAt(0)=='0') || (str[i].charAt(0)>='a' && str[i].charAt(0)<='z') || (str[i].charAt(0)>='A' && str[i].charAt(0)<='Z')){
                r = false;
            }
            for(int k=0; k<str[i].length(); k++)
            {
                if((str[i].charAt(k)>='a' && str[i].charAt(k)<='z') || (str[i].charAt(k) >= 'A' && str[i].charAt(k)<='Z')){
                    r = false;
                }
            }
        }
    }catch(NumberFormatException n){
        r = false;
    }
    return r;
}
