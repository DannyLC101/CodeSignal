int arrayMaximalAdjacentDifference(int[] inputArray) {
    int l = inputArray.length;
    int small = Integer.MAX_VALUE;
    int large = Integer.MIN_VALUE;
    int store = 0;
    for(int i=0; i<l-1; i++){
        if(large<Math.abs(inputArray[i]-inputArray[i+1])){
            large = Math.abs(inputArray[i]-inputArray[i+1]);
        }
    }
    return large;
}
