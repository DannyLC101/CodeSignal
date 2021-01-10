int arrayChange(int[] inputArray) {
    int[] in = inputArray;
    int l = in.length;
    int sum = 0, add=0, ach=0, temp=0;
    for(int i=0; i<l-1; i++){
        if(in[i+1]<=in[i]){
            ach = in[i]+1;
            temp = in[i+1];
            in[i+1] = ach;
            add = in[i+1] - temp;
            sum = sum+add;
        }
    }
    return sum;
}
