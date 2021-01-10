String alphabeticShift(String inputString) {
     String s = inputString;
     int l = s.length(), k=0;
     String r = "";
     for(int i=0; i<l; i++){
    
        k = Integer.valueOf(s.charAt(i));
        if(k==90){
            k=65;
        }else if(k==122){
            k=97;
        }else{
            k++;    
        }
        r += String.valueOf((char)(k));
     }
    return r;
}
