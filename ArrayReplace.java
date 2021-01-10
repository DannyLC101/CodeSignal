int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    int l = inputArray.length;
    for(int i=0; i<l;i++){
        if(inputArray[i]==elemToReplace){
            inputArray[i]=substitutionElem;
        }
    }
    return inputArray;
}
