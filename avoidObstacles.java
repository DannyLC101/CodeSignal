int avoidObstacles(int[] inputArray) {
    int l =inputArray.length;
    int i=2,j=0, count=0;
    first:
    while(i<=1001){
        count=0;
        second:
        for(j=0; j<l;j++){
            if(inputArray[j]%i==0){
                i++;
                // flag = false;
                break second;
            }else{
                count++;
            }
        }
        if(count==l){
            break first;
        }
    }
    return i;
}
