import java.util.Scanner;

public class StringExercises789 {

    // 7️⃣ Substring (without using contains)
    public static int findSubstring(String str, String sub) {
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                return i;
            }
        }
        return -1;
    }

    // 8️⃣ Slices
    public static void printSlices(String word) {
        for (int i = 0; i <= word.length(); i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
    }

    // 9️⃣ Substring occurrences (same index in both strings)
    public static int commonSubstrings(String s1, String s2) {
        int count = 0;
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            for (int j = i + 1; j <= minLength; j++) {
                String sub1 = s1.substring(i, j);
                String sub2 = s2.substring(i, j);

                if (sub1.equals(sub2)) {
                    System.out.println(sub1);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 7️⃣ Test
        System.out.println("Enter main string:");
        String str = scanner.nextLine();

        System.out.println("Enter substring:");
        String sub = scanner.nextLine();

        System.out.println("Index: " + findSubstring(str, sub));

        // 8️⃣ Test
        System.out.println("Enter word for slicing:");
        String word = scanner.nextLine();
        printSlices(word);

        // 9️⃣ Test
        System.out.println("Enter first string:");
        String s1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String s2 = scanner.nextLine();

        int total = commonSubstrings(s1, s2);
        System.out.println("Total common substrings: " + total);

        scanner.close();
    }
}
