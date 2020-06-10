import java.util.Scanner;

public class Solution2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] mass = new int[a];
        for (int i = 0; i < a; i++) {
            mass[i] = sc.nextInt();
        }
        for (int j = 0; j < 2; j++) {
            int max = maxInd(mass);
            // System.out.println(max);
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] >= max)
                    mass[i] = mass[i] / 2;

            } //System.out.println(Arrays.toString(mass));
        }
        StringBuilder sb = new StringBuilder();
        for (int e : mass) {
            sb.append(e + " ");
        }
        String str = sb.toString();
        str = str.substring(0, str.length() - 1);
        System.out.println(str);
    }

    public static int maxInd(int[] mass) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] >= maxValue) {
                maxValue = mass[i];
            }
        }
        return maxValue;
    }
}
