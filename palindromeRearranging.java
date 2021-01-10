boolean palindromeRearranging(String inputString) {
    String s = inputString;
    int l = inputString.length(), count=0, letter_count=0;
    char ch = 0;
    char str[] = s.toCharArray();
    int ar[] = new int[l];
    for(int i=0; i<l; i++){
        ch = str[i];
        count = 0;
        for(int j=0; j<l; j++){
            if(ch==str[j] && ch!='0'){
               count++;
               str[j]='0'; 
            }
        }
        if(count>0){
            ar[letter_count] = count;
            letter_count++;
        }
    }
    int odd=0;
    for(int n=0; n<ar.length; n++){
        if(ar[n]%2 !=0){
            odd++;
        }
    }
    return odd<2;
}
