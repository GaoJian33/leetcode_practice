
public class Solution {
    public int singleNumber(int[] A) {
        int length = A.length;
        int res = 0;
        for(int i = 0; i < length; i++){
            res ^= A[i];
        }
        return res;
    }
}
