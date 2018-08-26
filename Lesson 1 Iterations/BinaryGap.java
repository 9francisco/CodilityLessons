/* Find longest sequence of zeros in binary representation of an integer. */

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int binaryGap = 0;
        
        while (N%2 == 0) {
            N/=2;
        }
        
        for (int i=0; N > 0; N/=2) {
            if (N%2 == 0) {
                i++;
            } else {
                if (i > binaryGap) {
                    binaryGap = i;
                }
                
                i = 0;
            }
        }
        
        return binaryGap;
    }
}

/* Test Score:100% https://app.codility.com/demo/results/training6SKWEU-VQD/ */