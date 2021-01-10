int adjacentElementsProduct(int[] inputArray) {
    int c = inputArray[0] * inputArray[1];
    int x = 0;
    int y = 0;
    int p = 0;
    int l = inputArray.length;
    for(int i=1; i<l-1; i++){
        x = inputArray[i];
        y = inputArray[i+1];
        p = x * y;
        if(p>c){
            c = p;
        }
    }
    return c;
}
