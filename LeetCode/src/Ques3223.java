//public class Ques3223 {
//    public static void main(String[] args) {
//        String s = "abaacbcbb";
//        System.out.println(minimumLength(s));
//    }
//    static int checkIndex(String s, int index){
//        int length = s.length();
//        int index1 = -1;
//        int index2 = -1;
//        boolean flag = false;
//
//        for (int i = index; i >= 0; i--) {
//            if (s.charAt(i)==s.charAt(index)){
//                if (index+1<length){
//                    for (int j = index+1; j < length; j++) {
//                        if (s.charAt(j)==s.charAt(index+1)){
//                            flag = true;
//                            index2 = j;
//                            break;
//                        }
//                    }
//                }
//                index1 = i;
//                break;
//            }
//        }
//        if (flag){
//            return index2;
//        }
//        return index1;
//    }
//    static int minimumLength(String s) {
//        int length = s.length();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 1; i < length ; i++) {
//            int indexToRemove = checkIndex(s,i);
//            if (i!=indexToRemove){
//                result.append(s.charAt(i));
//            }
//        }
//        return result.length();
//    }
//}
public class Ques3223 {
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLength(s));  // Expected output: 5
    }

    static int minimumLength(String s) {
        // Convert string to a mutable structure (StringBuilder) to modify it
        StringBuilder sb = new StringBuilder(s);

        // Repeat until no deletions can be made
        boolean hasDeleted = true;
        while (hasDeleted) {
            hasDeleted = false;

            // Loop through the string
            for (int i = 1; i < sb.length() - 1; i++) {
                char currentChar = sb.charAt(i);

                // Find the left occurrence of currentChar before index i
                int leftIndex = -1;
                for (int j = 0; j < i; j++) {
                    if (sb.charAt(j) == currentChar) {
                        leftIndex = j;
                        break;
                    }
                }

                // Find the right occurrence of currentChar after index i
                int rightIndex = -1;
                for (int k = i + 1; k < sb.length(); k++) {
                    if (sb.charAt(k) == currentChar) {
                        rightIndex = k;
                        break;
                    }
                }

                // If both left and right occurrences are found, delete the closest ones
                if (leftIndex != -1 && rightIndex != -1) {
                    sb.deleteCharAt(leftIndex);  // Delete the left occurrence
                    sb.deleteCharAt(rightIndex - 1);  // Delete the right occurrence (adjusted index due to previous deletion)
                    hasDeleted = true;
                    break;  // Restart the deletion process after modifying the string
                }
            }
        }

        // The length of the remaining string after all deletions
        return sb.length();
    }
}

