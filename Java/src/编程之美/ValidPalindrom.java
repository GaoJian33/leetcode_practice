public class ValidPalindrom {
    public static void main(String[] args) {
        String s = "a good doog a";
        if(isPalindrome(s)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        s = s.toLowerCase();
        int i, j = 0;
        for(i = 0, j = s.length() - 1; i < j; i++,j--){
            while((i < j)&& !Character.isLetterOrDigit(s.charAt(i)) ) i++;
            while((i < j)&& !Character.isLetterOrDigit(s.charAt(j))) j--;
            //In Java, String class can not split into Character directly in the form "s[i]" like in C++
            //To get the precise character in a string, you should use s.charAr(index) method;
            //Identify a character's type, you should use Character.is--(char);
            //Character.isLetterOrDigit() is suitable in this place.
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

}
