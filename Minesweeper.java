int[][] minesweeper(boolean[][] matrix) {
    int h = matrix.length;
    int w = matrix[0].length;
    int count=0;
    int[][] r = new int[h][w];
    for(int i=0; i<h; i++){
        for(int j=0; j<w; j++){
            for(int k=-1; k<2; k++){
                for(int l=-1; l<2; l++){
                    if(i+k>=0 && i+k<h && j+l>=0 && j+l<w){
                        if(i+k==i && j+l==j){
                            continue;
                        }
                        if(matrix[i+k][j+l]==true){
                            count++;
                        }
                    }
                }
            }
            r[i][j]=count;
            count=0;
        }
    }
    return r;
}
