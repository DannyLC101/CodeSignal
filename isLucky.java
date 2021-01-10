boolean isLucky(int n) {
    int a = String.valueOf(n).length();
    int s1 = 0;
    int s2 = 0;
    
    int[] numbers = new int[a];
    for(int i=0; i<a; i++){
        numbers[i] = Integer.parseInt(String.valueOf(n).substring(i, i+1));
    }
    for(int j=0; j<a/2; j++){
        s1 = s1 + numbers[j];
    }
    for(int k=a/2; k<a; k++){
        s2 = s2 + numbers[k];
    }
    return s1==s2;
}
