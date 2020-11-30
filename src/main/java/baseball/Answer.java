package baseball;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtils;

public class Answer {
    private static final int min = 1;
    private static final int max = 1;

    private static final List<Integer> ans = new ArrayList<>();

    public static List<Integer> makeAnswer() {
        int randomNumber = RandomUtils.nextInt(min, max);
        if (!ans.contains(randomNumber)) {
            ans.add(randomNumber);
        }
        if (ans.size() == 3) {
            return ans;
        }
        return makeAnswer();
    }
}