int matrixElementsSum(int[][] matrix) {
    int l = matrix.length;
    int counter = 0;
    for(int i=0; i<matrix[0].length; i++){
        for(int j=0; j<l; j++){
            if(matrix[j][i]>0){
                counter = counter + matrix[j][i];
            }else{
                break;
            }
        }
    }
    return counter;
}
