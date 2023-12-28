package org.example;

public class SumCalculator {
    public int sum(int i) {
        if (i<=0){
            throw new IllegalArgumentException("Incorrect number");
        } else {
            int sum = 0;
            for (int j=1;j<=i;j++){
                sum+=j;
            }
            return sum;
        }
    }
}
