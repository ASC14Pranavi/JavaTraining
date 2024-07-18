package Assignment;

public class WordCount {
    public static int countWords(String str) {
        String[] words = str.split("\\s+"); // Split the string by whitespace
        int count = 0;
        for (String word : words) {
            if (!word.matches(".*\\d.*")) { // Check if the word contains any digit
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "Sum of 12 and 20 and 15 is 47";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
}

