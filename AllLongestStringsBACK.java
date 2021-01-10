String[] allLongestStrings(String[] inputArray) {
    
    int max = 0;
    int p = 0;
    int counter = 0;
    int l = inputArray.length;
    ArrayList<String> output = new ArrayList<String>();
    
    for(int i=0; i<l; i++){
        if(inputArray[i].length()>max){
            max = inputArray[i].length();
        }
    }
    
    for(int j=0; j<l; j++){
        if(inputArray[j].length()==max){
            output.add(inputArray[j]);
            p++;
        }
    }
    return output.toArray(new String[0]);
}
