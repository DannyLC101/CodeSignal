Integer[] extractEachKth(int[] inputArray, int k) {
    List<Integer> list = new ArrayList<>();
    
    int c=0, n=1;
    for(int i=0; i<inputArray.length; i++){
        if((i+1)%k!=0){
            list.add(inputArray[i]);
            System.out.println("Value of list:" + list);
            c++; 
            // n++;
        }
    }
    Integer[] result = new Integer[list.size()];
    result = list.toArray(result);
    return result;
}
