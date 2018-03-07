/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given[100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is[1, 2, 3, 4]. Return its length:4.

Your algorithm should run in O(n) complexity.

 */


import java.util.HashMap;

public class ConsecutiveSequence {

    public static void main(String[] args) {
        int[] num = {1,1,1,2,4,5,6};
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        System.out.println(new ConsecutiveSequence().longestConsecutive(num));
    }

    public static int longestConsecutive(int[] num) {
        int len = num.length;
        if(len == 0) return 0;
        if(len == 1) return 1;
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (int i = 0; i < len; i++) {
            hashMap.put(num[i],false);
        }
        int result = 0;

        for (int i = 0; i < len; i++) {

            if(hashMap.get(num[i]) == false){
//                System.out.println(num[i]);
                hashMap.replace(num[i],true);
                int count = 1;
                int down = num[i] - 1;
                int up = num[i] + 1;
                while(hashMap.get(down) != null && !hashMap.get(down)){
                    count++;
                    hashMap.replace(down,true);
                    down--;
                }
                while(hashMap.get(up) != null && !hashMap.get(up)){
                    count++;
                    hashMap.replace(up,true);
                    up++;
                }
                if(count > result){result = count;}
            }else{
                continue;
            }
        /*    if(hashMap.get(num[i]) == false){
                int mid = num[i];
                hashMap.replace(mid,true);//label
                int count = 1;
                mid--;
                while(hashMap.get(mid) == false){
                    count++;
                    hashMap.replace(mid--,true);//lable
                }//count down
                mid = num[i]++;
                while(hashMap.get(mid) == false){
                    count++;
                    hashMap.replace(mid++,true);
                }
                if(count > result){result = count;}
            }*/

        }
        return result;
    }
}