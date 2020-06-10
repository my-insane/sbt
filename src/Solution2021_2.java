import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution2021_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringTokenizer st2 = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        List<Integer> FirstArray = new ArrayList();
        for (int i = 0; i < N; i++) {
            FirstArray.add(Integer.parseInt(st2.nextToken()));
        }
        int maxVal = 0;
        for (int j = 0; j < 2; j++) {
            maxVal = Collections.max(FirstArray);
            for (int i = 0; i < FirstArray.size(); i++) {
                if (FirstArray.get(i) == maxVal) {
                    FirstArray.set(i, FirstArray.get(i) / 2);
                }
            }
        }
        for (int e : FirstArray) {
            System.out.print(e + " ");
        }
    }
}