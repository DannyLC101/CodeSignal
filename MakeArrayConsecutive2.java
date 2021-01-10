int makeArrayConsecutive2(int[] statues) {
    int l = statues.length;
    int min = statues[0];
    int max = statues[0];
    int con = 0;
    if(l<=1){
        con=0;
    }else{
        for(int i=0; i<l; i++){
            if(statues[i]<min){
                min = statues[i];
            }
            if(statues[i]>max){
                max = statues[i];
            }
        }
    }
    return (max-min)-(l-1);
}
