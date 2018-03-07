package NKLeetCode.Array;

public class Med_TwoSortedArray {
    public static double findMedianSortedArrays(int A[], int B[]) {
        int len = A.length + B.length;
        int mid;
        int type = 1;
        if (len % 2 != 0) {
            type = 1;
            mid = (len + 1) /2;
        }
        else {
            type = 2;
            mid = (len + 1) / 2;
        }
        int m = 0, n = 0;
        Boolean flag = false;
        for (int i = 0; i < mid; i++) {
            if (A[m] > B[n]) {
                n++;
                flag = true;
            } else {
                m++;
                flag = false;
            }
        }
        int num1;
        if(flag){
            num1 = A[--m];
            m++;
        }
        else{
            num1 = B[--n];
            n++;
        }


        switch(type){
            case 1:break;
            case 2:{
                num1 = (Math.min(A[m], B[n]) + num1) / 2;
                break;
            }
        }
        return num1;
    }

    public static void test() {
        int[] A = {1,2,3};
        int[] B = {4,5};
        System.out.println(findMedianSortedArrays(A,B));

    }

}