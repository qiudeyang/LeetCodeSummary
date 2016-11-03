package com.test;

/**
 * Created by qiudeyang on 02/11/16.
 */
public class SieveOfEratosthenes {
    public int runEratosthenesSieve(int upperBound) {
        int count = 0;
        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
        boolean[] isComposite = new boolean[upperBound + 1];
        for (int m = 2; m <= upperBoundSquareRoot; m++) {
            if (!isComposite[m]) {
                System.out.print(m + " ");
                count++;
                for (int k = m * m; k <= upperBound; k += m)
                    isComposite[k] = true;
            }
        }
        for (int m = upperBoundSquareRoot+1; m <upperBound; m++){
            if (!isComposite[m]){
                count++;
                System.out.print(m + " ");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(new SieveOfEratosthenes().runEratosthenesSieve(1500000));
        System.out.println(System.currentTimeMillis()-a);
    }
}
