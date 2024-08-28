package Besic_program;

public class RemoveDuplicateAndSort {
    

        public static void main(String[] args) {
            String[] strings = {"banana", "apple", "orange", "banana", "apple", "grape"};
            String[] result = removeDuplicatesAndSort(strings);
    
            for (String str : result) {
                System.out.println(str);
            }
        }
    
        public static String[] removeDuplicatesAndSort(String[] strings) {
            String[] uniqueStrings = removeDuplicates(strings);
            bubbleSort(uniqueStrings);
            return uniqueStrings;
        }
    
        public static String[] removeDuplicates(String[] strings) {
            int n = strings.length;
            boolean[] isDuplicate = new boolean[n];
            int uniqueCount = 0;
    
            // Mark duplicates
            for (int i = 0; i < n; i++) {
                if (!isDuplicate[i]) {
                    for (int j = i + 1; j < n; j++) {
                        if (strings[i].equals(strings[j])) {
                            isDuplicate[j] = true;
                        }
                    }
                    uniqueCount++;
                }
            }
    
            // Create array of unique elements
            String[] uniqueStrings = new String[uniqueCount];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (!isDuplicate[i]) {
                    uniqueStrings[index++] = strings[i];
                }
            }
    
            return uniqueStrings;
        }
    
        public static void bubbleSort(String[] strings) {
            int n = strings.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (strings[j].compareTo(strings[j + 1]) > 0) {
                        // Swap strings[j] and strings[j + 1]
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                    }
                }
            }
        }
    }
    

