import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution2023 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int m1 = Integer.parseInt(in.readLine());
        String str1 = in.readLine();
        StringTokenizer st = new StringTokenizer(str1);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < m1; i++) {
            list1.add(Integer.parseInt(st.nextToken()));
        }
        int m2 = Integer.parseInt(in.readLine());
        String str2 = in.readLine();
        st = new StringTokenizer(str2);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m2; i++) {
            list2.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> res = new ArrayList<>();
        for (Integer o : list1) {
            if (list2.contains(o))
                res.add(o);
        }
        System.out.println(res.size());
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
