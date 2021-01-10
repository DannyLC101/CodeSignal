int[][] boxBlur(int[][] image) {
    int h = image.length;
    int w = image[0].length;
    int sum=0;
    int[][] r = new int[h-2][w-2];
    int loop = Math.abs(h-w)+1;
    for(int i=1; i<=h-2;i++){
        for(int j=1; j<=w-2; j++){
            sum=image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] + image[i][j-1] + image[i][j] + image[i][j+1] + image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];
            r[i-1][j-1]=sum/9;
        }
    }
    return r;
}
