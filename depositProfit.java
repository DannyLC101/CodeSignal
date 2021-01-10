int depositProfit(int deposit, int rate, int threshold) {
    int x = 0;
    float d = deposit;
    while( d<threshold ) {
         d = d + (d*rate/100);
         x++;
    }
    return x;
}
