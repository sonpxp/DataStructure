import stackandqueue.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    /**
     * - Duyệt lần lượt các string x trong array:
     * - Với mỗi string x sử dụng hàm find hoặc indexOf, để xác định xem có tồn tại trong s hay ko?
     * - Nếu có tồn tại thì nhét vào mảng kết quả
     */

    public static void main(String[] args) {
        String s = "xin chao tat ca moi nguoi";
        String[] arr = {"xin", "tat", "anh", "em", "moi nguoi"};
        countConsistentStrings(s, arr);
    }

    public static List<String> countConsistentStrings(String s, String[] arr) {

        List<String> result = new ArrayList<>();
        int count = 0;
        for (String s1 : arr) {
            if (s.contains(s1)) {
                // count += 1;
                result.add(s1);
            }
        }
        //System.out.println(count);
        System.out.println(result);

        return result;

    }


}
