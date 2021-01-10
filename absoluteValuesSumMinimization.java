int absoluteValuesSumMinimization(int[] a) {
    int l = a.length, temp =0;
    int[] sum = new int[l];
    for(int i=0; i<l; i++){
        temp = a[i];
        for(int j=0; j<l; j++){
            sum[i] += Math.abs(temp-a[j]);
        }
    }
    int p=0, small=sum[0];
    for(int i=0; i<sum.length; i++){
        if(sum[i]<small){
            small=sum[i];
            p=i;
        }
    }
    return a[p];
}
