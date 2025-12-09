class Solution {
    public boolean isPalindrome(String s){
        int left=0, right=s.length()-1;

        while(left<right){
            //skip non-alphanumeric characters from left
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))) { left++; }

            //skip non-alphanumeric characters from right
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) { right--; }

            //compare characters (convert to lowercase)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; }
            left++; right--;
        }
        return true;
    }
}
