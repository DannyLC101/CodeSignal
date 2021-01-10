boolean areSimilar(int[] a, int[] b) {
    int l1 = a.length;
    int l2 = b.length;
    int c=0;
    int[] a2 = new int[2];
    int[] b2 = new int[2];
    boolean temp = true;
    for(int i=0; i<l1; i++){
        // for(int j=0; j<l2; j++){
            if(a[i]!=b[i] && c<2){ //|| b[i]==a[j]
                a2[c] = a[i];
                b2[c] = i;
                c++;
            }
        // }
    }
    if(c>0){
        a[b2[0]] = a2[1];
        a[b2[1]] = a2[0];
    }
    for(int j=0; j<l1; j++){
        if(a[j]!=b[j]){
            temp = false;
            break;
        }else{
            temp = true;
        }
    }
    return temp;
}
