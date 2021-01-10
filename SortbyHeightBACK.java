int[] sortByHeight(int[] a) {
    int l = a.length;
    int temp = 0;
    int small = 0;
    for(int i=0; i<l; i++){
        if(a[i]>0){
            
            for(int j=i+1; j<l; j++){
                if(a[j]<a[i] && a[j]>0){
                    temp = a[i];
                    small = a[j];
                    a[i] = small;
                    a[j] = temp;
                }
            }
        }
    }
    return a;
}
