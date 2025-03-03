public class Ques2381 {
    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {
                {0,1,0},
                {1,2,1},
                {0,2,1}
        };
        System.out.println(shiftingLetters(s,shifts));
    }
    static String shiftingLetters(String s, int[][] shifts){
        int[] shiftAmount = new int[s.length() + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            shiftAmount[start] += direction;
            shiftAmount[end + 1] -= direction;
        }

        int shift = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            shift += shiftAmount[i];
            int shiftValue = (chars[i] - 'a' + shift) % 26;
            if (shiftValue < 0) shiftValue += 26;
            chars[i] = (char) ('a' + shiftValue);
        }

        return new String(chars);
    }
}

//MY APPROACH
//    static String shiftingLetters(String s, int[][] shifts) {
//        char[] chars = s.toCharArray();
//
//        for (int i = 0; i < shifts.length; i++) {
//            for (int j = shifts[i][0]; j <= shifts[i][1]; j++) {
//                if (shifts[i][2]==1){
//                    chars[j] = (char) ((chars[j] - 'a' + 1) % 26 + 'a');
//                }else{
//                    chars[j] = (char) ((chars[j] - 'a' - 1 + 26) % 26 + 'a');
//                }
//            }
//        }
//        return new String(chars);
//    }
//}
