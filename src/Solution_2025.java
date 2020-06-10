import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        if (length >= 1 && length <= 100) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            List<Integer> mass = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                mass.add(Integer.parseInt(token.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());

            List<Integer> min = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                token = new StringTokenizer(br.readLine());
                int[] index = new int[2];
                for (int j = 0; j < 2; j++) {
                    index[j] = (Integer.parseInt(token.nextToken()));
                }
                List<Integer> subList = mass.subList(index[0], index[1]);
                min.add(minInt(subList));
            }
        }
    }

    public static int minInt(List<Integer> listInt) {
        int min = Collections.min(listInt);
        return min;
    }
}
