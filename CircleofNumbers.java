int circleOfNumbers(int n, int firstNumber) {
    if(n/2 > firstNumber){
        return ((n/2)+firstNumber);
    }else{
        return (firstNumber-(n/2));
    }
}
