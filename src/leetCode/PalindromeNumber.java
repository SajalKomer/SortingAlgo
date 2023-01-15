package leetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int revertNum = 0;
        while (x > revertNum){
            revertNum = (x % 10) + (revertNum * 10);
            x = x / 10;
        }

        return x == revertNum || x == revertNum / 10;
    }
}
