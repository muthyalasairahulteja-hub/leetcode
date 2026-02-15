class Solution {
    public boolean isPalindrome(int x) {
        // if the number is less than zero than it is not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;//we were borrowing x to modify 
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
