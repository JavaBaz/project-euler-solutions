package problem;

public class P004 {

    public static void main(String[] args) {
        System.out.println(new P004().run());
    }

    public static boolean isPalindrome(String string) {
        StringBuilder reversedString = new StringBuilder();
        char tmpChar;
        int lengthOfString = string.length();

        for (int i = 0; i < lengthOfString; i++) {
            tmpChar = string.charAt(i);
            reversedString.insert(0, tmpChar);
        }

        return string.contentEquals(reversedString);
    }


    public String run() {
        int Palindrome = -1;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i * j;
                if (isPalindrome(String.valueOf(prod)) && prod > Palindrome)
                    Palindrome = prod;
            }
        }
        return Integer.toString(Palindrome);
    }
}