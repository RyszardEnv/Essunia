package org.example.sprint_3.a_26_reverse;

public class Reverse {

    public static char[] reverse(char[] words) {
        if(words.length == 0)
            throw new IllegalArgumentException("Nie możn pustej tablicy");
        for (int i = 0; i <  (words.length + 1) / 2; i++) {
            char temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        int start = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') {
                reverseWord(words, start, i - 1);
                start = i + 1;
            }
        }
        reverseWord(words, start, words.length - 1);

        return words;
    }

    private static void reverseWord(char[] arr, int start, int end) {
        for (int i = start; i < start + (end - start + 1) / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[end - (i - start)];
            arr[end - (i - start)] = temp;
        }
    }
}
