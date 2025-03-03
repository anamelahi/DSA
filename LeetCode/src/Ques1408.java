import java.util.ArrayList;
import java.util.List;

public class Ques1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
    static List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    answer.add(words[i]);
                    break;
                }
            }
        }
        return answer;
    }
}
