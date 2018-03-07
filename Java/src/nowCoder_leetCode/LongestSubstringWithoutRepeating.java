import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int len = s.length();
        if(len == 0)return 0;
        int count = 0;
        int max = 0;
        int head = 0;
        for (int i = 0; i < len; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(head++));
                count--;
            }//如果遇到重复元素，窗口向右挪一位,直到剔除该元素
            set.add(s.charAt(i));//set 重新计算
            count++;
            max = Math.max(count, max);
        }
        return max;
    }
}
