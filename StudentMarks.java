public class Ak {
    public static void main(String[] args) {
        String input = "This is a test string";
        System.out.println("The given string is: " + input);
        System.out.println("The string reversed word by word is: " + reverseWords(input));
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(reverse(word)).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}